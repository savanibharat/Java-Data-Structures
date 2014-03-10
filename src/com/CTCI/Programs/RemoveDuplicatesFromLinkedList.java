package com.CTCI.Programs;

import java.util.Hashtable;

public class RemoveDuplicatesFromLinkedList {
	static int i=0;
	public static void main(String[] args) {

		// removeDups(LinkedList node);
		for (int i = 0; i < 100; i++) {
			removeDups(i);

		}
	}

	public static void removeDups(int h) {// LinkedList n){

		// int h=2;
		h ^= (h >>> 20) ^ (h >>> 12);
		// System.out.println(h);
		int a = h ^ (h >>> 7) ^ (h >>> 4);
		System.out.println("for i = " + i + " " + a);
		i++;
		
		/*
		 * Hashtable table=new HashTable();//remember we have used a buffer for
		 * this LinkedListNode previous=null;
		 * 
		 * while(n!=null){
		 * 
		 * if(table.contains(n.data)) previous.next=n.next; else{
		 * table.put(n.data, true); previous=n; } } n=n.next;
		 */
		}
}
