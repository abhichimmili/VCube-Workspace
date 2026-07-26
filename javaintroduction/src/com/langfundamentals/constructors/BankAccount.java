package com.langfundamentals.constructors;

public class BankAccount {
	
	int accountNumber;
	String holderName;
	double balance;
	
	public BankAccount(int accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public BankAccount(BankAccount obj) {
		this.accountNumber = obj.accountNumber;
		this.holderName= obj.holderName;
		this.balance=obj.balance;
	}
	
	void deposit(int amount) {
		balance+=amount;
	}
	void withdraw(int amount) {
		balance-=amount;
	}
	void display() {
		System.out.println("---------------");
		System.out.println("Account Nuumber : "+accountNumber);
		System.out.println("Holder Name : "+holderName);
		System.out.println("Balance : "+balance);
	}

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(101,"Abhi",20000.00);
		BankAccount dupAcc=new BankAccount(acc);
		dupAcc.deposit(5000);
		acc.display();
		dupAcc.display();

	}

}
