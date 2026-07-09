package com.javaintroduction;

public class Chocolate {

	public static void main(String[] args) {
		int money = 378;
		int cost = 18;
		int chocolates=money/cost;
		int freechocos=chocolates/5;
		int totalchocos=chocolates+freechocos;
		
		System.out.println("Chocolates I can purchase for "+money+" rupees are "+chocolates);
		System.out.println("Free Chocolates If I purchase for "+money+" rupees are "+freechocos);
		System.out.println("Total No.of Chocolates "+totalchocos);
		

	}

}
