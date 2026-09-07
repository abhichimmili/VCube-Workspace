package com.collections;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
	

	public static void main(String[] args) {
		Collection<Integer> c = new ArrayList<>();
		c.add(10);
		c.add(20);
		c.add(50);
		c.add(70);
		c.add(30);
		c.add(100);
		c.add(40);
		c.add(80);
		c.add(60);
		c.add(90);
		System.out.println(c);
		System.out.println(c.contains(10));
		System.out.println(c);
		System.out.println(c.size());
		System.out.println(c);
		System.out.println(c.remove(20));
		System.out.println(c);
		System.out.println(c.isEmpty());
		System.out.println(c);
		c.clear();
		System.out.println(c);

	}

}
