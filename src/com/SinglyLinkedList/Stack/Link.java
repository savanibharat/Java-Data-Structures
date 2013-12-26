package com.SinglyLinkedList.Stack;

public class Link {

	public short iData;
	public Link next;
	
	public Link(short iData){
		
		this.iData=iData;
		next=null;
		
	}
	public void displayLink(){
		
		System.out.println(iData+" ");
		
	}
	
}
