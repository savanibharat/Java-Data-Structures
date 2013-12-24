package com.DoubleEndedLinkedList;

public class Neighbor {
	
	public String homeOwnerName;
	public int houseNumber;
	public Neighbor next;
	public Neighbor previous;
	
	public Neighbor(String homeOwnerName,int houseNumber){
		
		this.homeOwnerName=homeOwnerName;
		this.houseNumber=houseNumber;
		
	}
	public void display(){
		
		System.out.println(homeOwnerName+": "+houseNumber+" private drive");
		
	}
	public String toString(){
		
		return homeOwnerName;
		
	}
}
