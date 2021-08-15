package com.neotech.review03;

import java.util.Scanner;

public class Scanner_2D_Example {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("How many rows do you want in the array?");
		int rowArray = input.nextInt();
		
		System.out.println("How many columns do you want in the array?");
		int columnArray = input.nextInt();
		
		//Create the array
		String [][] names = new String [rowArray][columnArray];
		
		//Fill the array
		for (int row = 0; row < rowArray; row++) {
			
			for (int col = 0; col < columnArray; col++) 
			{
				System.out.println("Please enter a name: ");
				names[row][col] = input.next();
			}
		}
				
		System.out.println("-----------------------------");
		
		//Print the array
		for (String[] row : names) {
			
			for (String name : row) {
			System.out.print(name + " ");
		}
		
			System.out.println();
		 
		}
	}

}
