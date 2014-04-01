package com.Recursion.BinarySearchTree;

public class TreeApp {
	public static void main(String[] args) {

		Tree theTree = new Tree();
		Node node;
		
		theTree.insert(5);
		theTree.insert(1);
		theTree.insert(6);
		
		
		/*theTree.insert(10);
		theTree.insert(5);
		theTree.insert(3);
		theTree.insert(1);
		theTree.insert(7);
		theTree.insert(15);
		theTree.insert(14);
		theTree.insert(16);
*/		theTree.traverse();
		node = theTree.find(1);
		if (node != null)
			System.out.println("found");
		else
			System.out.println("Not found");
		//theTree.delete(10);
		theTree.traverse();
		System.out.println();
		theTree.sumofAllGreater();
		theTree.traverse();
		//theTree.reverseInordertraverse();
		
	}
}
