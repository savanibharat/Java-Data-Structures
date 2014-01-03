package com.Hashing.SeparateChaining;

public class SortedList {
	
	private Link first;	//refer to the first item
	public SortedList(){
		
		first=null;		//Explicitly making object first to null
		
	}
	public void insert(Link theLink){
		
		int key=theLink.getKey();
		Link previous=null;
		Link current=first;
		
		while(current!=null && current.getKey()<key){
			
			previous=current;
			current=current.next;
			
		}
		
		if(previous==null)
			first=theLink;
		else
			previous.next=theLink;
		
		theLink.next=current;
	}
	
	public void delete(int key){
		
		Link previous=null;
		Link current=first;
		
		while(current!=null && current.getKey()!=key){
			
			previous=current;
			current=current.next;
			
		}
		if(previous==null)		//if beginning of list
			first=first.next;	
		else
			previous.next=current.next;
	}
	public Link find(int key){
		
		Link current=first;
		while(current!=null && current.getKey()<=key){
			
			if(current.getKey()==key)
				return current;
			
			current=current.next;
		}
		return null;
		
	}
	public void displayList(){
		
		System.out.print("List {first-->last}: ");
		Link current=first;
		while(current!=null){
			
			current.display();
			current=current.next;
			
		}
		System.out.println();
	}
	
	
	
}
