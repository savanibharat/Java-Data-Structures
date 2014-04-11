package com.BinarySearchTree;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

// TODO: Auto-generated Javadoc
/**
 * The Class Tree.
 *
 * @author Savani Bharat
 */
public class Tree {

	/** The root. */
	private Node root;
	
	/** The sum. */
	static int sum = 0;
	
	/** The s. */
	String s = "";
	
	/** The a. */
	int a[] = new int[20];
	
	/** The j. */
	static int j = 0;
	
	/** The len. */
	int len = 0;

	/**
	 * Instantiates a new tree.
	 */
	public Tree() {

		root = null;

	}

	/**
	 * Find.
	 *
	 * @param key the key
	 * @return the node
	 */
	public Node find(int key) {

		Node current = root;
		while (current.iData != key) {

			if (current.iData > key)
				current = current.leftChild;
			else
				current = current.rightChild;

			if (current == null)
				return null;
		}
		return current;
	}

	/**
	 * Insert.
	 *
	 * @param id the id
	 */
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

	/**
	 * Gets the nodes.
	 *
	 * @return the nodes
	 */
	public void getnodes() {

		List<Integer> list = new ArrayList<Integer>();

	}

	/**
	 * Gets the leafs.
	 *
	 * @return the leafs
	 */
	public void getLeafs() {

		getLeafs(root);

	}

	/**
	 * Gets the leafs.
	 *
	 * @param root the root
	 * @return the leafs
	 */
	public void getLeafs(Node root) {

		Stack<Node> stack = new Stack<Node>();
		if (root == null)
			return;
		stack.push(root);
		while (!stack.isEmpty()) {

			root = stack.pop();
			if (root.leftChild == null && root.rightChild == null) {

				System.out.println("Found leaf " + root.iData);
			}
			if (root.leftChild != null)
				stack.push(root.leftChild);
			if (root.rightChild != null)
				stack.push(root.rightChild);
		}
	}

	/**
	 * Total nodes.
	 */
	public void totalNodes() {

		totalNodes(root);
	}

	/**
	 * Total nodes.
	 *
	 * @param root the root
	 */
	public void totalNodes(Node root) {

		Stack<Node> stack = new Stack<Node>();
		int child = 0;
		if (root == null)
			return;
		stack.push(root);
		child++;
		while (!stack.isEmpty()) {
			root = stack.pop();
			if (root.leftChild != null) {
				stack.push(root.leftChild);
				child++;
			}
			if (root.rightChild != null) {
				stack.push(root.rightChild);
				child++;
			}
		}
		System.out.println("total nodes are " + (child));
	}

	/**
	 * Checks if is balanced.
	 *
	 * @return true, if is balanced
	 */
	public boolean isBalanced() {

		return (maxDepth() - minDept()) <= 1;

	}

	/**
	 * Max depth.
	 *
	 * @return the int
	 */
	public int maxDepth() {
		int maxPath=maxDepth(root);
		//System.out.println("max path is "+maxPath);
		return maxPath;
	}

	/**
	 * Max depth.
	 *
	 * @param root the root
	 * @return the int
	 */
	public int maxDepth(Node root) {
		if (root == null)
			return 0;
		return 1 + Math 
				.max(maxDepth(root.leftChild), maxDepth(root.rightChild));
	}
	
	/**
	 * Min dept.
	 *
	 * @return the int
	 */
	public int minDept() {
		return minDepth(root);
	}

	/**
	 * Min depth.
	 *
	 * @param root the root
	 * @return the int
	 */
	public int minDepth(Node root) {
		if (root == null)
			return 0;
		return 1 + Math
				.min(minDepth(root.leftChild), minDepth(root.rightChild));
	}

	/**
	 * Array to bst.
	 */
	public void arrayToBst() {

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Node node = makeTree(a, 0, a.length);
		traverseMakeTree(node);
	}

	/**
	 * Make tree.
	 *
	 * @param a the a
	 * @param start the start
	 * @param end the end
	 * @return the node
	 */
	public Node makeTree(int a[], int start, int end) {

		if (start < end) {
			int mid = (end - start) / 2 + start;
			Node n = new Node(a[mid]);
			n.leftChild = makeTree(a, start, mid);
			n.rightChild = makeTree(a, mid + 1, end);
			return n;
		}
		return null;

		/*
		 * if(start==end){ return new Node(a[start]); }
		 * 
		 * int mid=(start+end)/2; Node node=new Node(a[mid]);
		 * 
		 * if(mid>start) node.leftChild=makeTree(a, start, mid-1);
		 * node.rightChild=makeTree(a,mid+1,end);
		 * 
		 * return node;
		 */
	}

