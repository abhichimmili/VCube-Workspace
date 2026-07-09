package com.langfundamentals;

public class StudentDetails {
	String studentName;
	int _age;
	double $salary;
	int rollNumber123;
	public static void main(String[] args) {
		StudentDetails abhi = new StudentDetails();
		abhi.studentName = "Abhi";
		abhi._age = 21;
		abhi.$salary = 20000;
		abhi.rollNumber123 = 78;
		System.out.println("Student Name: "+abhi.studentName);
		System.out.println("Age: "+abhi._age);
		System.out.println("Salary: "+abhi.$salary);
		System.out.println("Roll Number: "+abhi.rollNumber123);
		//StudentDetails ab=5;
		//class Test=1;
	}
}
