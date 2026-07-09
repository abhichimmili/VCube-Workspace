package com.langfundamentals;

public class StudentResultAnalyzer {
	
	static int totalSum=0;
	static double totalMarks=500;
	
	int calculateTotal(int m1,int m2,int m3,int m4,int m5) {
		totalSum=m1+m2+m3+m4+m5;
		return totalSum;
		
	}
	double calculatePercentage() {
		return (totalSum/totalMarks)*100;
		
	}
	double calculateAverage() {
		return totalSum/5;
		
	}

	public static void main(String[] args) {
		StudentResultAnalyzer abhi = new StudentResultAnalyzer();
		System.out.println("Total Sum : "+abhi.calculateTotal(70,60,78,89,45));
		System.out.println("Percentage : "+abhi.calculatePercentage());
		System.out.println("Average : "+abhi.calculateAverage());

	}

}
