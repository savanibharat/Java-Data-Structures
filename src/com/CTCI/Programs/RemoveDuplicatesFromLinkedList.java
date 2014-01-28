package com.CTCI.Programs;

import java.util.Hashtable;

public class RemoveDuplicatesFromLinkedList {
	
	public static void main(String[] args) {
		
		removeDups(LinkedList node);
		
	}
	public static void removeDups(LinkedList n){
		
		Hashtable table=new HashTable();//remember we have used a buffer for this
		LinkedListNode previous=null;
		
		while(n!=null){
			
			if(table.contains(n.data))
				previous.next=n.next;
			else{
				table.put(n.data, true);
				previous=n;
			}
		}
		n=n.next;
	}
}
