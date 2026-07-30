package com.logicalstatements;

import java.util.Scanner;

public class ATM {
	
	int PIN;
	double balance;
	double limit;
	double dailyLimit=10000;
	int checkbalanceLimit=2;
	int countCheckBal=0;
	
	boolean checkPIN(int pin){
		if(pin==PIN) {
			return true;
		}
		return false;
	}
	void withdraw(double amount) {
		if(limit<dailyLimit ) {
			if(amount<=balance) {
				limit+=amount;
				balance=balance-amount;
				System.out.println("Transaction Success. Amount Deducted.");
			}else {
				System.out.println("Insufficient Balance");
			}
		}else {
			System.out.println("Limit exceed for today !!");
		}
		
	}
	void checkBalance(){
		if(countCheckBal<=checkbalanceLimit) {
			System.out.println("Your Balance is : "+balance);
		}else {
			System.out.println("Limit Exceeded");
		}
		countCheckBal++;
	}
	public static void main(String[] args) {
		ATM acc = new ATM();
		acc.PIN=1234;
		acc.balance=30000;
		Scanner sc = new Scanner(System.in);		

		System.out.println("Enter your pin:");
		int pin=sc.nextInt();
		if(acc.checkPIN(pin)) {
			System.out.println("------------------");
			System.out.println("1.Withdraw Amount");
			System.out.println("2.Check Balance");
			System.out.println("3.EXIT");
			int condition=0;
			do {
				System.out.println("===================");
				System.out.println("Enter your choice: ");
				condition=sc.nextInt();
				switch(condition) {
				  case 1:
					  System.out.println("Enter amount: ");
					  double amount=sc.nextDouble();
					  acc.withdraw(amount);
					  break;
				  case 2:
					  acc.checkBalance();
					  break;
				  case 3: 
					  System.out.println("Exiting.....");
					  break;
				  default:
					  System.out.println("Invalid choice. Choose again!");
					  condition=sc.nextInt();  
				}
			
			}while(condition!=3);
		}else {
			System.out.println("Incorrect PIN");
		}
		System.out.println("Thank You !!");

	}

}
