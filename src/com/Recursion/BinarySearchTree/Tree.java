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
	public boolean delete(int key){
		
		Node current=root;
		Node parent=root;
		boolean isLeftChild=true;
		
		while(current.iData!=key){
			
			parent=current;
			if(key<current.iData){
				
				isLeftChild=true;
				current=current.leftChild;
			}
			else{
				
				isLeftChild=false;
				current=current.rightChild;
				
			}
			if(current==null)
				return false;
			
		}
		//If no childer simply delete it
		if(current.leftChild==null && current.rightChild==null){
			
			if(current==root)
				root=null;
			else if(isLeftChild)
				parent.leftChild=null; //disconnect from parent
			else
				parent.rightChild=null;
		}
		//if no right child replace with left subtree
		else if(current.rightChild==null)
			if(current==root)
				root=current.leftChild;
			else if(isLeftChild)
				parent.leftChild=current.leftChild;
			else
				parent.rightChild=current.leftChild;
		
		else//two children so replace with inorder successor
		{
			//getSuccessor of node to delete(current)
			Node successor=getSuccessor(current);
			//connect parent of current to successor instead
			if(current==root)
				root=successor;
			else if(isLeftChild)
				parent.leftChild=successor;
			else
				parent.rightChild=successor;
			//connect successor to current's left child
			successor.leftChild=current.leftChild;
		}
		return true;
		}
		private Node getSuccessor(Node delNode){
			
			Node successorParent=delNode;
			Node successor = delNode;
			Node current=delNode.rightChild;//go to right child 
			while(current!=null){           //till no more left children found 
				
				successorParent=successor;
				successor=current;
				current=current.leftChild; // go to left child
				
			}
			if(successor!=delNode.rightChild){
				
				successorParent.leftChild=successor.rightChild;
				successor.rightChild=delNode.rightChild;
				
			}
			return successor;
			
			
	}
}