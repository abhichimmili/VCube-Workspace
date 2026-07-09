package com.javaintroduction;

public class DataTypesDemo {
	
	int a,b;
	float x, y;
	double m, n;
	{
		a=58; b=45;
		x=58.8f; y=45.6f;
		m=58.83; n= 45.67;
		
	}
	
	int addition(int a, int b) {
		int sum=a+b;
		return  sum;
	}
	float addition(float a, float b) {
		float sum=a+b;
		return  sum;
	}
	double addition(double a, double b) {
		double sum=a+b;
		return  sum;
	}

	public static void main(String[] args) {
		DataTypesDemo obj = new DataTypesDemo();
		System.out.println(obj.addition(obj.a,obj.b));
		System.out.println(obj.addition(obj.x, obj.y));
		System.out.println(obj.addition(obj.m,obj.n));
		
	}

}
