package com.Sorting;

public class ShellSortArray {

	private int[] theArray;
	private int nElements;

	public ShellSortArray(int maxSize) {

		theArray = new int[maxSize];
		nElements = 0;

	}

	public void insert(int value) {

		theArray[nElements] = value;
		nElements++;

	}

	public void display() {

		for (int i = 0; i < nElements; i++) {

			System.out.print(theArray[i] + " ");

		}
		System.out.println();

	}

	public void shellSort() {

		int inner, outer;
		int temp;
		int h = 1;

		while (h <= nElements / 3) {// 10/3=3

			h = h * 3 + 1; // h=10

		}
		while (h > 0) {

			for (outer = h; outer < nElements; outer++) {

				temp = theArray[outer];
				inner = outer;

				while (inner > (h - 1) && theArray[inner - h] >= temp) {

					theArray[inner] = theArray[inner - h];
					inner -= h;

				}
				theArray[inner] = temp;

			}
			h = (h - 1) / 3;
		}
	}
}
