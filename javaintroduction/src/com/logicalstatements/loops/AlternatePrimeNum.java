package com.logicalstatements.loops;

public class AlternatePrimeNum {
	
	static boolean isPrime(int n) {
		if(n==0||n==1) {
			return false;
		}
		for(int i =2;i<n;i++) {
			if(n%i==0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int count=0;
		int n=100;
		for(int i=1;i<=100;i++){
			if(isPrime(i)) {
				count++;
				if(count%2==0) {
					System.out.println(i+" ");
				}
			}
		}

	}

}
