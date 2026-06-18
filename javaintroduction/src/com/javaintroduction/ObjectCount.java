package com.javaintroduction;

public class ObjectCount {
	static int count = 0;
	
	void main(String args[]) {
		System.out.println("main method started");
		ObjectCount obj1 = new ObjectCount();
		ObjectCount obj2 = new ObjectCount();
		System.out.println(count);
	}
	{
		count++;
		System.out.println(count);
	}

}
