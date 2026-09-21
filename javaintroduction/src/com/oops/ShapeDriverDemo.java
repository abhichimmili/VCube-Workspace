package com.oops;

class Shape {
	void area() {
		System.out.println("No-argument method in parent class");
	}
	void area(int a) {
		System.out.println("Single argument method in parent class");
	}
	void area(int l,int b) {
		System.out.println("Two argument method in parent class");
	}
}

class Circle extends Shape{
	
	void area(int a) {
		System.out.println("Single argument method in Child-Circle class");
	}
}

class Rectangle extends Shape{

	void area(int a,int b) {
		System.out.println("Two argument method in Child-Rectangle class");
	}
}
public class ShapeDriverDemo {

	public static void main(String[] args) {
		//Circle
		Shape circle= new Circle();
		circle.area(2);

		Circle circle1= new Circle();
		circle1.area(2);
		
		Shape circle2= new Shape();
		circle2.area(2);
		
		//Rectangle
		Shape rect= new Rectangle();
		rect.area(2,3);

		Rectangle rect1= new Rectangle();
		rect1.area(2,3);
		
		Shape rect2= new Shape();
		rect2.area(2,3);
	}

}
