/*
Insertion sort is a simple sorting algorithm that builds the final sorted array one item at a time. It is much less efficient on large lists than more advanced algorithms such 
as quicksort, heapsort, or merge sort. Every repetition of insertion sort removes an element from the input data, inserting it into the correct position in the already-sorted list,
until no input elements remain. The choice of which element to remove from the input is arbitrary, and can be made using almost any choice algorithm. 
 */
package com.Sorting;

class InsertionSort {
	public static void main(String args[]) {

		int list[] = { 6, 5, 4, 7 };
		int n = list.length;

		for (int i = 0; i < n; i++) {
			System.out.println(list[i]);
		}

		for (int j = 1; j < n; j++) {
			int key = list[j];
			System.out.println("key is " + key);
			int i = j - 1;
			while ((i > -1) && (list[i] > key)) {
				list[i + 1] = list[i];
				i--;
			}
			list[i + 1] = key;
			for (int k = 0; k < n; k++) {
				System.out.print(list[k] + " ");
			}
			System.out.println();

		}
	}
}
