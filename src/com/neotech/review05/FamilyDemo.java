package com.neotech.review05;

public class FamilyDemo {
	
	public static void main(String[] args) {
		
		// I CANNOT access instance variables before I create an object
		// FamilyMember.firstName = "Atoullo";
		
		// I CAN access class variables before I create an object
		FamilyMember.lastName = " Boboev";
				
		// I CANNOT access non-static methods before I create an object
		// FamilyMember.printFullName();
		
		// I can access static methods before I create an object
		FamilyMember.printFamilyName();
		
		FamilyMember member1 = new FamilyMember();
		member1.firstName = "Atoullo";
		member1.age = 25;
		
		FamilyMember member2 = new FamilyMember();
		member2.firstName = "Oyatullo";
		member2.age = 22;
		
		member1.printFullName();
		member2.printFullName();
		
		System.out.println();
		System.out.println("They went to court and changed their lastname!!!");
		// Static  variables can change!!!
		FamilyMember.lastName = "Babaev";
		
		member1.firstName = "Alikhon";
		
		member1.printFullName();
		member2.printFullName();
		
		
		
	}

}
