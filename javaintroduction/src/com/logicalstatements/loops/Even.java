package com.logicalstatements.loops;

import java.util.Scanner;

public class Even {
	
	static void evenNo(int n){
		if(n<0) return ;
		if(n%2==0) {
			evenNo(n-2);
			System.out.print(n+" ");
		}else {
			evenNo(n-1);
		}	
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value to find even number upto : ");
		int n=sc.nextInt();
		evenNo(n);
		System.out.println();
		for(int i=0;i<=n;i=i+2) {
			System.out.print(i+" ");
		}
	}

}
