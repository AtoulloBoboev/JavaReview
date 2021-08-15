package com.neotech.review06;

public class World {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.displayInfo();
		
		p1.name = "Hakan";
		p1.weight = 180;
		p1.age = 25;
		p1.displayInfo();
		
		System.out.println("------------------");
		//2nd way, using constructor with two parameters
		
		Person p2 = new Person("Mufasa", 185);
		p2.age = 24;
		p2.displayInfo();
		
		Task p3 = new Task("John", 25, 165.4);
		p3.displayInfo();
		
	}

}
