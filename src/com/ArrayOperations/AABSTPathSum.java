package com.ArrayOperations;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class AABSTPathSum {

	private class Node {
		int data;
		Node left;
		Node right;

		Node(int v, Node left, Node right) {
			data = v;
			this.left = left;
			this.right = right;
		}

		public boolean isLeaf(Node a) {

			if (a.left == null && a.right == null)
				return true;
			return false;

		}
	}

	public Node root;

	public void insertNode(int data) {
		if (root == null) {
			root = new Node(data, null, null);
			return;
		}
		Node cur = root;
		do {
			if (data >= cur.data) {
				if (cur.right != null)
					cur = cur.right;
				else {
					cur.right = new Node(data, null, null);
					return;
				}
			} else {
				if (cur.left != null)
					cur = cur.left;
				else {
					cur.left = new Node(data, null, null);
					return;
				}
			}
		} while (cur != null);
	}

	public void inorder() {
		System.out.println("\nin-order :");
		printSubTreeInOrder(root);
	}

	public void preorder() {
		System.out.println("\npre-order :");
		printSubTreePreOrder(root);
	}

	private void printSubTreeInOrder(Node p) {
		if (p.left != null)
			printSubTreeInOrder(p.left);
		System.out.print("\t" + p.data);
		if (p.right != null)
			printSubTreeInOrder(p.right);
	}

	private void printSubTreePreOrder(Node p) {
		System.out.print("\t" + p.data);
		if (p.left != null)
			printSubTreePreOrder(p.left);
		if (p.right != null)
			printSubTreePreOrder(p.right);
	}

	private void printPath(Stack<Node> path) {
		System.out.print("\nFind Path:");
		for (Node n : path) {
			System.out.print("\t" + n.data);
		}
	}

	public void printAllPathWithSum(int sum) {
		Stack<Node> path = new Stack<Node>();
		findPath(root, sum, path);
	}

	private void findPath(Node p, int value, Stack<Node> path) {
		if (p == null)
			return;
		if (p.data == value) {
			path.push(p);
			printPath(path);
			path.pop();
		} else {
			path.push(p);
			if (p.left != null)
				findPath(p.left, value - p.data, path);
			if (p.right != null)
				findPath(p.right, value - p.data, path);
			path.pop();
		}
		if (p.left != null)
			findPath(p.left, value, path);
		if (p.right != null)
			findPath(p.right, value, path);
	}

	public void printAllPathToLeafNonRecursive() {

		printAllPathToLeafNonRecursive(root);

	}

	public void printAllPathToLeafNonRecursive(Node root) {

		if (root == null) {
			return;
		}

		Queue<Object> q = new LinkedList<Object>();
		q.add(root);
		q.add(root.data + "");
		int add = 0;
		int a[] = new int[20];
		int j = 0;
		while (!q.isEmpty()) {

			Node head = (Node) q.poll();
			String headPath = (String) q.poll();

			if (head.isLeaf(head)) {
				System.out.println(headPath + " ");
				String s[] = headPath.split("->");
				int pathSum = 0;
				for (int i = 0; i < s.length; i++) {
					pathSum = pathSum + Integer.valueOf(s[i]);
				}
				a[j] = pathSum;
				j++;
				System.out.println("Path sum is " + pathSum);
				continue;
			}

			if (head.left != null) {
				String leftStr = headPath + "->" + head.left.data;

				q.add(head.left);
				q.add(leftStr);
			}

			if (head.right != null) {
				String rightStr = headPath + "->" + head.right.data;
				// add=add+head.right.data;
				q.add(head.right);
				q.add(rightStr);
			}
		}
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > 0) {
				max = a[i];
				if (max < a[i])
					max = a[i];
			}
		}
		System.out.println(max + "is max");

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AABSTPathSum tree = new AABSTPathSum();
		tree.insertNode(10);
		tree.insertNode(5);
		tree.insertNode(1);
		tree.insertNode(6);
		tree.insertNode(9);
		tree.insertNode(20);
		tree.insertNode(8);

		
		tree.printAllPathWithSum(1); tree.printAllPathWithSum(0);
		tree.printAllPathWithSum(16); tree.printAllPathWithSum(9);
		System.out.println();
		tree.printAllPathToLeafNonRecursive();
	}

}
/*
 * printAllPathToLeafNonRecursive()
 * 
 * 
10->20 
Path sum is 30
10->5->1 
Path sum is 16
10->5->6->9->8 
Path sum is 38
38is max

 */
