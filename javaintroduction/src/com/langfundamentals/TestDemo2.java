package com.langfundamentals;

import java.util.Scanner;


//2.Method with no return type and with arguments
public class TestDemo2 {

	public static void main(String[] args) {

//		In Java, If we want to create an Object, we need a Constructor.
//		The Below class object created with the help of default constructor.
		TestDemo2 t = new TestDemo2();

//		The below class Object created with the help of No-arg constructor
		String s = new String();

//		Here, Java compiler will not create default constructor, if the class contains any other constructor.
//		So, Here we must need to pass expected values for Constructor. 
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Name  : ");
		String fname = sc.nextLine();

		System.out.println("Enter Last Name : ");
		String lname = sc.nextLine();

		System.out.println("Enter age : ");
		int age = sc.nextInt();

		System.out.println("Enter Height");
		float height = sc.nextFloat();

		System.out.println("Enter a City");
		sc.nextLine();
		String city = sc.nextLine();
		

		System.out.println("Enter Weight ");
		double weight = sc.nextDouble();
		
		System.out.println("Enter a Color");
		sc.nextLine();
		String color = sc.nextLine();

		// Call by value
		t.getName(fname, lname);
		t.getAge(age);
		t.getHeight(height);
		t.getWeight(weight);
		t.cityInfo(city);
		t.getColor(color);

	}

	void cityInfo(String city) {
		System.out.println("City Info : " + city);
	}

	void getHeight(float height) {
		System.out.println("The Height is : " + height);
	}

	void getWeight(double weight) {
		System.out.println("The Weight is : " + weight);
	}

	void getAge(int age) {
		System.out.println("AGE is  :" + age);
	}

	void getName(String fname, String lname) {
		System.out.println("Full name is : " + fname + " " + lname);
	}
	void getColor(String color) {
		System.out.println("Favourite Color is : " + color);
	}

	
}