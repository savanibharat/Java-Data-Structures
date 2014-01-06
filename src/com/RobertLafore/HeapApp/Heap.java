package com.RobertLafore.HeapApp;



// TODO: Auto-generated Javadoc
/**
 * The Class Heap.
 *
 * @author Savani Bharat
 * For a node at index x in the array,
 * • Its parent is (x-1) / 2.
 * • Its left child is 2*x + 1.
 * • Its right child is 2*x + 2.
 */
public class Heap {

	/** The heap array. */
	private Node[] heapArray;
	
	/** The max size. */
	private int maxSize;
	
	/** The current size. */
	private int currentSize; // number of nodes in array

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
	 * Display.
	 */
	public void display(){
		
		for (int i = 0; i < currentSize; i++) {
			
			System.out.print(heapArray[i].getKey()+" ");
			
		}
		System.out.println();
		
	}
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty() {

		return currentSize == 0;

	}

	/**
	 * Insert.
	 *
	 * @param key the key
	 * @return true, if successful
	 */
	public boolean insert(int key) {

		if (maxSize == currentSize)
			return false;
		Node newNode = new Node(key);
		heapArray[currentSize] = newNode;
		trickleUp(currentSize++);
		return true;

	}

	/**
	 * Trickle up.
	 *
	 * @param index the index
	 */
	public void trickleUp(int index) {

		int parent = (index - 1) / 2; // This is how you get parent of
										// particular node in Heap
		Node bottom = heapArray[index];

		while (index > 0 && heapArray[parent].getKey() < bottom.getKey()) {

			heapArray[index] = heapArray[parent]; // Move it down
			index = parent;
			parent = (parent - 1) / 2; // calculate new parent

		}
		heapArray[index]=bottom;
	}

	/**
	 * Removes the item with max value.
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
		Node top = heapArray[index];
		while (index < currentSize / 2) {

			int leftChild = (2 * index) + 1;
			int rightChild = leftChild + 1;

			if (rightChild < currentSize && // right child exists??
					heapArray[leftChild].getKey() < heapArray[rightChild]
							.getKey())

				largerChild = rightChild;

			else

				largerChild = leftChild;

			// top>=largerChild
			
			if(top.getKey()>=heapArray[largerChild].getKey())
				break;
			
			heapArray[index]=heapArray[largerChild];
			index=largerChild;
		}
		
		heapArray[index]=top;
	}
	
	/**
	 * Change.
	 *
	 * @param index the index
	 * @param newValue the new value
	 * @return true, if successful
	 */
	public boolean change(int index,int newValue){
		
		if(index<0 && index>=currentSize)
			return false;
		
		int oldVal=heapArray[index].getKey();
		heapArray[index].setKey(newValue);
		
		if(oldVal<newValue)//if raised
			trickleUp(index);
		else
			trickleDown(index);
		
		return true;
			
		
	}
	

}