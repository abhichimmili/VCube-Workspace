package com.logicalstatements.loops;

import java.util.Scanner;

public class BinaryToDecimal {
	
	static int binToDec(int n) {
		int res=0;
		int pow=0;
		while(n>0) {
			int r=n%10;
			res+=r*(Math.pow(2, pow));
			pow++;
			n=n/10;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter your number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println(binToDec(n));

	}

}
