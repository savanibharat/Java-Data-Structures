package com.Recursion.BinarySearchTree;

public class Tree {

	private Node root;

	public Tree() {

		root = null;

	}

	public Node find(int key) {
		
		Node current=root;
		while(current.iData!=key){
			
			if(current.iData>key)
				current=current.leftChild;
			else
				current=current.rightChild;
			
			if(current==null)
				return null;
		}
		return current;
	}

	public void insert(int id) {

		Node newNode = new Node();
		newNode.iData = id;

		if (root == null)
			root = newNode;
		else {// root occupied

			Node current = root;
			Node parent;
			while (true) {

				parent = current;
				if (id < current.iData) {

					current = current.leftChild;
					if (current == null) {
						parent.leftChild = newNode;
						return;
					}
				} else {

					current = current.rightChild;
					if (current == null) {

						parent.rightChild = newNode;
						return;

					}
				}
			}
		}

	}

	public void traverse() {

		inOrder(root);

	}

	public void inOrder(Node localRoot) {

		if (localRoot != null) {

			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);

		}
	}
}
