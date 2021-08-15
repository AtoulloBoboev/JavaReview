package com.neotech.review04;

public class Methods {
	
	void sayWelcome() {
		for (int i = 0; i < 3; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	
	
	void sayWelcomeWithNumber (int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("Welcome ");
		}
		System.out.println();
	}
	
	void sayGreeting(String greeting) {
		for (int i = 0; i < 3; i++) {
			System.out.print(greeting + " ");
		}
		System.out.println();
		
		
	}
	
	
	
	public static void main(String[] args) {
		Methods m = new Methods();
		m.sayWelcome();
		m.sayWelcomeWithNumber(5);
		m.sayGreeting("Hush omadi");
	}

}
