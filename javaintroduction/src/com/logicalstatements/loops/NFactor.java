package com.logicalstatements.loops;

import java.util.Scanner;

public class NFactor {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value to find even number upto : ");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				count++;
				if(count==3) {
					System.out.println(i);
				}
			}
		}

	}

}
