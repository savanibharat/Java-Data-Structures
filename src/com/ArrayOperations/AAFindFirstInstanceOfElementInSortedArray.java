package com.ArrayOperations;

public class AAFindFirstInstanceOfElementInSortedArray {

	public static void main(String[] args) {

		int[] arr = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 4, 4, 5, 5,
				5, 5, 5, 5, 5 };

		System.out.println(minOccurance(arr, 0, arr.length - 1, 1));
		System.out.println(minOccurance(arr, 0, arr.length - 1, 2));
		System.out.println(minOccurance(arr, 0, arr.length - 1, 3));
		System.out.println(minOccurance(arr, 0, arr.length - 1, 4));
		System.out.println(minOccurance(arr, 0, arr.length - 1, 5));
	}

	static int minOccurance(int[] array, int from, int to, int v) {
		if (from == to) {
			if (v == array[from]) {
				return from;
			} else {
				return -1;
			}
		}

		int middle = (from + to) >> 1;
		if (v < array[middle]) {
			return minOccurance(array, from, middle - 1, v);
		} else if (v > array[middle]) {
			return minOccurance(array, middle + 1, to, v);
		} else {
			int left = minOccurance(array, from, middle - 1, v);
			if (left == -1) {
				return middle;
			} else {
				return left;
			}
		}
	}
}