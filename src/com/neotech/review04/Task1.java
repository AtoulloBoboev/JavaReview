package com.neotech.review04;

public class Task1 {
	
	/*
	 * Create a method sayGreetingWithNumber
	 * that accept the greeting and how man times it should be printed
	 */
	
	void greeting (String greet, int times) {
	for (int i = 0; i < times; i++) {
		System.out.print(greet + " ");
		
		}
	}
	
	public static void main(String[] args) {
		
		Task1 greet = new Task1();
		greet.greeting("Salom", 4);
	}

}
