package com.langfundamentals.constructors;

public class Product {
	int productId;
	String productName;
	int price;
	String description;
	int quantity;
	
	Product(){
		System.out.println("No details assigned. No-arg constructor Called");
	}
	Product(int id,String name){
		this.productId=id;
		this.productName=name;
	}
	
	Product(int id,String name,int price){
		this.productId=id;
		this.productName=name;
		this.price=price;
	}
	
	Product(int id,String name,int price,String desc){
		this.productId=id;
		this.productName=name;
		this.price=price;
		this.description =desc;
	}
	
	//All-arg constructor
	Product(int id,String name,int price,String desc,int quantity){
		this.productId=id;
		this.productName=name;
		this.price=price;
		this.description =desc;
		this.quantity= quantity;
	}
	
	void display() {
		System.out.println("*********************************");
		System.out.println("Product Id : "+productId);
		System.out.println("Product Name : "+productName);
		System.out.println("Product Price : "+price);
		System.out.println("Product Description : "+description);
		System.out.println("Quantity : "+quantity);
	}

	public static void main(String[] args) {
		//No-arg constructor
		Product mobile = new Product();
		mobile.display();
		
		//All-arg constructor
		Product laptop = new Product(101, "Laptop", 65000, "Dell Inspiron", 10);
        laptop.display();
        Product mouse = new Product(102, "Mouse", 700, "Wireless", 20);
        mouse.display();
        
        //2. Constructor with Product ID and Name
        Product p2 = new Product(103, "Pen drive");
        p2.display();

        // 3. Constructor with Product ID, Name and Price
        Product p3 = new Product(104, "Ear Pods", 700);
        p3.display();

        // 4. Constructor with Product ID, Name, Price and Description
        Product p4 = new Product(105, "Keyboard", 1500, "Mechanical Keyboard");
        p4.display();

        // 5. Constructor with all Details
        Product p5 = new Product(106, "Smart Phone", 25000,"6GB RAM, 128GB Storage", 12);
        p5.display();
	}

}
