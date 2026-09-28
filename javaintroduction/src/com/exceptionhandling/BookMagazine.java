package com.exceptionhandling;

class Book {

}

class Magazine extends Book {

}

public class BookMagazine {

	public static void main(String[] args) {
		Object m = new Magazine();
		Object b = new Book();
		if (m instanceof Book) {
			Book b1 = (Book) m;
			System.out.println("Magazine object is instance of Book " + (m instanceof Book));
		}
		try {
			Magazine m1 = (Magazine) b;
		} catch (ClassCastException e) {
			System.out.println("Book object is not an instance of Magazine " + (b instanceof Magazine));
			e.printStackTrace();
		}
	}

}
