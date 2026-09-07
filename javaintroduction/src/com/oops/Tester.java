package com.oops;

public class Tester extends Employee{
	
	void calculateSalary(double bonus) {
		System.out.println("Calaculate Salary with parameter in Child-Tester class");
	}

	public static void main(String[] args) {
		Tester t = new Tester();
		t.calculateSalary();
		t.calculateSalary(200);

	}

}
