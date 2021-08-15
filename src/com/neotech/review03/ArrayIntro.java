package com.neotech.review03;

public class ArrayIntro {
	public static void main(String[] args) {
		
		
		
		// 1st serious way
				int[] arr = new int[4];
				arr[2] = 2;
				arr[0] = 7;
				arr[1] = 6;
				arr[3] = 4;
		​
				int sumArr = 0;
				for (int i = 0; i < arr.length; i++) {
					sumArr += arr[i];
				}
				System.out.println("The sum of array is " + sumArr);
				
				System.out.println("----------------------");
		
//==================================================================================================================================		
				
		//2nd serious way
		int[] arr2 = { 2, 7, 6, 4 };
		
		int sumArr2 = 0;
		for (int num: arr2) {
			sumArr2 += num;
		}
		System.out.println("The sum of array2 is " + sumArr2);
		
		System.out.println("-----------------------------------");
		
//==================================================================================================================================		
		
		String[] animals = { "dog", "cat", "monkey", "horse", "donkey" };
		
		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();
		
		for(String animal : animals) {
			System.out.print(animal + " ");
		}
		System.out.println();
		
		System.out.println("------------------------------------------");
		System.out.println("Let's print the animals in reverse order");
		
		for (int i = animals.length - 1; i >= 0; i--) {
			System.out.print(animals[i] + ", ");
		}
	}

}
