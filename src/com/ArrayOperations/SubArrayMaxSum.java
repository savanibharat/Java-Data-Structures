package com.ArrayOperations;

public class SubArrayMaxSum {

	public static void main(String[] args) {

		int[] arr1 = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int[] arr2 = { -1, 2, -3, 2, 0, 5, -11 };
		int arr[] = {5,-1,2,6,7 };
		int max = maxScan(arr);
		System.out.println(max);

	}

	public static int maxScan(int[] array) {
		if (array.length == 0)
			return -1;

		else if (array.length == 1)
			return array[0];

		else {

			int maxSum = array[0];
			int current_max = array[0];

			for (int i = 1; i < array.length; i++) {

				current_max = Math.max(array[i], current_max + array[i]);
				maxSum = Math.max(maxSum, current_max);
			}
			return maxSum;
		}
	}
}