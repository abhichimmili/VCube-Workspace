package com.langfundamentals;

import java.util.Scanner;

public class ElectricityBill {
	
	void calculateBill() {
		int fixedRate=5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		String name = sc.nextLine();
		System.out.println("Enter No.of electricity units consumed : ");
		int unitsConsumed=sc.nextInt();
		double totalBill = unitsConsumed * fixedRate ;
		System.out.println("---Electricity Bill---");
		System.out.println("Customer Name : "+name);
		System.out.println("Units Consumed : "+unitsConsumed);
		System.out.println("Total Bill : "+totalBill);
	}

	public static void main(String[] args) {
		ElectricityBill bill = new ElectricityBill();
		bill.calculateBill();
	}

}
