package com.logicalstatements.loops;

import java.util.Scanner;

public class FirstLastDigitSwap {
	//123%100 4
	//4*100+23=423*10+1=4231
	static int usingLoop(int n) {
		int res=0;
		int temp=n/10;
		int last=n%10,first=0;
		int count=0;
		while(n>10) {
			n=n/10;
			count++;
		}
		first=n;
		res=last;
		int d=(int)(Math.pow(10,count-1));
		int middle=temp%d;
		res=res*d+middle;
		res=res*10+first;
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		System.out.println(usingLoop(n));

	}

}
