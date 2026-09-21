package com.collections;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
	

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		
		list1.add(10);
		list1.add(20);
		list1.add(10);
		list1.add(30);
		list1.add(20);
		list1.add(40);
		for(Integer i:list1) {
			if(list2.contains(i)) {
				continue;
			}
			list2.add(i);
		}
		for(Integer i:list2) {
			System.out.print(i+" ");
		}

	}

}
