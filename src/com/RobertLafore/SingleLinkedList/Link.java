package com.RobertLafore.SingleLinkedList;
//Refered book of Robert Lafore for Data Structures
public class Link {

	public int iData;
	public double dData;
	public Link next;
	
	public Link(int iData, double dData){
		
		this.iData=iData;
		this.dData=dData;
		next=null; //by default link is null but if you want to set null explicitly then this is how you do it
		
	}
	
	public void display(){
		
		System.out.print("{ "+iData+", "+dData+" }");
		
	}
}
