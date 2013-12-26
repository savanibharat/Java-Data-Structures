package com.SinglyLinkedList.Stack;

public class LinkStack {

	private LinkList theLinkList;
	public LinkStack(){
		
		theLinkList=new LinkList();
		
	}
	public void push(short iData){
		
		theLinkList.insertFirst(iData);
		
	}
	public short pop(){
		
		return theLinkList.deleteFirst();
		
	}
	public boolean isEmpty(){
		
		return theLinkList.isEmpty();
		
	}
	public void displayStack(){
		
		System.out.println("{ top --> bottom }: ");
		theLinkList.displayList();
		
	}
}
