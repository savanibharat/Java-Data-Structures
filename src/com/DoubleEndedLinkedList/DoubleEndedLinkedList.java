package com.DoubleEndedLinkedList;

public class DoubleEndedLinkedList {

	Neighbor firstLink;
	Neighbor lastLink;

	public void insertInFirstPosition(String homeOwnerName, int houseNumber) {

		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);

		if (isEmpty()) {

			lastLink = theNewLink;

		} else {

			firstLink.previous = theNewLink;

		}
		theNewLink.next = firstLink;
		firstLink = theNewLink;
	}

	public void insertInLastPosition(String homeOwnerName, int houseNumber) {

		Neighbor theNewLink = new Neighbor(homeOwnerName, houseNumber);
		if (isEmpty()) {

			lastLink = theNewLink;

		}
		else{
			
			lastLink.next=theNewLink;
			theNewLink.previous=lastLink;
			
		}
		lastLink=theNewLink;
	}
	public boolean isEmpty(){
		
		return (firstLink==null);
		
	}
	public void display(){
		
		Neighbor theLink=firstLink;
		while(theLink!=null){
			
			theLink.display();
			System.out.println("next link is "+theLink.next);
			theLink=theLink.next;
			System.out.println();
			
		}
	}
	public void insertInOrder(String homeOwnerName, int houseNumber){
		
		Neighbor theNewLink=new Neighbor(homeOwnerName, houseNumber);
		Neighbor previousNeighbor=null;
		Neighbor currentNeighbor=firstLink;
		
		while((currentNeighbor!=null)&& (houseNumber>currentNeighbor.houseNumber)){
			
			previousNeighbor=currentNeighbor;
			currentNeighbor=currentNeighbor.next;
			
		}
		if(previousNeighbor==null){
			firstLink=theNewLink;
			
		}
		else{
			
			previousNeighbor.next=theNewLink;
			
		}
		theNewLink.next=currentNeighbor;
		
		
	}
	public boolean insertAfterKey(String homeOwnerName, int houseNumber,int key){
		
		Neighbor theNewLink=new Neighbor(homeOwnerName, houseNumber);
		Neighbor currentNeighbor=firstLink;
		while(currentNeighbor.houseNumber!=key){
			
			currentNeighbor=currentNeighbor.next;
			if(currentNeighbor==null)
				return false;
			
		}
		if(currentNeighbor==lastLink){
			
			theNewLink.next=null;
			lastLink=theNewLink;
			
		}
		else{
			
			theNewLink.next=currentNeighbor.next;
			currentNeighbor.next.previous=theNewLink;
			
		}
		theNewLink.previous=currentNeighbor;
		currentNeighbor.next=theNewLink;
		return true;
		
	}
	
	public static void main(String[] args) {
		
		DoubleEndedLinkedList dll=new DoubleEndedLinkedList();
		dll.insertInFirstPosition("ABC", 1);
		dll.insertInFirstPosition("DEF", 2);
		dll.insertInLastPosition("XYZ", 100);
		dll.insertInFirstPosition("GHI", 3);
		dll.insertInFirstPosition("JKL", 4);
		dll.display();
		System.out.println();
		NeighborIterator neighbors=new NeighborIterator(dll);
		System.out.println("Iterator in action");
		neighbors.currentNeighbor.display();
		System.out.println();
		System.out.println(neighbors.hasNext());
		neighbors.next();
		neighbors.currentNeighbor.display();
		neighbors.remove();
		neighbors.currentNeighbor.display();
		System.out.println();
		System.out.println("All dislplay");
		System.out.println();
		dll.display();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}




































