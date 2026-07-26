package com.langfundamentals.constructors;

class Products {
	int productId;
	String productName;
	String brand;
	double price;
	int warranty;

	// Parameterized Constructor
	public Products(int productId, String productName, String brand, double price, int warranty) {
		this.productId = productId;
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.warranty = warranty;
	}

	// Copy constructor
	public Products(Products prod) {
		this.productId = prod.productId;
		this.productName = prod.productName;
		this.brand = prod.brand;
		this.price = prod.price;
		this.warranty = prod.warranty;
	}

	// Display Details
	void display() {
		System.out.println("------ Info ------");
		System.out.println("Product ID : " + productId);
		System.out.println("Product Name : " + productName);
		System.out.println("Brand : " + brand);
		System.out.println("Price : " + price);
		System.out.println("Warranty : " + warranty + " years");
	}
}

public class OnlinneShoppingPlatform {

	public static void main(String[] args) {
		// Original Product Object creation
		Products smartphone = new Products(101, "Galaxy S25", "Samsung", 84999.00, 2);
		// Copying Product Details into another Object
		Products smartphone1 = new Products(smartphone);
		// Change Product ID
		smartphone1.productId = 201;

		System.out.println("Original Product ");
		smartphone.display();
		System.out.println();

		System.out.println("Copied Product (New Region) ");
		smartphone1.display();
	}

}
