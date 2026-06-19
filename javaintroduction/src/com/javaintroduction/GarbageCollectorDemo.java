package com.javaintroduction;

public class GarbageCollectorDemo {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called !!");
	}
	
	void hello() {
		GarbageCollectorDemo obj = new GarbageCollectorDemo();
	}
	
	public static void main(String[] args) {
		GarbageCollectorDemo g1 = new GarbageCollectorDemo();
		GarbageCollectorDemo g2 = new GarbageCollectorDemo();
		GarbageCollectorDemo g3 = new GarbageCollectorDemo();
		System.out.println(g1+"\n"+g2+"\n"+g3);
		System.out.println("--------------------------------");
		System.gc();
		g1=null; //Nullify the object
		System.out.println("1. After making the object reference null");
		System.out.println(g1+"\n"+g2+"\n"+g3);
		System.out.println("--------------------------------");
		
		g2=g3; //Assigning
		
		System.out.println("2. Assigning the object reference variable to other reference variable");
		System.out.println(g1+"\n"+g2+"\n"+g3);
		System.out.println("--------------------------------");
		
		g3.hello(); //Out-of-Scope
		System.out.println("3. Creating Out of Scope object reference");
		System.out.println(g1+"\n"+g2+"\n"+g3);
		System.out.println("--------------------------------");
		
		new GarbageCollectorDemo();//Anonymus Object Creation
		System.out.println("4.Anonymus");
		System.out.println(g1+"\n"+g2+"\n"+g3);
		System.out.println("--------------------------------");

		
		System.gc();
	}

}
