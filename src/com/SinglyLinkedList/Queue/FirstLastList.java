package com.SinglyLinkedList.Queue;

public class FirstLastList {

	private Link first;
	private Link last;

	public FirstLastList() {

		first=null;
		last=null;
		
	}
	public boolean isEmpty(){
		
		return (first==null);
		
	}
	public void insertFirst(int iData){
		
		Link newLink=new Link(iData);
		if(isEmpty())
			first=newLink;
		else 
			last.next=newLink;
		last=newLink;
				
	}
	public int deleteFirst(){
		
		int temp=first.iData;
		if(first.next==null)
			last=null;
		else
			first=first.next;
		return temp;
	}
	public void displayList(){
		
		Link current=first;
		while(current!=null){
			
			current.displayLink();
			current=current.next;
			
		}
		System.out.println();
	}

}
