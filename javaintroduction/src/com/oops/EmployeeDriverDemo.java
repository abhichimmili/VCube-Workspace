package com.oops;

class Employee {
	void calculateSalary(double bonus) {
		System.out.println("Calaculate Salary with parameter in Parent class");
	}

	void calculateSalary() {
		System.out.println("Calaculate Salary without parameter in Parent class");
	}

}
class Developer extends Employee {
	void calculateSalary(double bonus) {
		System.out.println("Calaculate Salary with parameter in Child-Developers class");
	}

	void calculateSalary() {
		System.out.println("Calaculate Salary without parameter in Child-Developer class");
	}
}

class Tester extends Employee{
	
	void calculateSalary(double bonus) {
		System.out.println("Calaculate Salary with parameter in Child-Tester class");
	}
}

class Manager extends Employee{

	void calculateSalary(double bonus) {
		System.out.println("Calaculate Salary with parameter in Child-Manager class");
	}
}

public class EmployeeDriverDemo {

	public static void main(String[] args) {
		//Developer
		Developer d= new Developer();
		d.calculateSalary();
		d.calculateSalary(200);
		Employee e= new Employee();
		e.calculateSalary();
		e.calculateSalary(200);
		Employee de =  new Developer();
		de.calculateSalary();
		de.calculateSalary(200);
		
		//Tester
		Tester t = new Tester();
		t.calculateSalary();
		t.calculateSalary(200);
		
		//Manager
		Manager m = new Manager();
		m.calculateSalary();
		m.calculateSalary(2009);
	}

}
