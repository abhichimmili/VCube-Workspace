package com.oops;

class Student1 {
	void calculateGrade() {
		System.out.println("Student class Grade Calculation");
	}

}

class EngineeringStudent extends Student1{
	void calculateGrade() {
		
	}
}

class ManagementStudent extends Student1 {
	
	void calculateGrade() {
		
	}
}

class MedicalStudent extends Student1{
	
	void calculateGrade() {
		
	}
}
public class StudenDriver {

	public static void main(String[] args) {
		Student1 es=new EngineeringStudent();
		Student1 ms=new ManagementStudent();
		Student1 mes=new MedicalStudent();
	}

}
