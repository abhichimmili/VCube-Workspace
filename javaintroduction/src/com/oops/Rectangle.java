package com.oops;

public class Rectangle extends Shape{

	void area(int a,int b) {
		System.out.println("Two argument method in Child-Rectangle class");
	}

	public static void main(String[] args) {
		Shape rect= new Rectangle();
		rect.area(2,3);

		Rectangle rect1= new Rectangle();
		rect1.area(2,3);
		
		Shape rect2= new Shape();
		rect2.area(2,3);
	}

}
