package com.neotech.review07;

public class OverLoadingMainMethod {
	//Can we overloading main method?
	//Can I have another method with name main in the same class?
	
	public static void main(String[] args) {
		//Java looks for a main method with this signature
		//Method signature = method name (main) + parameters (String array)
		System.out.println("Main method with String array parameters");
		
		main("Hi", "Bye");
		
		main(3,4);
		
		int[] arr = {2, 3};
		main (arr);
	}
	
	public static void main(int[] ints) {
		System.out.println("Main method with int array parameters");
	}
	
	public static void main(int num1, int num2) {
		System.out.println("Main method with two int parameters");
	}
	
	public static void main(String str1, String str2) {
		System.out.println("Main method with two String parameters");
	}
	

}
