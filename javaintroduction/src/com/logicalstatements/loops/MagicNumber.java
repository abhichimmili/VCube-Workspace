package com.logicalstatements.loops;

import java.util.Scanner;

public class MagicNumber {
	
	static boolean isMagicNumber(int n) {
		int num=n;
		int res;
		
		do {
			res=0;
			while(num>0) {
				int r=num%10;
				res+=r;
				num=num/10;
			}
			num=res;
		}
		while(num>9);
		if(res==1)
			return true;
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number to check whether it is magic number : ");
		int n=sc.nextInt();
		if(isMagicNumber(n))
			System.out.println(n+" is a Magic Number");
		else
			System.out.println(n+" is not a Magic Number");

	}

}
