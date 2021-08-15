package com.neotech.review06_other;

import com.neotech.review06.USA;

public class Mexico {
	
	public static void main(String[] args) {
		
		USA us = new USA();
		
		System.out.println("Accessing the variable from inside the USA");
		//private, protected and default cannot be accessed from outside
//		System.out.println("private -> " + us.capitalCity);
//		System.out.println("protected -> " + us.mainState);
//		System.out.println("default -> " + us.normalState);
		System.out.println("public -> " + us.bestSchool);
		
		System.out.println();
		
		System.out.println("Accessing the methods from inside the USA");
//		us.selectPresident();
//		us.playNBA();
		us.speakEnglish();
	}

}
