package com.SinglyLinkedList.Stack;

public class LinkStackApp {

	public static void main(String args[]){
		
		LinkStack linkStack=new LinkStack();
		linkStack.push((short)10);
		linkStack.push((short)20);
		linkStack.push((short)30);
		linkStack.push((short)40);
		linkStack.push((short)50);
		
		linkStack.displayStack();
		
		linkStack.pop();
		System.out.println();
		linkStack.displayStack();
		
		linkStack.pop();
		System.out.println();
		linkStack.displayStack();
		
	}
	
}
