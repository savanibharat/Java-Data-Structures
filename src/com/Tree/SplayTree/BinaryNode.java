package com.Tree.SplayTree;

public class BinaryNode {

	Comparable key;
	BinaryNode left;
	BinaryNode right;
	
	BinaryNode(Comparable theKey){
		
		key=theKey;
		left=right=null;
	}
	
public void displayNode(){
		
		System.out.println(" { "+key+" } ");
		
	}
	
}

