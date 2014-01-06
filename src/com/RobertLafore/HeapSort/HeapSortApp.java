package com.RobertLafore.HeapSort;

/**
 * @author Savani Bharat
 *
 */
public class HeapSortApp {

	public static void main(String args[]) {

		Heap theHeap = new Heap(10);
		for (int j = 0; j < 10; j++) {

			int random = (int) (java.lang.Math.random() * 100);
			Node newNode = new Node(random);
			theHeap.insertAt(j, newNode);
			theHeap.incrementSize();

		}
		System.out.print("Printing normal array :: ");
		theHeap.displayArray();

		for (int i = 10 / 2 - 1; i >= 0; i--)
			theHeap.trickleDown(i);

		System.out.println();
		System.out.print("Printing Heap :: ");
		theHeap.displayArray();

		for (int i = 10 - 1; i >= 0; i--) {

			Node biggestNode = theHeap.remove();
			theHeap.insertAt(i, biggestNode);

		}
		System.out.print("Printing Sorted elements :: ");
		System.out.println();
		theHeap.displayArray();

	}
}
