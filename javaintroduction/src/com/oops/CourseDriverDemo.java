package com.oops;

class Course {
	void duration() {
		System.out.println("Duration is : 4 months");
	}
}
class PythonCourse extends Course {
	
	void duration() {
		System.out.println("Python Course Duration is : 6 months");
	}
}

class JavaCourse extends Course {
	
	void duration() {
		System.out.println("Java Course Duration is : 6 months");
	}
}

class SQLCourse extends Course{

	void duration() {
		System.out.println("SQL Course Duration is : 2 months");
	}
}
public class CourseDriverDemo {

	public static void main(String[] args) {
		//Python 
		Course  python = new PythonCourse();
		python.duration();
		
		//Java
		Course java = new JavaCourse();
		java.duration();
		
		//SQL
		Course  sql = new SQLCourse();
		sql.duration();
	}

}
