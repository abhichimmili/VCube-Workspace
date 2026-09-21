package com.logicalstatements.loops;

import java.util.Scanner;

public class NeonNumber {
	static boolean isNeon(int n) {
		int temp=n*n;
		int sum=0;
		while(temp>0) {
			int r= temp%10;
			sum+=r;
			temp=temp/10;
		}
		return sum==n;
	}
	public static void main(String[] args) {
		System.out.println("Enter your number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isNeon(n)) {
			System.out.println(n + " is a Neon Number");
		} else {
			System.out.println(n + " is not a Neon Number");
		}
	}

}
