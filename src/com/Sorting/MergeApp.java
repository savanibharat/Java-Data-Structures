package com.Sorting;

public class MergeApp {
	public static void main(String[] args) {

		int[] arrayA = { 23, 47, 81, 95 };
		int[] arrayB = { 7, 14, 39, 55, 62, 74 };
		int[] arrayC = new int[11];

		merge(arrayA, 4, arrayB, 6, arrayC);
		display(arrayC);
	}

	public static void merge(int[] arrayA, int sizeA, int[] arrayB, int sizeB,
			int[] arrayC) {

		int aCntr = 0, bCntr = 0, cCntr = 0;

		while (aCntr < sizeA && bCntr < sizeB)
			if (arrayA[aCntr] < arrayB[bCntr])
				arrayC[cCntr++] = arrayA[aCntr++];

			else
				arrayC[cCntr++] = arrayB[bCntr++];

		while (aCntr < sizeA)
			arrayC[cCntr++] = arrayA[aCntr++];

		while (bCntr < sizeB)
			arrayC[cCntr++] = arrayB[bCntr++];

	}

	public static void display(int[] arrayC) {
		for (int i = 0; i < 10; i++) {
			System.out.print(arrayC[i] + " ");
		}
	}
}
