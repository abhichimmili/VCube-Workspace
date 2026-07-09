package com.langfundamentals;


public class WrapperClassDataTypes {
	Integer empNo=101;
	String eName="Abhi";
	Double monthlySalary=5000.00;
	String hireDate="01-06-2026";
	Integer experience=3;
	double annualSalary;
	double annualBonusPercentage=0.1;
	double annualBonus;
	double totalAnnualEarnings;
	
	{	
		calculate();
		display();
	}
	void calculate() {
		annualSalary = monthlySalary*12;
		annualBonus=annualSalary*annualBonusPercentage;
		totalAnnualEarnings=annualSalary+annualBonus;
	}
	void display() {
		System.out.println("****************************************");
		System.out.println("Employee Id : "+empNo);
		System.out.println("Name : "+eName);
		System.out.println("Hire Date : "+hireDate);
		System.out.println("Experience : "+experience);
		System.out.println("Annual Earnings : "+totalAnnualEarnings);
	}
	public static void main(String[] args) {
		new WrapperClassDataTypes();

	}

}
