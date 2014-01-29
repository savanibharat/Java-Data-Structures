package com.StringToLong.Conversion;

public class Tree {

	private Node root;

	public Tree() {

		root = null;

	}

	public Node findMin(Node node) {
		if (node != null) {
			while (node.leftChild != null) {
				return findMin(node.leftChild);
			}
		}
		return node;
	}

	
	
	  public Node delete(Node node, int value)
	  {
	      if (node.iData > value)
	      {
	          node.leftChild = delete(node.leftChild, value);
	      }
	      else if(node.iData < value)
	      {
	          node.rightChild = delete(node.rightChild, value);
	      }
	      else
	      {
	          if (node.middleChild != null)
	          {
	              node.middleChild = delete(node.middleChild, value);
	          }
	          else if(node.rightChild != null)
	          {
	              int min = findMin(node.rightChild).iData;
	              node.iData = min;
	              node.rightChild = delete(node.rightChild, min);
	          }
	          else
	          {
	              node = node.leftChild;
	          }
	      }
	      return node;
	  }

	public Node insert(int id) {

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
						return newNode;
					}
				}

				else if (id > current.iData) {

					current = current.rightChild;
					if (current == null) {

						parent.rightChild = newNode;
						return newNode;

					}
				}

				else {

					current = current.middleChild;
					if (current == null) {

						parent.middleChild = newNode;
						return newNode;
					}
				}
			}
		}
		return null;

	}

	public void traverse() {

		inOrder(root);

	}

	public void inOrder(Node localRoot) {

		if (localRoot != null) {

			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.middleChild);
			inOrder(localRoot.rightChild);

		}
	}

}