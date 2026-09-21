package com.oops;

abstract class Vehicle1{
	public abstract void start() ;
	public abstract void stop();
}	

class Car1 extends Vehicle1{

	@Override
	public void start() {
		System.out.println("Car start method");
	}

	@Override
	public void stop() {
		System.out.println("Car stop method");
	}
	
}

class Bike extends Vehicle1{

	@Override
	public void start() {
		System.out.println("Bike start method");
	}

	@Override
	public void stop() {
		System.out.println("Bike stop method");
	}
	
}
class Bus extends Vehicle1{

	@Override
	public void start() {
		System.out.println("Bus start method");
	}

	@Override
	public void stop() {
		System.out.println("Bus stop method");
	}
	
}
public class VehicleDriver {

	public static void main(String[] args) {
		Vehicle1 car = new Car1();
		Vehicle1 bike = new Bike();
		Vehicle1 bus = new Bus();
		car.start();
		car.stop();
		bike.start();
		bike.stop();
		bus.start();
		bus.stop();
	}

}
