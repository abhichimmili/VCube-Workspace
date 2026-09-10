package com.oops;

class Parent{
	int x=10;
	Parent(){
		show();
	}
	void show() {
		System.out.println("Parent : "+x);
	}
}
class Child extends Parent{
	int x=10;
	Child(){
		show();
	}
	void show() {
		System.out.println("Child : "+x);
	}
}

public class ParentChild {

	public static void main(String[] args) {
		new Child();

	}

}
