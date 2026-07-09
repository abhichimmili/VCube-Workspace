package com.langfundamentals;

public class StudInfoSystem {
	int rollNum;
	String studName;
	byte age;
	char gender;
	char section;
	byte englishMarks;
	byte teluguMarks;
	byte mathsMarks;
	byte javaMarks;
	byte sqlMarks;
	float percentage;
	boolean passedStatus;
	char grade;
	
	void display() {
		System.out.println("Roll Number : "+rollNum);
		System.out.println("Student Name : "+studName);
		System.out.println("Age : "+age);
		System.out.println("Gender :"+section);
		System.out.println("English Marks : "+englishMarks);
		System.out.println("Telugu Marks : "+teluguMarks);
		System.out.println("Maths Marks : "+mathsMarks);
		System.out.println("Java Marks : "+javaMarks);
		System.out.println("SQL Marks : "+sqlMarks);
		System.out.println("Percentage : "+percentage);
		System.out.println("Passed Status :"+passedStatus);
		System.out.println("Grade :"+grade);
		
	}
	
	public static void main(String[] args) {
		StudInfoSystem abhi = new StudInfoSystem();
		abhi.display();
	}

}
