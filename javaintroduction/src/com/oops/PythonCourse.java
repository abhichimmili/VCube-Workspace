package com.oops;

public class PythonCourse extends Course {
	
	void duration() {
		System.out.println("Python Course Duration is : 6 months");
	}


	public static void main(String[] args) {
		Course  python = new PythonCourse();
		python.duration();
	}

}
