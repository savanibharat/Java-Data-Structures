package com.RobertLafore.SingleLinkedList;

public class LinkListApp {

	public static void main(String args[]){
		
		LinkList theLinkList=new LinkList();
		theLinkList.insertFirst(11, 1.1);
		theLinkList.insertFirst(22, 2.2);
		theLinkList.insertFirst(33, 3.3);
		theLinkList.insertFirst(44, 4.4);
		
		theLinkList.displayList();
		System.out.println();
		System.out.println("Deletion begins");
		System.out.println();
		while(!theLinkList.isEmpty()){
			
			Link aLink=theLinkList.deleteFirst();
			System.out.print("Deleted");
			aLink.display();
			System.out.println(" ");
			
		}
		
		theLinkList.displayList();
		
	}
}
