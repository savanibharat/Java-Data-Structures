package com.SinglyLinkedList;

public class Link {
	
	public String bookName;
	public int sold;
	public Link next;
	
	public Link(String bookName, int sold) {
		
		this.bookName=bookName;
		this.sold=sold;
		
	}
	public void display(){
		
		System.out.println(bookName+" : soldcopies : "+sold);
		
	}
	public String toString(){
		
		return bookName;
		
	}
	
	public static void main(String[] args) {
		
		LinkList theLinkList=new LinkList();
		theLinkList.insertFirstLink("ABC", 1);
		theLinkList.insertFirstLink("DEF", 2);
		theLinkList.insertFirstLink("GHI", 3);
		theLinkList.insertFirstLink("JKL", 4);
		theLinkList.display();
		theLinkList.removeFirst();
		theLinkList.display();
		theLinkList.removeLink("DEF");
		System.out.println("one link removed");
		theLinkList.display();
	}
}
