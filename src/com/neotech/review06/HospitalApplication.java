package com.neotech.review06;

public class HospitalApplication {
	
	public static void main(String[] args) {
		
		Doctor d1 = new Doctor("John", 120000, "D1234");
		d1.checkUp("Burak");
		
		
		// These are variables and methods of child
//		d1.dermId;
//		d1.applySkinTreatment()
		
		Dermatologist d2 = new Dermatologist();
		d2.name = "Okan";
		d2.salary = 200000;
		d2.licenseID = "D789";
		d2.dermId = "XYZ";
		
		d2.checkUp("Eric");
		d2.applySkinTreatment();
		
		System.out.println("--------------------------");
		
		
		
	}

}
