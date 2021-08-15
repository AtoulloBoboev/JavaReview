package com.neotech.review06;

public class Doctor {
	
	//OOP -> Object Oriented Programming 
	// 1. Inheritance (мерос, наследтство)
	// 2. Polymorphism
	// 3. Abstraction
	// 4. Encapsulation
	
		String name;
		int salary;
		String licenseID;
		
		public Doctor() {
			
		}
		
		Doctor (String name, int salary, String licenseId) {
			
			this.name = name;
			this.salary = salary;
			this.licenseID = licenseID;
		}
		
		public void checkUp (String name) {
			System.out.println("Doctor " + this.name + " makes a checkup on " + name);
		}
	

}
