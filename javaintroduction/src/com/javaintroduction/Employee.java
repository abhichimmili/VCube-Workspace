package com.javaintroduction;

public class Employee {
	//static variables
	static String companyName="V Cube Solutions";
	
	//instance variables
	int emp_id;
	String emp_name;
	int salary;
	String dept;
	
	public static void main(String[] args) {
		Employee abhi = new Employee();
		Employee suji = new Employee();
		Employee sandy = new Employee();
		Employee mouni = new Employee();
		
		System.out.println(companyName+" Empoloyee Details #######");
		abhi.emp_id=101;
		abhi.emp_name="Abhigna";
		abhi.salary=22000;
		abhi.dept="ECE";
		System.out.println("Employee ID : "+ abhi.emp_id +" Name : "+
				abhi.emp_name+" Salary : "+abhi.salary+" Department : "+abhi.dept);
		System.out.println("--------------------------------");
		
		suji.emp_id=102;
		suji.emp_name="Sujitha";
		suji.salary=32000;
		suji.dept="CSE";
		System.out.println("Employee ID : "+ suji.emp_id +" Name : "+
				suji.emp_name+" Salary : "+suji.salary+" Department : "+suji.dept);
		System.out.println("--------------------------------");
		
		sandy.emp_id=103;
		sandy.emp_name="Sandhya";
		sandy.salary=30000;
		sandy.dept="CSE";
		System.out.println("Employee ID : "+ sandy.emp_id +" Name : "+
				sandy.emp_name+" Salary : "+sandy.salary+" Department : "+sandy.dept);
		System.out.println("--------------------------------");
		
		mouni.emp_id=104;
		mouni.emp_name="Mounika";
		mouni.salary=25000;
		mouni.dept="CSE";
		System.out.println("Employee ID : "+mouni.emp_id +" Name : "+
				mouni.emp_name+" Salary : "+mouni.salary+" Department : "+mouni.dept);
		System.out.println("--------------------------------");
		
	}

}
