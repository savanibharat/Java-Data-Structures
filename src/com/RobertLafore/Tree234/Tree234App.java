package com.RobertLafore.Tree234;

import java.io.IOException;

class Tree234App {
	public static void main(String[] args) throws IOException {
		long value;
		Tree234 theTree = new Tree234();
		theTree.insert(70);
		theTree.insert(50);
		theTree.insert(30);
		theTree.insert(40);
		theTree.insert(20);
		theTree.insert(80);
		theTree.insert(25);
		theTree.insert(90);
		theTree.insert(75);
		theTree.insert(10);
		theTree.displayTree();
		int found = theTree.find(70);
	}
}
