package com.oops;

abstract class Account{
	abstract void accountInfo();
	static void bankInfo() {
		System.out.println("Account - Bank Info");
	}
	void printMessage() {
		System.out.println("Account - Print Message ");
	}
}
class SavingsAccount extends Account{

	@Override
	void accountInfo() {
		System.out.println("Savings Account - Account Info");
	}
	
}
public class BankAccountDemo {

	public static void main(String[] args) {
		SavingsAccount acc=new SavingsAccount();
		Account acc1=new SavingsAccount();
		Account.bankInfo();
		acc.bankInfo();
		acc1.bankInfo();
		acc.accountInfo();
		acc1.accountInfo();
		acc.printMessage();
		acc1.printMessage();
	}

}
