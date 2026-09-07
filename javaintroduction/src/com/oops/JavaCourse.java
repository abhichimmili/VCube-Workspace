package com.oops;

public class JavaCourse extends Course {
	
	void duration() {
		System.out.println("Java Course Duration is : 6 months");
	}

	public static void main(String[] args) {
		Course java = new JavaCourse();
		java.duration();

	}

}
