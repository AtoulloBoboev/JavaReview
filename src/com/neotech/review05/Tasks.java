package com.neotech.review05;

public class Tasks {
	
	public static void main(String[] args) {
		System.out.println("Task 1:");
		
		//Print the whole array, but replace the letter "a" with "e"
		String rep = "I am very happy today, because today is not Monday";
		String replace = rep.replace("a", "e");
		System.out.println(replace);
				
		System.out.println();
		//2nd way		
		char[] array1 = replace.toCharArray();
				
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i]);
			
		}
		
		System.out.println();
				
//========================================================================================================		
		
		System.out.println();
		System.out.println("Task 2:");
	
	}
		
		
		// Task2: Create a method that will get an array of integers
		// and return the sum of the array
		
	protected int arraySum(int[] arr) {
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
		}
		
		return sum;
			
	}
	
	public int largest(int[] arr) {
		int largest = arr[0];
​
		for (int el : arr) {
			if (el > largest) {
				largest = el;
			}
		}
​
		return largest;
	}
}
