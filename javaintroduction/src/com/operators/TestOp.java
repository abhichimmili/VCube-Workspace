package com.operators;

public class TestOp {

	public static void main(String[] args) {
		int num=367;
		if(num>100 && num<999) {
			System.out.println("Number "+num+" is between 100 and 999");
		}
		int a=46;
		int b=32;
		System.out.println(a+ "<< 2 : "+ (a<<1)+" Multiplication with 2");
		System.out.println(b+ ">> b : "+ (b>>1)+" Division with 2");
		int x=79;
		int y=70;
		int z=92;
		int smaller=(x<y)?(x<z)?x:y :(y<z)?y:z;
		System.out.println("Smallest among "+x+" , "+y+" , "+z+" is :"+smaller);
		
		if(num%2==0) {
			System.out.println("Even number "+num);
		}
		else {
			System.out.println("Odd number "+num);
		}
	}

}
