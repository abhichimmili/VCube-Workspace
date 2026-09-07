package com.oops;

//import java.util.ArrayList;

class Address{
	String city;
	Address(String city){
		this.city=city;
	}
}
public class Student {
	int id;
	Address addr;
	Student(){
		
	}
	Student(int id,String city){
		this.id=id;
		this.addr= new Address(city);
	}
	Student(Student s){
		this.id=s.id;
		this.addr=new Address(s.addr.city);
//		this.addr=s.addr;
	}
	public static void main(String[] args) {
		Student s1= new Student(101,"HYD");
		Student s2 = new Student(s1);
//		ArrayList
		
		System.out.println(s1.id);
		System.out.println(s2.id);
		System.out.println(s1.addr.city);
		System.out.println(s2.addr.city);
		s2.addr.city="Vijaywada";
		s2.id=102;
		System.out.println(s1.id);
		System.out.println(s2.id);
		System.out.println(s1.addr.city);
		System.out.println(s2.addr.city);
		
	}
}
