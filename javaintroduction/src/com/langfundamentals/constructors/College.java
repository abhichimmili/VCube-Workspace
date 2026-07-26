package com.langfundamentals.constructors;

public class College {
	String clgName;
	String city;
	int noOfStud;	

	public College() {
		this("Unknown College");
		System.out.println("No arg constructor called");
	}

	public College(String clgName) {
		this(clgName, "Unknown City");
        System.out.println("One-parameter Constructor");
	}

	public College(String clgName, String city) {
		this(clgName,city,0);
		this.city = city;
		System.out.println("Two-Parameter Constructor");
	}

	public College(String clgName, String city, int noOfStud) {
		this.clgName = clgName;
		this.city=city;
		this.noOfStud = noOfStud;
		System.out.println("All arg Constructor");
	}
	
	void displayDetails() {
		System.out.println("---------------");
		System.out.println("College Name : "+clgName);
		System.out.println("College City : "+city);
		System.out.println("No of Students : "+noOfStud);
	}

	public static void main(String[] args) {
		College clg= new College();
		clg.displayDetails();
		
		College c2 = new College("VCube College");
	    c2.displayDetails();
	    
	    College c3 = new College("VCube College", "Hyderabad");
	    c3.displayDetails();

        College c4 = new College("VCube College", "Hyderabad", 2500);
        c4.displayDetails();

	}

}
