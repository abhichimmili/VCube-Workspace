package com.oops;
interface In1{
	public default void show() {
		System.out.println("Interface show method called");
	}
}

class Parrent {
	public void show() {
		System.out.println("Parent show method called");
	}
}

public class Chiild extends Parrent implements In1 {

	public static void main(String[] args) {
		Chiild p =new Chiild();
		p.show();
	}

}
