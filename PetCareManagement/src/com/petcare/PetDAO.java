package com.petcare;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PetDAO {

	// Add a new Pet
	public boolean addPet(Pet pet) {

		String sql = "INSERT INTO pets (pet_name, species, breed, age, owner_name, owner_phone, health_status) VALUES (?, ?, ?, ?, ?, ?, ?) ";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {

			ps.setString(1, pet.getPetName());
			ps.setString(2, pet.getSpecies());
			ps.setString(3, pet.getBreed());
			ps.setInt(4, pet.getAge());
			ps.setString(5, pet.getOwnerName());
			ps.setString(6, pet.getOwnerPhone());
			ps.setString(7, pet.getHealthStatus());
			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			System.out.println("Error adding pet: " + e.getMessage());
			return false;
		}
	}

	// Display all pets
	public List<Pet> getAllPets() {
		List<Pet> pets = new ArrayList<>();
		String sql = "SELECT * FROM pets";
		try (Connection con = DBConnection.getConnection();
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery()) {

			while (rs.next()) {
				Pet pet = new Pet();

				pet.setPetId(rs.getInt("pet_id"));
				pet.setPetName(rs.getString("pet_name"));
				pet.setSpecies(rs.getString("species"));
				pet.setBreed(rs.getString("breed"));
				pet.setAge(rs.getInt("age"));
				pet.setOwnerName(rs.getString("owner_name"));
				pet.setOwnerPhone(rs.getString("owner_phone"));
				pet.setHealthStatus(rs.getString("health_status"));

				pets.add(pet);

			}

		} catch (SQLException e) {
			System.out.println("Error retrieving pets: " + e.getMessage());
		}

		return pets;
	}

	// Search pet by Id
	public Pet getPetById(int id) {
		String sql = "SELECT * FROM pets WHERE pet_id=?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setInt(0, id);
			try (ResultSet rs = ps.executeQuery()) {
				Pet pet = new Pet();

				pet.setPetId(rs.getInt("pet_id"));
				pet.setPetName(rs.getString("pet_name"));
				pet.setSpecies(rs.getString("species"));
				pet.setBreed(rs.getString("breed"));
				pet.setAge(rs.getInt("age"));
				pet.setOwnerName(rs.getString("owner_name"));
				pet.setOwnerPhone(rs.getString("owner_phone"));
				pet.setHealthStatus(rs.getString("health_status"));

				return pet;

			}

		} catch (SQLException e) {
			System.out.println("Error searching pet: " + e.getMessage());
		}

		return null;
	}

	// Update Pet Details
	public boolean updatePet(Pet pet) {
		String sql = " UPDATE pets SET pet_name = ?, species = ?, breed = ?, age = ?, owner_name = ?, owner_phone = ?, health_status = ? WHERE pet_id = ? ";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setString(1, pet.getPetName());
			ps.setString(2, pet.getSpecies());
			ps.setString(3, pet.getBreed());
			ps.setInt(4, pet.getAge());
			ps.setString(5, pet.getOwnerName());
			ps.setString(6, pet.getOwnerPhone());
			ps.setString(7, pet.getHealthStatus());
			ps.setInt(8, pet.getPetId());
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			System.out.println("Error updating pet: " + e.getMessage());
			return false;
		}

	}

	// Delete a Pet by Id
	public boolean deletePet(int id) {
		String sql = "DELETE FROM pets WHERE pet_id=?";
		try (Connection con = DBConnection.getConnection(); PreparedStatement ps = con.prepareStatement(sql);) {
			ps.setInt(0, id);

			return ps.executeUpdate() > 0;

		} catch (SQLException e) {
			System.out.println("Error deleting pet: " + e.getMessage());
			return false;
		}
	}

}