	/**
	 * Traverse make tree.
	 *
	 * @param node the node
	 */
	public void traverseMakeTree(Node node) {
		if (node != null) {
			traverseMakeTree(node.leftChild);
			node.displayNode();
			traverseMakeTree(node.rightChild);
		}
	}

	/**
	 * Prints the tree.
	 */
	public void printTree() {

		// printing(root);
		// printLevelOrderBFS(root);
		printTree(root);

	}

	/**
	 * Prints the tree.
	 *
	 * @param root the root
	 */
	public void printTree(Node root) {

		Queue<Node> currentLevel = new LinkedList<Node>();
		Queue<Node> nextLevel = new LinkedList<Node>();
		int l = 0, r = 0;
		currentLevel.add(root);
		while (!currentLevel.isEmpty()) {

			Iterator<Node> iter = currentLevel.iterator();
			while (iter.hasNext()) {

				Node currentNode = iter.next();
				// System.out.println("currentnode is "+currentNode.iData);
				if (currentNode.leftChild != null) {
					nextLevel.add(currentNode.leftChild);
					l++;
				}
				if (currentNode.rightChild != null) {
					nextLevel.add(currentNode.rightChild);
					r++;
				}
				System.out.print(currentNode.iData + " ");
			}
			System.out.println();
			currentLevel = nextLevel;
			nextLevel = new LinkedList<Node>();
		}
		System.out.println("l is " + l + " r is " + r);
	}

	/*
	 * public void breadthFirstNonRecursive() { Queue<BinaryNode> queue = new
	 * java.util.LinkedList<BinaryNode>(); queue.offer(root); while
	 * (!queue.isEmpty()) { BinaryNode node = queue.poll();
	 * System.out.println(node.element); if (node.left != null)
	 * queue.offer(node.left); if (node.right != null) queue.offer(node.right);
	 * } }
	 */
	/**
	 * Printing.
	 *
	 * @param root the root
	 */
	public void printing(Node root) {

		Queue<Node> currentLevel = new LinkedList<Node>();
		Queue<Node> nextLevel = new LinkedList<Node>();

		currentLevel.add(root);
		while (!currentLevel.isEmpty()) {

			Iterator<Node> iter = currentLevel.iterator();
			while (iter.hasNext()) {

				Node currentNode = iter.next();
				if (currentNode.leftChild != null) {
					nextLevel.add(currentNode.leftChild);
				}
				if (currentNode.rightChild != null) {
					nextLevel.add(currentNode.rightChild);
				}
				System.out.print(currentNode.iData + " ");
			}
			System.out.println();
			currentLevel = nextLevel;
			nextLevel = new LinkedList<Node>();
		}
	}

	/**
	 * Prints the inorder.
	 */
	public void printInorder() {
		printInorder(root);
	}

	/**
	 * Prints the inorder.
	 *
	 * @param root the root
	 */
	public void printInorder(Node root) {

		if (root == null)
			return;

		Stack<Node> stack = new Stack<Node>();
		boolean done = false;
		while (!done) {

			if (root != null) {
				stack.push(root);
				root = root.leftChild;
			} else {
				if (stack.isEmpty()) {
					done = true;
				} else {
					root = stack.pop();
					System.out.println(root.iData);
					root = root.rightChild;
				}
			}
		}
	}

	/**
	 * Prints the pre order.
	 */
	public void printPreOrder() {
		printPreOrder(root);
	}

	/**
	 * Prints the pre order.
	 *
	 * @param root the root
	 */
	public void printPreOrder(Node root) {

		if (root == null)
			return;
		Stack<Node> stack = new Stack<Node>();
		boolean done = false;
		while (!done) {

			if (root != null) {
				stack.push(root);
				System.out.println(root.iData);
				root = root.leftChild;
			} else {
				if (stack.isEmpty()) {
					done = true;
				} else {
					root = stack.pop();
					root = root.rightChild;
				}
			}
		}
	}

