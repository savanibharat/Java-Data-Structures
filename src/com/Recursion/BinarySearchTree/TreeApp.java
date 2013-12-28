package com.Recursion.BinarySearchTree;

public class TreeApp {
	public static void main(String[] args) {

		int value;
		Tree theTree = new Tree();
		Node node;
		theTree.insert(10);
		theTree.insert(5);
		theTree.insert(4);
		theTree.insert(6);
		theTree.insert(15);
		theTree.insert(14);
		theTree.insert(16);
		theTree.traverse();
		node=theTree.find(1);
		if(node!=null)
			System.out.println("found");
		else
			System.out.println("Not found");
		}
}
