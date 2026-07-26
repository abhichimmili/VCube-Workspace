package com.langfundamentals.constructors;

public class Car {
	 String model;
	 String brand;
	 double price;
	 String color;
	 double milage;
	 
	 public Car(){
		 
	 }
	 
	 

	public Car(String model, String brand, double price, double milage) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.milage = milage;
	}

	public Car(String model, String brand, double price, String color, double milage) {
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.milage = milage;
	}
	
	void displayDetails() {
		System.out.println("********Car Info**********");
		System.out.println("Car Modal : "+model);
		System.out.println("Car brand : "+brand);
		System.out.println("Car price : "+price);
		System.out.println("Car color : "+color);
		System.out.println("Car milage : "+milage);
		System.out.println("**************************");
	}



	public static void main(String[] args) {
		Car car1 = new Car("Creta", "Hyundai", 1200000, "White", 17.5);
	    Car car2 = new Car("Swift", "Maruti Suzuki", 800000, "Red", 22.0);
	    Car car3 = new Car("City", "Honda", 1500000, "Black", 18.4);

	    car1.displayDetails();
	    car2.displayDetails();
	    car3.displayDetails();

	}

	public Car(String model, String brand, String color) {
		super();
		this.model = model;
		this.brand = brand;
		this.color = color;
	}

}
