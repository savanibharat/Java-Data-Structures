package com.SinglyLinkedList.Queue;

public class Link {

	public int iData;
	public Link next;

	public Link(int iData) {

		this.iData = iData;
		next = null;

	}

	public void displayLink() {

		System.out.print(iData + " ");

	}
	
}
