package com.javaintroduction;

public class MethodsParamsDemo {
	
	static void add(double a, double b) {
		System.out.println("static method called");
		System.out.println(a+b);
	}
	void add(int x, int y) {
		System.out.println("instance method called");
		System.out.println(x+y);
	}
	static void add1(int a, int b) {
		System.out.println("static method called");
		System.out.println(a+b);
	}
	void add1(double x, double y) {
		System.out.println("instance method called");
		System.out.println(x+y);
	}
	
	public static void main (String[] args) {
		MethodsParamsDemo t = new MethodsParamsDemo ();
		add(30.9,40.6);
		t.add(3,40.6);
		//add1(30.9,40.6);
		t.add1(30.5,40.6);
		
	}

}
