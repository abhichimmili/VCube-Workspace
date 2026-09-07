package com.oops;

public class SQLCourse extends Course{

	void duration() {
		System.out.println("SQL Course Duration is : 2 months");
	}


	public static void main(String[] args) {
		Course  sql = new SQLCourse();
		sql.duration();
	}

}
