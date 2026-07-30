package com.logicalstatements;

public class Test {
	static int i=0;
	static void display(int val) {
		val--;
		if(val<=0) {
			return;
		}
		display(val);
		System.out.print(val+" ");
	}

	public static void main(String[] args) {
		display(10);

	}

}
