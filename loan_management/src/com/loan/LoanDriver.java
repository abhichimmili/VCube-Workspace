package com.loan;

import java.util.Scanner;

public class LoanDriver {

	static Loan loan;

	static int loanId = 1001;

	static Scanner scanner = new Scanner(System.in);

	private static void homeLoan() {
		System.out.println();
		System.out.println("----- HOME LOAN -----");

		System.out.print("Customer Name: ");
		String homeCustomer = scanner.nextLine();

		System.out.print("Loan Amount: ");
		double homeAmount = scanner.nextDouble();

		System.out.print("Tenure in years: ");
		int homeTenure = scanner.nextInt();

		System.out.print("Property Value: ");
		double propertyValue = scanner.nextDouble();

		loan = new HomeLoan(loanId++, homeCustomer, homeAmount, homeTenure, propertyValue);
	}

	private static void carLoan() {
		System.out.println();
		System.out.println("----- CAR LOAN -----");

		System.out.print("Customer Name: ");
		String carCustomer = scanner.nextLine();

		System.out.print("Loan Amount: ");
		double carAmount = scanner.nextDouble();

		System.out.print("Tenure in years: ");
		int carTenure = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Car Model: ");
		String carModel = scanner.nextLine();

		System.out.print("Car Price: ");
		double carPrice = scanner.nextDouble();

		loan = new CarLoan(loanId++, carCustomer, carAmount, carTenure, carModel, carPrice);
	}

	private static void personalLoan() {
		System.out.println();
		System.out.println("----- PERSONAL LOAN -----");

		System.out.print("Customer Name: ");
		String personalCustomer = scanner.nextLine();

		System.out.print("Loan Amount: ");
		double personalAmount = scanner.nextDouble();

		System.out.print("Tenure in years: ");
		int personalTenure = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Purpose: ");
		String purpose = scanner.nextLine();

		loan = new PersonalLoan(loanId++, personalCustomer, personalAmount, personalTenure, purpose);
	}

	public static void main(String[] args) {

		while (true) {

			displayOptions();

			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {

			case 1:

				homeLoan();

				break;

			case 2:

				carLoan();

				break;

			case 3:

				personalLoan();

				break;

			case 4:

				eduLoan();

				break;

			case 5:

				System.out.println("Thank you for using Loan Management System.");

				scanner.close();

				return;

			default:

				System.out.println("Invalid choice. Please try again.");

				continue;
			}

			System.out.println();

			displayFinalLoanDetails();
		}
	}

	private static void displayOptions() {
		System.out.println();
		System.out.println("======================================");
		System.out.println("        LOAN MANAGEMENT SYSTEM");
		System.out.println("Welocome to " + Loan.BANK_NAME);
		System.out.println("======================================");

		System.out.println("1. Home Loan");
		System.out.println("2. Car Loan");
		System.out.println("3. Personal Loan");
		System.out.println("4. Education Loan");
		System.out.println("5. Exit");

		System.out.print("Enter your choice: ");
	}

	private static void displayFinalLoanDetails() {
		// Runtime Polymorphism
		loan.applyLoan();

		loan.displayLoanDetails();

		loan.calculateInterest();

		loan.calculateEMI();

		System.out.println();
		System.out.println("Loan processing completed.");
	}

	private static void eduLoan() {
		System.out.println();
		System.out.println("----- EDUCATION LOAN -----");

		System.out.print("Customer Name: ");
		String educationCustomer = scanner.nextLine();

		System.out.print("Loan Amount: ");
		double educationAmount = scanner.nextDouble();

		System.out.print("Tenure in years: ");
		int educationTenure = scanner.nextInt();

		scanner.nextLine();

		System.out.print("Course Name: ");
		String courseName = scanner.nextLine();

		System.out.print("Institution Name: ");
		String institutionName = scanner.nextLine();

		loan = new EducationLoan(loanId++, educationCustomer, educationAmount, educationTenure, courseName,
				institutionName);
	}
}