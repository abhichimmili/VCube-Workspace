package com.javaintroduction;

public class TestMainMethod {
	int val;
	TestMainMethod(){
		
	}
	TestMainMethod(int x){
		val=x;
	}
	void main(String[] args) {
		TestMainMethod t = new TestMainMethod(5);
		System.out.println(t.val);

	}

}
