package com.BinarySearchTree;

/**
 * @author Savani Bharat
 *
 */
public class Node {

	public int iData;
	public Node rightChild;
	public Node leftChild;
public Node() {

}
	public void displayNode() {

		System.out.println(" { " + iData + " } ");

	}

	public Node(int a) {
		iData = a;
	}

}
