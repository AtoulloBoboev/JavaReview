package com.neotech.review06;

public class Animal {
	
	String name;
	int legs;
	
	public void sleep() {
		System.out.println("All animals sleep");
	}
	
	void displayIndo() {
		System.out.println(name + " has " + legs + " legs");
	}
}

//Create 3 classes inheriting Animal class
//Wolf, Fox, Bear
//Wolf does not have any extra variables or methods
//Fox has a String furColor
//Bear has a roar() method
//Create a class Forest where you create 1 animal from each type

 class Wolf extends Animal {
	 
}
 
 class Fox extends Animal {
	 
	 public String furColor;
	 
 }
 
 class Bear extends Animal {
	 
	 public void roar() {
		 System.out.println("Bear roar");
	 }
	 
 }
