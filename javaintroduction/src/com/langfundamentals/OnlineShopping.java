package com.langfundamentals;

public class OnlineShopping {

	public static void main(String[] args) {
		int orderAmount=500;
		if(orderAmount>=499) {
			System.out.println("Your order is eligible for Free delivery");
		}
		else {
			System.out.println("Not eligible for Free delivery");
		}
	}

}

class CollegeAdmission{
	public static void main(String[] args) {
		int percentage=80;
		if(percentage >=75) {
			System.out.println("Eligible for Admission");
		}else {
			System.out.println("Not Eligible for Admission");
		}
	}
}

class Movieticket{
	public static void main(String[] args) {
		int age= 14;
		if(age>=12) {
			System.out.println("Qualifies to get the ticket");
		}else {
			System.out.println("Not Qualified to get the ticket");
		}
	}
}

class BankAccount{
	public static void main(String[] args) {
		int amount= 1000;
		if(amount>=1000) {
			System.out.println("Your account balance meets the requirement");
		}else {
			System.out.println("Mininum 1000 rupees is required.");
		}
	}
}
