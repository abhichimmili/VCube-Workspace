package com.logicalstatements;

import java.util.Scanner;




public class Market {

	public static void main(String[] args) {
		System.out.println("Vcube Vegetable / Fruit Market ");

		Scanner sc = new Scanner(System.in);

		String yn = "";
		String yn1 = "";
		double price = 0;
		do {
			System.out.println("Enter a Category : ");
			String catg = sc.next();
			switch (catg) {
			case "veg" -> {
				do {
					System.out.println("Enter the Item : ");
					String item = sc.next();
					double vegPrice = switch (item) {
					case "tmt" -> {
						System.out.println("Tomato - Price: 50 Rs/kg");
						yield 50;
					}
					case "ptt" -> {
						System.out.println("Potato - Price: 40 Rs/kg");
						yield 40;
					}
					case "onn" -> {
						System.out.println("Onion - Price: 30 Rs/kg");
						yield 30;
					}
					case "crt" -> {
						System.out.println("Carrot - Price: 60 Rs/kg");
						yield 60;
					}
					case "btn" -> {
						System.out.println("Beetroot - Price: 45 Rs/kg");
						yield 45;
					}
					case "cab" -> {
						System.out.println("Cabbage - Price: 35 Rs/kg");
						yield 35;
					}
					case "cfl" -> {
						System.out.println("Cauliflower - Price: 55 Rs/kg");
						yield 55;
					}
					case "brn" -> {
						System.out.println("Brinjal - Price: 50 Rs/kg");
						yield 50;
					}
					case "chk" -> {
						System.out.println("Chilli - Price: 80 Rs/kg");
						yield 80;
					}
					case "gin" -> {
						System.out.println("Ginger - Price: 120 Rs/kg");
						yield 120;
					}
					default -> {
						System.out.println("Item Not Available");
						yield 0;
					}
					};
					System.out.println("Enter quantity : ");
					int quantity = sc.nextInt();
					price += vegPrice * quantity;
					System.out.println("Do you want to continue with items: Click Y for Yes N for No ");
					yn1 = sc.next();
				} while (yn1.equalsIgnoreCase("y"));

			}
			case "fru" -> {
				do {
					System.out.println("Enter the Fruit  : ");
					String fruit = sc.next();

					double fruitPrice = switch (fruit) {
					case "apl" -> {
						System.out.println("Apple - Price : 180 Rs/KG");
						yield 180;
					}
					case "ban" -> {
						System.out.println("Banana - Price : 70 Rs/Dozen");
						yield 70;
					}
					case "grp" -> {
						System.out.println("Grapes - Price : 120 Rs/KG");
						yield 120;
					}
					case "wml" -> {
						System.out.println("Watermelon - Price : 30 Rs/KG");
						yield 30;
					}
					case "pap" -> {
						System.out.println("Papaya - Price : 50 Rs/KG");
						yield 50;
					}
					case "pin" -> {
						System.out.println("Pineapple - Price : 80 Rs/Piece");
						yield 80;
					}
					case "gau" -> {
						System.out.println("Guava - Price : 90 Rs/KG");
						yield 90;
					}
					case "pom" -> {
						System.out.println("Pomegranate - Price : 220 Rs/KG");
						yield 220;
					}
					case "chk" -> {
						System.out.println("Chikoo - Price : 90 Rs/KG");
						yield 90;
					}
					case "str" -> {
						System.out.println("Strawberry - Price : 250 Rs/Box");
						yield 250;
					}
					case "kwi" -> {
						System.out.println("Kiwi - Price : 40 Rs/Piece");
						yield 40;
					}
					case "mus" -> {
						System.out.println("Muskmelon - Price : 45 Rs/KG");
						yield 45;
					}
					case "lem" -> {
						System.out.println("Lemon - Price : 60 Rs/Dozen");
						yield 60;
					}
					default -> {
						System.out.println("Fruit Not Available");
						yield 0;
					}
					};
					System.out.println("Enter quantity : ");
					int quantity = sc.nextInt();
					price += fruitPrice * quantity;
					System.out.println("Do you want to continue with items: Click Y for Yes N for No ");
					yn1 = sc.next();
				} while (yn1.equalsIgnoreCase("y"));

			}

			default -> System.out.println("The Entered Category is not available !");

			}
			System.out.println("Do you want to continue with other Categories: Click Y for Yes N for No ");
			yn1= sc.next();
		} while (yn.equalsIgnoreCase("y"));
		System.out.println("Total Bill : "+price);
	}

}
