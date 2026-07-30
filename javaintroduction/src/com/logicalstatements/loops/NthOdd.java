package com.logicalstatements.loops;

import java.util.Scanner;

public class NthOdd {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter nth value to get nth odd number : ");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;count<n;i++) {
			if(i%2==1) {
				count++;
				if(count==n)
					System.out.println(i);
			}
		}
	}

}
