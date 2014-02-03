package com.SinglyLinkedList;

public class LinkList {
	
	public Link firstLink;
	
	public LinkList(){
		
		firstLink=null;
		
	}
	public boolean isEmpty(){
		
		return (firstLink==null);
		
	}
	public void insertFirstLink(String bookName, int sold){
		
		Link newLink=new Link(bookName,sold);
		
		newLink.next=firstLink;
		firstLink=newLink;
		
	}
	public Link removeFirst(){
		
		Link linkReference=firstLink;
		if(!isEmpty()){
			
			firstLink=firstLink.next;
			
		}
		else
		{
			
			System.out.println("LinkList is empty");
			
		}
		return linkReference;
	}
	public void display(){
		int count=0;
		Link theLink=firstLink;
		while(theLink!=null){
			count++;
			theLink.display();System.out.println("Next link "+theLink.next);
			theLink=theLink.next;
			System.out.println();
		}
		System.out.println("Total nodes are "+count);
		System.out.println();
	}
	public Link find(String bookName){
		
		Link theLink=firstLink;
		if(!isEmpty()){
			
			while(theLink.bookName!=bookName){
				
				if(theLink.next==null)
					return null;
				else
					theLink=theLink.next;
			}
		}
		else
			System.out.println("Empty linked list");
		return theLink;	
			}
			
	public Link removeLink(String bookName){
		
		Link currentLink=firstLink;
		Link previousLink=firstLink;
		
		while(currentLink.bookName!=bookName){
			
			if(currentLink.next==null)
				return null;
			else{
				
				previousLink=currentLink;
				currentLink=currentLink.next;
				
			}
			
		}
		if(currentLink==previousLink){
			
			firstLink=firstLink.next;
			
		}
		else
		{
			
			System.out.println("found match");
			System.out.println("current link is "+currentLink);
			System.out.println("firstlink is "+firstLink);
			previousLink.next=currentLink.next;
		}
		return currentLink;
		
	}
		
	}