	/**
	 * Prints the post order.
	 */
	public void printPostOrder() {
		mypostorder(root);
	}

	/**
	 * Postorder.
	 *
	 * @param root the root
	 */
	private void postorder(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> stack = new Stack<Node>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node next = stack.peek();
			if (next.rightChild == root || next.leftChild == root
					|| (next.leftChild == null && next.rightChild == null)) {
				stack.pop();
				System.out.println(next.iData);
				root = next;
			} else {
				if (next.rightChild != null) {
					stack.push(next.rightChild);
				}
				if (next.leftChild != null) {
					stack.push(next.leftChild);
				}
			}
		}
	}

	/**
	 * Mypostorder.
	 *
	 * @param root the root
	 */
	public void mypostorder(Node root){
		
		Stack<Node> stack=new Stack<Node>();
		stack.push(root);
		while(!stack.isEmpty()){
			
			Node next=stack.peek();
			if((next.leftChild==null&&next.rightChild==null)||next.leftChild==root||next.rightChild==root){
				stack.pop();
				System.out.println(next.iData);
				root=next;
			}
			else{
				if(next.rightChild!=null)
					stack.push(next.rightChild);
				if(next.leftChild!=null)
					stack.push(next.leftChild);
			}
		}
	}
	
	/**
	 * Prints the post order.
	 *
	 * @param root the root
	 */
	public void printPostOrder(Node root) {

		if (root == null)
			return;
		Stack<Node> stack = new Stack<Node>();
		do {

			while (root != null) {

				if (root.rightChild != null)
					stack.push(root.rightChild);
				stack.push(root);
				root = root.leftChild;
			}

			root = stack.pop();
			if ((root.rightChild != null) && (stack.peek() == root.rightChild)) {
				stack.pop();
				stack.push(root);
				root = root.rightChild;
			} else {
				System.out.println(root.iData);
				root = null;
			}
		} while (!stack.isEmpty());

	}

	/**
	 * Prints the level order bfs.
	 *
	 * @param root the root
	 */
	public void printLevelOrderBFS(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		int currentLevelCount = 1;
		int nextLevelCount = 0;

		while (!queue.isEmpty()) {
			Node n = queue.remove();
			System.out.print(n.iData + " ");
			if (n.leftChild != null) {
				queue.add(n.leftChild);
				nextLevelCount++;
			}
			if (n.rightChild != null) {
				queue.add(n.rightChild);
				nextLevelCount++;
			}
			currentLevelCount--;
			if (currentLevelCount == 0) {
				System.out.println("");
				currentLevelCount = nextLevelCount;
				nextLevelCount = 0;
			}
		}
	}

	/*
	 * public void breadthFirstNonRecursive() { Queue<BinaryNode> queue = new
	 * java.util.LinkedList<BinaryNode>(); queue.offer(root); while
	 * (!queue.isEmpty()) { BinaryNode node = queue.poll();
	 * System.out.println(node.element); if (node.left != null)
	 * queue.offer(node.left); if (node.right != null) queue.offer(node.right);
	 * } }
	 */
	/**
	 * Traverse.
	 */
	public void traverse() {

		inOrder(root);

	}

	/**
	 * Reverse inordertraverse.
	 */
	public void reverseInordertraverse() {

		reverseInOrder(root);

	}

	/**
	 * Sumof all greater.
	 */
	public void sumofAllGreater() {

		sumofallgreater(root);

	}

	// Serialize a
	// tree--------------------------------------------------------------------

	/**
	 * Serialize tree.
	 *
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void serializeTree() throws IOException {

		BufferedWriter bw = new BufferedWriter(new FileWriter(new File(
				"TreeSerialization.txt"), true));
		serializeTree(root, bw);
		System.out.println();

	}

	/**
	 * Serialize tree.
	 *
	 * @param root the root
	 * @param bw the bw
	 * @throws IOException Signals that an I/O exception has occurred.
	 */
	public void serializeTree(Node root, BufferedWriter bw) throws IOException {
		// 1053##7##1514##16##

		if (root == null) {
			bw.write("#");
			System.out.print("#");
		} else {
			bw.write(root.iData);
			System.out.print(root.iData);
			serializeTree(root.leftChild, bw);
			serializeTree(root.rightChild, bw);

		}
	}

	// ------------------------------------------------------------------------------------

	// Deserialize a
	// tree------------------------------------------------------------------

	// ------------------------------------------------------------------------------------
	/**
	 * Sumofallgreater.
	 *
	 * @param root the root
	 */
	public void sumofallgreater(Node root) {
		if (root == null)
			return;
		sumofallgreater(root.rightChild);

		sum += root.iData;
		System.out.println("root.idata is " + root.iData);
		System.out.println("sum is " + sum);
		root.iData = sum - root.iData;
		System.out.println("root.iData=sum-root.iData :: new root.idata is "
				+ root.iData);
		System.out.println();
		sumofallgreater(root.leftChild);

	}


	/**
	 * Prints the paths.
	 */
	public void printPaths() {

		int c[]=printPaths(root, a, 0);
		printMaxPath(c);
	}

	/**
	 * Prints the paths.
	 *
	 * @param node the node
	 * @param path the path
	 * @param arrayCounter the array counter
	 * @return the int[]
	 */
	public int[] printPaths(Node node, int[] path, int arrayCounter) {
		if (node == null) {
			return null;
		}

		path[arrayCounter++] = node.iData;
		for (int i = 0; i < path.length; i++) {
			System.out.print(" path "+path[i]);
		}
		System.out.println();
		if (node.leftChild == null && node.rightChild == null) {
			for (int i = 0; i < path.length; i++) {

				if (path[i] > 0) {
					System.out.print(path[i]+" ");
				}

			}
			System.out.println();
			return path;
		} else {
			printPaths(node.leftChild, path, arrayCounter);
			printPaths(node.rightChild, path, arrayCounter);
		}
		return path;
	}

	/**
	 * Prints the max path.
	 */
	public void printMaxPath() {

		printMaxPath(a);
	}

	/**
	 * Prints the max path.
	 *
	 * @param a the a
	 */
	public void printMaxPath(int[] a) {
		System.out.println("max path ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0)
				System.out.print(a[i]+" ");
		}
	}

	/**
	 * In order.
	 *
	 * @param localRoot the local root
	 */
	public void inOrder(Node localRoot) {

		if (localRoot != null) {

			inOrder(localRoot.leftChild);
			localRoot.displayNode();
			inOrder(localRoot.rightChild);

		}
	}

	/**
	 * Reverse in order.
	 *
	 * @param localRoot the local root
	 */
	public void reverseInOrder(Node localRoot) {

		if (localRoot != null) {

			inOrder(localRoot.rightChild);
			localRoot.displayNode();
			inOrder(localRoot.leftChild);

		}
	}

	/**
	 * Delete.
	 *
	 * @param key the key
	 * @return true, if successful
	 */
	public boolean delete(int key) {

		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;

		while (current.iData != key) {

			parent = current;
			if (key < current.iData) {

				isLeftChild = true;
				current = current.leftChild;
			} else {

				isLeftChild = false;
				current = current.rightChild;

			}
			if (current == null)
				return false;

		}
		// If no childer simply delete it
		if (current.leftChild == null && current.rightChild == null) {

			if (current == root)
				root = null;
			else if (isLeftChild)
				parent.leftChild = null; // disconnect from parent
			else
				parent.rightChild = null;
		}
		// if no right child replace with left subtree
		else if (current.rightChild == null)
			if (current == root)
				root = current.leftChild;
			else if (isLeftChild)
				parent.leftChild = current.leftChild;
			else
				parent.rightChild = current.leftChild;

		else// two children so replace with inorder successor
		{
			// getSuccessor of node to delete(current)
			Node successor = getSuccessor(current);
			// connect parent of current to successor instead
			if (current == root)
				root = successor;
			else if (isLeftChild)
				parent.leftChild = successor;
			else
				parent.rightChild = successor;
			// connect successor to current's left child
			successor.leftChild = current.leftChild;
		}
		return true;
	}

	/**
	 * Gets the successor.
	 *
	 * @param delNode the del node
	 * @return the successor
	 */
	private Node getSuccessor(Node delNode) {

		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;// go to right child
		while (current != null) { // till no more left children found

			successorParent = successor;
			successor = current;
			current = current.leftChild; // go to left child

		}
		if (successor != delNode.rightChild) {

			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;

		}
		return successor;

	}
}