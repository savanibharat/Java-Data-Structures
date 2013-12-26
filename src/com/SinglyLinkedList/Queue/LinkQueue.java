package com.SinglyLinkedList.Queue;

public class LinkQueue {

	private FirstLastList theList;
	public LinkQueue() {
	
		theList=new FirstLastList();
		
	}
	public void insert(int iData){
		
		theList.insertFirst(iData);
		
	}
	public int remove(){
		
		return theList.deleteFirst();
		
	}
	public boolean isEmpty(){
		
		return theList.isEmpty();
		
	}
	public void displayQueue(){
		
		System.out.print("Queue (front-->rear): ");
		theList.displayList();
		
	}
}
