package com.collections;

import java.util.ArrayList;
import java.util.List;

import com.logicalstatements.loops.AlternatePrimeNum;

public class ArrayListDemo {

	public static void main(String[] args) {
		List<Integer> l1 = new ArrayList<>();
		l1.add(10);
		l1.add(23);
		l1.add(51);
		l1.add(75);
		l1.add(37);
		l1.add(100);
		l1.add(40);
		l1.add(80);
		l1.add(69);
		l1.add(90);
		for(Integer i :l1) {
			if(i%2==0) {
				System.out.print(i+" ");
			}	
		}
		System.out.println();
		for(Integer i :l1) {
			if(AlternatePrimeNum.isPrime(i)) {
				System.out.print(i+" ");
			}	
		}

	}

}
