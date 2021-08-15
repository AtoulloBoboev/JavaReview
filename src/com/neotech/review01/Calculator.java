package com.neotech.review01;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		//Ask the user to enter 2 numbers
		//Ask the user for the operator (+,-,*,/)
		//Do the home using if-else
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please enter the first number: ");
		double num1 = scan.nextDouble();
		
		System.out.print("Please enter the second number: ");
		double num2 = scan.nextDouble();
		
		System.out.print("Please enter the operator (+,-,*,/): ");
		String operator = scan.next();
		
		double result = 0;
		if(operator.equals("+")) {
			System.out.println("The result is " + (num1 + num2));
		} else if (operator.equals("-")) {
			System.out.println("The result is " + (num1 - num2));
		} else if (operator.equals("*")) {
			System.out.println("The result is " + (num1 * num2));
		} else if (operator.equals("/")) {
			System.out.println("The result is " + (num1 / num2));
		} else  {
			System.out.println("Invalid operator");
		}
		
		if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
			System.out.println("The result is: " + result);
		}
	}

}
