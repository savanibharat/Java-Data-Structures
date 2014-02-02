package com.CTCI.Programs;

public class CopyTwoSortedArray {

	public static void main(String[] args) {

		int a[] = new int[16];
		a[0] = 7;
		a[1] = 9;
		a[2] = 11;
		// System.out.println(a.length);
		int b[] = new int[3];
		b[0] = 6;
		b[1] = 12;
		b[2] = 90;

		mergeArray(a, b, a.length, b.length);
		// System.out.println();
	}

	/*
	 * public static void mergeArray(int a[], int b[], int n, int m) {
	 * 
	 * int k = m + n - 1; int i = n - 1; int j = m - 1;
	 * 
	 * while (i >= 0 && j >= 0) {
	 * 
	 * if (a[i] > b[j]) a[k--] = a[i--]; else a[k--] = b[j--]; } while (j >= 0)
	 * a[k--] = b[j--];
	 * 
	 * for (int j2 = 0; j2 < a.length; j2++) { System.out.println(a[j2]); } }
	 */
	public static void mergeArray(int[] a, int[] b, int n, int m) {
		int k = m + n - 1; // Index of last location of array b
		int i = n - 1; // Index of last element in array b
		int j = m - 1; // Index of last element in array a

		// Start comparing from the last element and merge a and b
		while (i >= 0 && j >= 0) {

			if (a[i] > b[j]) {
				a[k--] = a[i--];
			} else {
				a[k--] = b[j--];
			}
		}

		while (j >= 0) {
			a[k--] = b[j--];
		}
		for (int j2 = 0; j2 < a.length; j2++) {
			System.out.println(a[i] + " ");
		}
	}

}
