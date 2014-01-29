package com.StringToLong.Conversion;

public class TreeApp {
	public static void main(String[] args) {

		Tree theTree = new Tree();
		Node node=new Node();
		theTree.insert(9);
		theTree.insert(5);
		theTree.insert(2);
		theTree.insert(5);
		theTree.insert(6);
		theTree.insert(10);
		node=theTree.insert(15);
		theTree.insert(12);
		theTree.insert(20);
		theTree.traverse();
		theTree.delete(node, 15);
		System.out.println();
		System.out.println();
		theTree.traverse();
		
	}
}
