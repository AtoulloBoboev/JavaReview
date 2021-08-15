package com.neotech.review05;

public class SplitDemo {
	
	public static void main(String[] args) {
		
		String longStr = "I am very happy, because today is not Monday";
		
		String[] stringArray = longStr.split("today");
		
		System.out.println(stringArray.length);
		//for-each loop
		System.out.println("---Iteration using enhanced for loop---");
		for (String str : stringArray) {
			System.out.println(str);
		}
		
		System.out.println();
		//for-loop
		System.out.println("---Iteration using enhanced for loop---");
		for (int i = 0; i < stringArray.length; i++ ) {
			System.out.println(stringArray[i]);
		}
		
		System.out.println("--------------------");
		
		longStr = "I like 6 because 7 ate 9 yesyerday";
		
		stringArray = longStr.split("[6-9]");
		System.out.println(stringArray.length);
		
		for (String str : stringArray) {
			System.out.println(str);
		}
	}

}
