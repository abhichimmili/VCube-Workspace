package com.oops;

public class Circle extends Shape{
	
	void area(int a) {
		System.out.println("Single argument method in Child-Circle class");
	}

	public static void main(String[] args) {
		Shape circle= new Circle();
		circle.area(2);

		Circle circle1= new Circle();
		circle1.area(2);
		
		Shape circle2= new Shape();
		circle2.area(2);
	}

}
