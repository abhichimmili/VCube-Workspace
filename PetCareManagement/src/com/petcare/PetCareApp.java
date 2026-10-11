package com.petcare;

import java.util.List;
import java.util.Scanner;

public class PetCareApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PetDAO dao = new PetDAO();

        while (true) {

            System.out.println("\n===== PET CARE MANAGEMENT =====");
            System.out.println("1. Add Pet");
            System.out.println("2. View All Pets");
            System.out.println("3. Search Pet by ID");
            System.out.println("4. Update Pet");
            System.out.println("5. Delete Pet");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice;

            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
                continue;
            }

            switch (choice) {

                case 1 -> {

                    System.out.print("Pet Name: ");
                    String name = sc.nextLine();

                    System.out.print("Species: ");
                    String species = sc.nextLine();

                    System.out.print("Breed: ");
                    String breed = sc.nextLine();

                    System.out.print("Age: ");
                    int age = Integer.parseInt(sc.nextLine());

                    System.out.print("Owner Name: ");
                    String owner = sc.nextLine();

                    System.out.print("Owner Phone: ");
                    String phone = sc.nextLine();

                    System.out.print("Health Status: ");
                    String health = sc.nextLine();

                    Pet pet = new Pet(
                            name, species, breed, age,
                            owner, phone, health
                    );

                    if (dao.addPet(pet)) {
                        System.out.println("Pet added successfully!");
                    } else {
                        System.out.println("Failed to add pet.");
                    }
                }

                case 2 -> {

                    List<Pet> pets = dao.getAllPets();

                    if (pets.isEmpty()) {
                        System.out.println("No pets found.");
                    } else {
                        pets.forEach(System.out::println);
                    }
                }

                case 3 -> {

                    System.out.print("Enter Pet ID: ");
                    int id = Integer.parseInt(sc.nextLine());

                    Pet pet = dao.getPetById(id);

                    if (pet != null) {
                        System.out.println(pet);
                    } else {
                        System.out.println("Pet not found.");
                    }
                }

                case 4 -> {

                    System.out.print("Enter Pet ID to update: ");
                    int id = Integer.parseInt(sc.nextLine());

                    Pet existing = dao.getPetById(id);

                    if (existing == null) {
                        System.out.println("Pet not found.");
                        break;
                    }

                    System.out.print("New Pet Name: ");
                    existing.setPetName(sc.nextLine());

                    System.out.print("New Species: ");
                    existing.setSpecies(sc.nextLine());

                    System.out.print("New Breed: ");
                    existing.setBreed(sc.nextLine());

                    System.out.print("New Age: ");
                    existing.setAge(Integer.parseInt(sc.nextLine()));

                    System.out.print("New Owner Name: ");
                    existing.setOwnerName(sc.nextLine());

                    System.out.print("New Owner Phone: ");
                    existing.setOwnerPhone(sc.nextLine());

                    System.out.print("New Health Status: ");
                    existing.setHealthStatus(sc.nextLine());

                    if (dao.updatePet(existing)) {
                        System.out.println("Pet updated successfully!");
                    } else {
                        System.out.println("Failed to update pet.");
                    }
                }

                case 5 -> {

                    System.out.print("Enter Pet ID to delete: ");
                    int id = Integer.parseInt(sc.nextLine());

                    if (dao.deletePet(id)) {
                        System.out.println("Pet deleted successfully!");
                    } else {
                        System.out.println("Pet not found or deletion failed.");
                    }
                }

                case 6 -> {
                    System.out.println("Thank you for using Pet Care Management!");
                    sc.close();
                    return;
                }

                default -> System.out.println("Invalid choice.");
            }
        }
    }
}