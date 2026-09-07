package com.oops;

public class Developer extends Employee {
	void calculateSalary(double bonus) {
		System.out.println("Calaculate Salary with parameter in Child-Developers class");
	}

	void calculateSalary() {
		System.out.println("Calaculate Salary without parameter in Child-Developer class");
	}

	public static void main(String[] args) {
		Developer d= new Developer();
		d.calculateSalary();
		d.calculateSalary(200);
		Employee e= new Employee();
		e.calculateSalary();
		e.calculateSalary(200);
		Employee de =  new Developer();
		de.calculateSalary();
		de.calculateSalary(200);

	}

}
