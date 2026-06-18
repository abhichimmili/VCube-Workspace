package com.javaintroduction;

public class LIFODemo {
	static LIFODemo t = new LIFODemo();
	static void method1() {
		System.out.println("static method1 called");
		method2();
		System.out.println("static method1 ended");
	}
	static void method2() {
		System.out.println("static method2 called");
		t.method3();
		System.out.println("static method2 ended");
	}
	void method3() {
		System.out.println("instance method3 called");
		method4(); //instance method can be called without using object inside instance method
		System.out.println("instance method3 ended");
	}
	void method4() {
		System.out.println("instance method4 called");
		System.out.println("instance method4 ended");
	}
	public static void main (String[] args) {
		System.out.println("main method started");
		method1();
		System.out.println("main method ended");
	}
}
