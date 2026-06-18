package com.javaintroduction;

// explains LIFO concept
public class MethodChainingDemo {

	public void instanceM1() {
		System.out.println("Instance Method1 Started");
		instanceM2();
		System.out.println("Instance Method1 Ended");

	}

	public void instanceM2() {
		System.out.println("Instance Method2 Started");
		instanceM3();
		System.out.println("Instance Method2 Ended");
	}

	public void instanceM3() {
		System.out.println("Instance Method3 Started");
		staticM1();
		System.out.println("Instance Method3 Ended");
	}

	public static void staticM1() {
		System.out.println("Static Method1 Started");
		staticM2();
		System.out.println("Static Method1 Ended");

	}

	public static void staticM2() {
		System.out.println("Static Method2 Started");
		staticM3();
		System.out.println("Static Method2 Ended");

	}

	public static void staticM3() {
		System.out.println("Static Method3 Started");
		System.out.println("Static Method3 Ended");

	}

	public static void main(String[] args) {
		MethodChainingDemo t = new MethodChainingDemo();
		t.instanceM1();
	}

}
