package com.neotech.review03;

public class TwoD_ArrayIntro2 {
	
	public static void main(String[] args) {
		
		int[][]nums = {
				{6, 3, 7},
				{2, 4, 9},
				{1, 5, 0},
				{8, 6, 2 }
		};
		
		System.out.println(nums[1][2]);
		
		System.out.println("-------------------------");
		
		//Nested Enhanced for loop
		
		for (int [] row : nums) {
			
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------");
		
		//2nd way
		for (int[] row : nums) {
			
			//I will iterate the row (1D-array) with a normal for loop
			for (int i = 0; i < row.length; i++) {
				System.out.print(row[i] + " ");
			}
			System.out.println();
		}
	}

}
