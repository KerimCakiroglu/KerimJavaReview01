package com.neotech.review03;

public class TwoD_ArrayIntro3 {

	public static void main(String[] args) {

		int[][] nums = { { 3, 6 }, { 5, 2, 9, 7 }, { 8 } };

		System.out.println(nums[1][3]);

		// System.out.println(nums[0][2]); //run time error

		System.out.println("The number of rows is --> " + nums.length);
		System.out.println("The length of the row with index1 ---> " + nums[1].length);

		System.out.println("==========================");

		for (int row = 0; row < nums.length; row++) {
			for (int col = 0; col < nums[row].length; col++) {
				System.out.print(nums[row][col] + " ");
			}
			System.out.println();
		}

		System.out.println("----------------");

		// Nested enhanced/advanced for loop
		for (int[] row : nums) {

			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}

	}

}
