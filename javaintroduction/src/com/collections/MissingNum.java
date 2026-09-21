package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNum {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
		int sum=0;
		int n=Collections.max(list1)-Collections.min(list1);
		n++;
		int total=(n*(n+1))/2;
		for(Integer i:list1) {
			sum+=i;
		}
		System.out.println(n+" "+ total);
		System.out.println("Missing Number is : "+(total-sum));
	}

}
