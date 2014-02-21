package com.ArrayOperations;

import java.util.Arrays;

public class MinimumDifferenceBetween2Arrays {

	public static void main(String[] args) {

		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		Arrays.sort(arr1);
		Arrays.sort(arr2);

		int minDifference = Math.abs(arr1[0] - arr2[0]);
		int i = 0, j = 0;
		int iteration=0;
		while (i < arr1.length && j < arr2.length) {
			iteration++;
			minDifference = Math
					.min(minDifference, Math.abs(arr1[i] - arr2[j]));
			
			if (arr1[i] < arr2[j]){
				i++;
				iteration++;
			}
			else{
				j++;
				iteration++;
		}}
		System.out.println(minDifference);
		System.out.println(iteration);
	}

}
