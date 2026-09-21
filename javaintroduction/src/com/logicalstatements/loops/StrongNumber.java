package com.logicalstatements.loops;

import java.util.Scanner;

public class StrongNumber {
	///digit factorial sum equals to given number
	static boolean isStrong(int n) {
		int sum=0;
		int temp=n;
		while(temp>0) {
			int r= temp%10;
			sum+=fact(r);
			temp=temp/10;
		}
		return sum==n;
	}
	
	static int fact(int n) {
		int res=1;
		for(int i=n;i>0;i--) {
			res=res*i;
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println("Enter your number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isStrong(n)) {
			System.out.println(n + " is a Strong Number");
		} else {
			System.out.println(n + " is not a Strong Number");
		}

	}

}
