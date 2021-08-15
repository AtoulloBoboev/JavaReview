package com.neotech.review05;

public class ToCharArray {
	
	public static void main(String[] args) {
		
		//toCharArray () -> разделяет весь символ из строки
		String longStr = "I am very happy today, because today is not Monday";
		System.out.println(longStr.length());
		
		char[] charArray = longStr.toCharArray();
		System.out.println(charArray.length);
		
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		System.out.println();
		
		for(char letter : charArray) {
			int code = letter; //find the ASCI code for the character
			System.out.println(letter + " -> " + code );
		}
		
		
	}
	

}
