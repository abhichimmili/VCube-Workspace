package com.javaintroduction;

public class Car {
	String carname;
	int carno;
	String brand;

	void main() {
		Car c = new Car();
		c.carname = "BMW";
		c.carno = 1000;
		c.brand = "KIA";
		System.out.println("Car Name:" + c.carname + ", Car Number:" + c.carno + ", Car Brand:" + c.brand);
	}
}
