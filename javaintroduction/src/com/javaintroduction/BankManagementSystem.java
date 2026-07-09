package com.javaintroduction;

public class BankManagementSystem {
	static int acc_no_gen = 1000;
	int acc_no;
	String cust_name;
	int balance;
	
	{
		acc_no_gen++;
		acc_no = acc_no_gen;
	}
	void display() {
		System.out.println("Account Number: "+acc_no+"\nCustomer Name : "+cust_name+ "\nBalance : "+balance);
		System.out.println("-----------------------------");
	}
	public static void main(String[] args) {
		BankManagementSystem cust1 = new BankManagementSystem();
		cust1.cust_name ="Abhi";
		cust1.balance= 300;
		cust1.display();
		BankManagementSystem cust2 = new BankManagementSystem();
		cust2.cust_name ="Sujitha";
		cust2.balance= 400;
		cust2.display();
		BankManagementSystem cust3 = new BankManagementSystem();
		cust3.display();
	}

}
