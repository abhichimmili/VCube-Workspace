package com.logicalstatements.loops;

import java.util.Scanner;

public class HappyNumber {

	static boolean isHappy(int n) {
		int temp = 0;
		int temp1 = n;
		do {
			temp = 0;
			while (temp1 > 0) {
				int r = temp1 % 10;
				temp += r * r;
				temp1 = temp1 / 10;
			}
			temp1 = temp;
		} while (temp != 1 && temp != 4);
		return temp == 1;
	}

	public static void main(String[] args) {
		System.out.println("Enter your number : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (isHappy(n)) {
			System.out.println(n + " is a Happy Number");
		} else {
			System.out.println(n + " is not a Happy Number");
		}
	}

}
