package com.neotech.review06;

	//Doctor is the patent/bse/super class
	// Dermatologist is the child/derived/ sub class

public class Dermatologist extends Doctor {
	
	String dermId;
	
	//The constructors are NOT inherited
	Dermatologist(String name, int salary, String licenseId) {
		this.name = name;
	}
	
	public void applySkinTreatment() {
		System.out.println("Doctor " + name + " applies skin treatment");
	}
	
	
	

}
