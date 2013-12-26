package com.SinglyLinkedList.Stack;

public class LinkList {

	private Link first;
	public LinkList(){
		
		first=null;
		
	}
	
	public boolean isEmpty(){
		
		return (first==null);
		
	}
	
	public void insertFirst(short iData){
		
		Link newLink=new Link(iData);
		newLink.next=first;
		first=newLink;
		
	}
	public short deleteFirst(){
		
		Link temp=first;
		first=first.next;
		return temp.iData;
		
	}
	public void displayList(){
		
		Link current=first;
		while(current!=null){
			
			current.displayLink();
			current=current.next;
			
		}
		System.out.println(" ");
	}
	
}
