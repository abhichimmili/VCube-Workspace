package com.operators;

import java.util.Scanner;

public class TestOpEx {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter your grades for 5 subjects:");
		int marks1=sc.nextInt();
		int marks2=sc.nextInt();
		int marks3=sc.nextInt();
		int marks4=sc.nextInt();
		int marks5=sc.nextInt();
		double percentage=(marks1+marks2+marks3+marks4+marks5)/5.0;
		char grade;
		if(percentage<0 && percentage>100) {
			System.out.println("Invalid Marks");
		}else {
			grade=percentage>=90?'A':percentage>=75?'B':percentage>=60?'C':percentage>=40?'D':'F';
			System.out.println(grade);
		}
//		}else if(percentage>=90) {
//			grade='A';
//			System.out.println("Grade A");
//		}else if(percentage>=75) {
//			grade='B';
//			System.out.println("Grade B");
//		}else if(percentage>=60) {
//			grade='C';
//			System.out.println("Grade C");
//		}else if(percentage>=40) {
//			grade='D';
//			System.out.println("Grade D");
//		}else {
//			grade='F';
//			System.out.println("Failed");
//		}

		System.out.println(percentage);
		
		int s1=43;
		int s2=23;
		int s3=12;
		if(s1*s1+s2*s2>s3*s3) {
			System.out.println("Valid triangle sides");
		}else {
			System.out.println("Invalid to be a triangle");
		}
		
		sc.close();
	}

}
