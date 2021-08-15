package com.neotech.review02;

public class SumEvenForLoop {
	
	public static void main(String[] args) {
		
		//Add Even numbers
		//Also add Odd numbers
		//Also add All numbers
		//Between 1 && 50
		//Using for loop
		
		int sumEven = 0;
		int sumOdd = 0;
		int sumAll = 0; 
		
		for (int i = 1; i <= 50; i++) {
			
			if (i % 2 == 1) {
				System.out.print("Odd numbers: " + i + " ");
				System.out.println();
				sumOdd = sumOdd + i;
			}
			
			else if (i %2 == 0) {
				System.out.print("Even numbers: " + i + " ");
				
				sumEven = sumEven + i;
				
			}
			sumAll = sumAll + i;
//			
		}
		System.out.println();
		System.out.println("Total even numbers: " + sumEven);
		System.out.println("Total odd numbers: " + sumOdd);
		System.out.println("Total All numbers: " + sumAll);
	}

}
