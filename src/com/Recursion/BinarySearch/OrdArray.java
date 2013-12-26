package com.Recursion.BinarySearch;

public class OrdArray {

	private int[] a;
	private int nElements;

	public OrdArray(int max) {

		a = new int[max];
		nElements = 0;

	}

	public int size() {

		return nElements;

	}

	public int find(int searchKey) {

		return binarySearch(searchKey, 0, nElements - 1);

	}

	private int binarySearch(int searchkey, int lowerBound, int upperBound) {

		int mid;
		mid = (lowerBound + upperBound) / 2;
		if (a[mid] == searchkey)
			return mid;
		else if (lowerBound > upperBound)
			return nElements;
		else {

			if (a[mid] < searchkey)
				return binarySearch(searchkey, mid + 1, upperBound);// 1 2 3 4 5
																	// number 5
																	// to be
																	// search
																	// mid is 3
																	// so lower
																	// bound is
																	// changed
			else
				return binarySearch(searchkey, lowerBound, mid - 1);// 1 2 3 4 5
																	// number 1
																	// to be
																	// search
																	// mid is 3
																	// so upper
																	// bound is
																	// changed

		}

	}

	public void insert(int value) {// insert value at proper place

		int j;
		for (j = 0; j < nElements; j++) {

			if (a[j] > value)
				break;

		}
		for (int k = nElements; k > j; k--)
			a[k] = a[k - 1];

		a[j] = value;
		nElements++;
	}

	public void display() {

		for (int i = 0; i < nElements; i++) {

			System.out.println("Index is " + (i) + " value is " + a[i] + " ");
		}
		System.out.println("");

	}
}
