package com.oops;

class Vehicle {
	 int speed=50;
	 void display() {
		 System.out.println("Vehicle method is displayed.Speed is "+speed);
	 }
	 void start() {
		 System.out.println("Vehivle class start method");
	 }
}

class Car extends Vehicle {
	int speed=100;
	void display() {
		System.out.println("Car method is displayed.Speed is "+speed);
	}
	void drive() {
		System.out.println("Car class drive method");
	}
	
	void start() {
		System.out.println("Car class start method");
	}
}
public class VehicleDriverDemo {

	public static void main(String[] args) {
		Vehicle v = new Car();
		System.out.println( v.speed);
		v.display();
		//v.drive(); CE
		v.start();
		
		Car c= new Car();
		System.out.println( c.speed);
		c.display();
		c.drive();
		c.start();
		
		Vehicle v1=new Vehicle();
		System.out.println( v1.speed);
		v1.display();
		//v1.drive(); CE
		v1.start();
	}

}
