package com.langfundamentals;

import java.util.Scanner;

//4. Methods with return type and with arguments
public class TestDemo4 {
	int squareNumber(int number) {
		return number * number;
	}
	double areaOfTriangle(double base, double height) {
		return 0.5*base*height;
	}
	double areaOfSquare(double side) {
		return side*side;
	}
	double areaOfCircle(double radius) {
		return Math.PI*radius*radius;
	}
	double areaOfRectangle(double length,double breadth) {
		return length*breadth;
	}
	public static void main(String[] args) {
		TestDemo4 t = new TestDemo4();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to find the square : ");
		int num = sc.nextInt();
		System.out.println("Enter base of the triangle : ");
		double b = sc.nextInt();
		System.out.println("Enter height of the triangle : ");
		double h = sc.nextInt();
		System.out.println("Enter side of the square : ");
		double s= sc.nextInt();
		System.out.println("Enter the radius of the circle :");
		double r = sc.nextInt();
		System.out.println("Enter length of the Rectangle : ");
		double l = sc.nextInt();
		System.out.println("Enter breadth of the Rectangle : ");
		double w = sc.nextInt();
		
		System.out.println("Sqaure Number of "+num +" is : "+t.squareNumber(num));
		System.out.println("Area of the triangle having base "+b+" and height "+h+" is : "+t.areaOfTriangle(b, h));
		System.out.println("Area of the Square with side "+s+" is : "+t.areaOfSquare(s));
		System.out.println("Area of the circle with radius "+r+" is : "+t.areaOfCircle(r));
		System.out.println("Area of the rectangle with length "+l+" and breadth "+w+" is : "+t.areaOfRectangle(l,w));
	}

}
