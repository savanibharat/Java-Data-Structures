package com.RobertLafore.HeapSort;

/**
 * The Class Heap.
 */
public class Heap {

	/** The heap array. */
	private Node[] heapArray;
	
	/** The current size. */
	private int currentSize;
	
	/** The max size. */
	private int maxSize;

	/**
	 * Instantiates a new heap.
	 *
	 * @param maxSize the max size
	 */
	public Heap(int maxSize) {

		this.maxSize = maxSize;
		currentSize = 0;
		heapArray = new Node[this.maxSize];

	}

	/**
	 * Removes the Node
	 *
	 * @return the node
	 */
	public Node remove() {

		Node root = heapArray[0];
		heapArray[0] = heapArray[--currentSize];
		trickleDown(0);
		return root;

	}

	/**
	 * Trickle down.
	 *
	 * @param index the index
	 */
	public void trickleDown(int index) {

		int largerChild;
		Node top = heapArray[index]; // save root

		while (index < currentSize / 2) { // not on bottom row

			int leftChild = 2 * index + 1;
			int rightChild = leftChild + 1;

			if (rightChild < currentSize
					&& heapArray[rightChild].iData > heapArray[leftChild].iData)
				largerChild = rightChild;
			else
				largerChild = leftChild;

			if (top.iData >= heapArray[largerChild].iData) // top>=largerChild
															// then break no
															// need to shift
				break;

			heapArray[index] = heapArray[largerChild];
			index = largerChild;

		}
		heapArray[index] = top;
	}

	/**
	 * Display array.
	 */
	public void displayArray() {

		for (int i = 0; i < maxSize; i++) {
			System.out.print(heapArray[i].iData + " ");
		}
		System.out.println();
	}

	/**
	 * Insert at.
	 *
	 * @param index the index
	 * @param newNode the new node
	 */
	public void insertAt(int index, Node newNode) {

		heapArray[index] = newNode;

	}

	/**
	 * Increment size.
	 */
	public void incrementSize() {

		currentSize++;

	}
}