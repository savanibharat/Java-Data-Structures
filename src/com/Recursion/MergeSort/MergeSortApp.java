package com.Recursion.MergeSort;

public class MergeSortApp {

	public static void main(String[] args) {

		/*
		 * int maxSize=100;
		 * 
		 * arr.insert(2); arr.insert(1); arr.insert(0); arr.insert(9);
		 * arr.insert(44); arr.insert(33); arr.insert(1); arr.insert(5555);
		 * arr.insert(5); arr.insert(89); arr.insert(99);
		 */
		DArray arr = new DArray(1000);
		int[] a = new int[1000];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (java.lang.Math.random() * i);
			arr.insert(a[i]);
			// a[i] = RAND.nextInt(40);
		}
		arr.display();
		long startTime1 = System.currentTimeMillis();
		arr.mergeSort();
		long endTime1 = System.currentTimeMillis();
		System.out.println("time taken is " + (endTime1 - startTime1));

		arr.display();
	}
}
