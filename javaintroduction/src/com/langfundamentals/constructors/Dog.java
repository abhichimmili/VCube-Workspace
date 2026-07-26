package com.langfundamentals.constructors;

class Animal{
	String name;
	int age;
	Animal(){
		this("Unknown",0);
		System.out.println("No arg constructor called Animal");
	}
	
	public Animal(String name, int age) {
		System.out.println("Paramatrized constructor called Animal");
		this.name = name;
		this.age = age;
	}
	void displayAnimal() {
		System.out.println("---------------");
		System.out.println(" Name : "+name);
		System.out.println(" Age : "+age);
	}
}

class Mammal extends Animal{
	String type;
	boolean hasFur;
	Mammal(){
		this("Pet",true);
		System.out.println("No arg constructor called Mammal");
	}
	
	public Mammal(String type, boolean hasFur) {
		System.out.println("Animal Paramatrized constructor");
		this.type = type;
		this.hasFur = hasFur;
	}

	public Mammal(String name, int age,String type, boolean hasFur) {
		super(name,age);
		System.out.println("Paramatrized constructor called Mammal");
		this.type = type;
		this.hasFur = hasFur;
	}
	void displayMammal() {
		displayAnimal();
		System.out.println(" Type : "+type);
		System.out.println(" Has Fur : "+hasFur);
	}
	
}


public class Dog extends Mammal{
	String breed;
	String color;
	
	Dog(){
		this("Unknown","Unknown");
		System.out.println("No arg constructor called Dog");
	}
	
	public Dog(String breed, String color) {
		System.out.println("Dog Paramatrized constructor");
		this.breed = breed;
		this.color = color;
	}



	public Dog(String name, int age,String type, boolean hasFur,String breed, String color) {
		super(name, age,type,hasFur);
		System.out.println("Paramatrized constructor called Dog");
		this.breed = breed;
		this.color = color;
	}
	void displayDogInfo() {
		displayMammal();
		System.out.println(" Breed : "+breed);
		System.out.println(" Color : "+color);
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method Called");
		Dog dog = new Dog("Animal", 5,"Land", true,"Golden Retriever", "Golden");
		dog.displayDogInfo();
		
		Dog dogesh = new Dog();
		dogesh.displayDogInfo();

	}

}
