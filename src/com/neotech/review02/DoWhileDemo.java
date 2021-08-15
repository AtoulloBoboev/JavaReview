package com.neotech.review02;

import java.util.Scanner;

public class DoWhileDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Similarity between While and Do-While");
		
		int age = 1;
		while (age <=10) {
			System.out.println("Happy birthday. You are " + age +  " years old.");
			age++;
		}
		
		System.out.println("Now you're too big. No more birthdays.");
		
		System.out.println();
		System.out.println("========================================");
		System.out.println();
		
		
		int age2 = 1;
		
		do {
			System.out.println("Happy birthday. You are " + age2 +  " years old.");
			age2++;
		} while (age2 <= 10);
		
		System.out.println("Now you're too big. No more birthdays.");
		
		System.out.println();
		System.out.println("========================================");
		System.out.println();
		
		
		System.out.println("Differences between While and Do-While");
		
		boolean happy = false;
		
		while (happy) {
			System.out.println("Bye");
		}
		do {
			System.out.println("Bye - Do-While");
			
		} while (happy);
		
		System.out.println();
		System.out.println("========================================");
		System.out.println();
		
		for (int age3 = 1; age3 <=20; age3++) {
			if (age3 == 13) {
				continue;
			}
			System.out.println(age3 + " Birthday");
		}
		
		System.out.println();
		System.out.println("========================================");
		System.out.println();
		
//		System.out.println("---Same thing with a While loop");
//		​
//				int age4 = 0;
//		​
//				while (age4 < 20) {
//		​
//					age2++;
//		​
//					if (age4 == 13) {
//						continue;
//					}
//					System.out.println("Happy birthday. You are " + age4 + " years old.");
//		​
//				}
		
		
		/*
		 * ASk the user to enter a positive number and add it to the total
		 * He should enter -1 to STOP. -1 will not be added to the total
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int num4 = 0;
		int total = 0;
		
//		while (num4 != -1) {
//			total += num4;
//			System.out.println("Enter a positive number! To stop enter -1");
//			num4 = scan.nextInt();
//		}
//		System.out.println("Total = " + total);
		
		System.out.println();
		System.out.println("========================================");
		System.out.println();
		
		
//		do {
//			System.out.println("Enter a positive number! To stop enter -1");
//			num4 = scan.nextInt();
//			if (num4 != -1) {
//				total += num4;
//			}
//		}	while (num4 !=-1);
			
			System.out.println("Total = " + total);
		
			System.out.println();
			System.out.println("========================================");
			System.out.println();
			
			
			//How a for loop works
			//1st iteration: 1 initialization, 2 check condition
			//other iteration: 1 increment, 2 check condition
			
//			for (int i = 1; i <= 3; i++) {
//				System.out.println(i);
//			}
			
			System.out.println("Enter a positive number! To stop enter -1");
			num4 = scan.nextInt();
			for (; num4 != -1;) {
			total += num4;
			System.out.println("Enter a positive number! To stop enter -1");
			num4 = scan.nextInt();
		}
			System.out.println("Total= " + total);
			
	}
	
}
