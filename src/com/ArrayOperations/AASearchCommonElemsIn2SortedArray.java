package com.ArrayOperations;

public class AASearchCommonElemsIn2SortedArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 9 };
		int b[] = { 2, 3, 5, 6, 7, 8, 9 };

		int i = 0, j = 0;
		while (i < a.length && j < b.length) {

			if (a[i] < b[j])
				i++;
			else if (a[i] > b[j])
				j++;
			else {
				System.out.println(a[i]);
				i++;
				j++;
			}
		}

	}
}
