package com.javaintroduction;

public class LoaderDemo {
	void main() throws ClassNotFoundException {
		System.out.println("Main Method Started...");
		Class.forName("java.lang.System");
		Class.forName("java.lang.String");
		Class.forName("com.javaintroduction.Student");
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Main Method Ended...");
	}

}
