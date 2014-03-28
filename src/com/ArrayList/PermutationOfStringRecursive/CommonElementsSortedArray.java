package com.ArrayList.PermutationOfStringRecursive;

/**
 * @author Savani Bharat
 * 
 */
public class CommonElementsSortedArray {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 9 };
		int b[] = { 2, 3, 5, 6, 7, 8, 9 };

		int i, j;
		i = j = 0;
		while (i < a.length && j < b.length) {

			if (a[i] == b[j]) {
				System.out.println(a[i]);
				i++;
				j++;
			} else if (a[i] > b[i]) {

				j++;

			} else
				i++;

		}

	}
}
