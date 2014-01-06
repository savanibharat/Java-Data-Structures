package com.RobertLafore.HeapApp;

/**
 * @author Savani Bharat
 *
 */
public class HeapApp {

	public static void main(String[] args) {
		
		Heap theHeap=new Heap(10);

		theHeap.insert(70); // insert 10 items
		theHeap.insert(40);
		theHeap.insert(50);
		theHeap.insert(20);
		theHeap.insert(60);
		theHeap.insert(100);
		theHeap.insert(80);
		theHeap.insert(30);
		theHeap.insert(10);
		theHeap.insert(90);
		theHeap.display();
		System.out.println();
		theHeap.change(6, 300);
		System.out.println("New value is to be inserted at index 6 and value is 300");
		System.out.println();
		theHeap.display();
		
	}
}
