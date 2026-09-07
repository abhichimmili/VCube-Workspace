package com.oops;

public class Manager extends Employee{

	void calculateSalary(double bonus) {
		System.out.println("Calaculate Salary with parameter in Child-Manager class");
	}

	public static void main(String[] args) {
		Manager m = new Manager();
		m.calculateSalary();
		m.calculateSalary(2009);
	}

}
