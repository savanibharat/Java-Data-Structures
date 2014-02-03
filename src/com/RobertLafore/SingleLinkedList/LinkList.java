package com.RobertLafore.SingleLinkedList;

import java.util.Arrays;

//Refered book of Robert Lafore for Data Structures
public class LinkList {

	private Link first;

	public LinkList() {

		first = null; // by default link is null but if you want to set null
						// explicitly then this is how you do it

	}

	public boolean isEmpty() {

		return (first == null);

	}

	public void insertFirst(int iData, double dData) {

		Link newLink = new Link(iData, dData);
		newLink.next = first;
		first = newLink;

	}

	public Link deleteFirst() {

		Link temp = first;
		first = first.next;
		return temp;

	}

	public Link find(int key) {

		Link current = first;
		while (current.iData != key) {

			if (current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;

	}

	public Link delete(int key) {

		Link current = first;
		Link previous = first;
		while (current.iData != key) {

			if (current.next == null)
				return null;
			else {

				previous = current;
				current = current.next;

			}
		}
		if (current == first)
			first = first.next;
		else
			previous.next = current.next;

		return current;

	}

	public void displayList() {

		System.out.print("List (first-->last):");
		Link current = first;
		while (current != null) {

			current.display();
			current = current.next;
		}

	}
	public void sort(){
	Link pn = first; // previous to n
	for(Link n=first.next; n != null; n = n.next) {
		Link pi = null; // previous to i
		Link i;
	  for(i = first; i != n && i.iData < n.iData; i = i.next) 
	    pi = i;
	  // change pointers from pi -> i and pn -> n -> n.next
	  // to pi->n->i and pn->n.next
	  if(pi == null) 
		  first = n;
	  else pi.next = n;
	  pn.next = n.next;
	  n.next = i;
	  pn = n;
	  }
	}

}
