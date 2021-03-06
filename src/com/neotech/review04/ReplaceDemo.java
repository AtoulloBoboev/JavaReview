package com.neotech.review04;

public class ReplaceDemo {
	
	public static void main(String[] args) {
		
		String longStr = "I am very happy today because today it is not Monday";
		
		String anotherStr = longStr.replace('a', 'e');
		System.out.println(anotherStr);
		
		anotherStr = longStr.replace("today", "tomorrow");
		System.out.println(anotherStr);
		
		System.out.println("----------------------------------------");
		
		//Regular expression
		anotherStr = longStr.replaceAll("[a-z]", "*");
		System.out.println(anotherStr);
		
		String ssn = "598-659-8745";
		String newSSN = ssn.replaceAll("[0-9]", "*"); //[4-6] - не все скрывает
		System.out.println(newSSN);
		
		System.out.println("Let's remove the dashes from ssn");
		newSSN = ssn.replaceAll("[^0-9]", "");
		System.out.println(newSSN); 
	}

}
