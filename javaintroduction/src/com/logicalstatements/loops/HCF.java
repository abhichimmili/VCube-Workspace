package com.logicalstatements.loops;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter 2 values: ");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int min=n1>n2?n2:n1;
		int max=n1>n2?n1:n2;
		int hcf=1;
		int lcm1=1;
		for(int i=1;i<=n1&&i<=n2;i++)
		{
			if(n1%i==0&& n2%i==0) {
				hcf=i;
			}
		}
		// Using a Loop (Without HCF)
		while (true) {
	        if (max % n1 == 0 && max % n2 == 0) {
	             System.out.println("LCM = " + max);
	             break;
	            }
	        max++;
	    }
		//
//		for(int i=min ;i>=1;i--) {
//			if(n1%i==0&& n2%i==0) {
//				hcf=i;
//				break;
//			}
//		}
		// Finding lcm Using Repeated Addition
//		int lcm = n1;
//
//		while (lcm % n2 != 0) {
//		    lcm += n1;
//		}
//		System.out.println("LCM = " + lcm);
		int lcm=(n1*n2)/hcf;
		System.out.println("HCF "+hcf);
		System.out.println("LCM "+lcm);
		System.out.println("LCM : "+lcm1);
	}

}
