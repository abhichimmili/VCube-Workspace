package com.exceptionhandling;

import java.util.Scanner;

public class ATMDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 1. Withdraw Amount
		try {
			System.out.println("Enter Withdrawl Amount : ");
			double amount = sc.nextDouble();

			double balance = 10000;
			if (amount > balance) {
				throw new ArithmeticException("Not Sufficient Balance");
			} else if (amount < 0) {
				throw new ArithmeticException("Invalid Amount.");
			}
			balance = balance - amount;

			System.out.println("Withdrawal successful");
			System.out.println("Remaining balance: " + balance);

		} catch (ArithmeticException e) {
			System.out.println("Withdrawl Failed : " + e.getMessage());
		}

		// 2. Convert String to double
		try {
			System.out.println("\nEnter amount as a String : ");
			String amountstring = sc.next();
			double amount = Double.parseDouble(amountstring);
			System.out.println("Converted amount :" + amount);
		} catch (NumberFormatException e) {
			System.out.println("Invalid amount. Please enter a valid number.");
		}

		// 3.Access Transaction History
		try {
			String[] transactions = { "Deposit: 5000", "Withdrawal: 2000", "Deposit: 3000", "Withdrawal: 1000" };
			System.out.println("\n Enter Transaction Index : ");
			int index = sc.nextInt();
			System.out.println("Transaction: " + transactions[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid transaction index.");
		}
		
		//4. Display Account Details
		try {
			String accountholder=null;
			System.out.println("\nAccount Holder: "+ accountholder.toUpperCase());
			
		}catch(NullPointerException e) {
			System.out.println("Account details are not available.");
		}
		
		System.out.println("ATM Operations are done");
		sc.close();
	}

}
