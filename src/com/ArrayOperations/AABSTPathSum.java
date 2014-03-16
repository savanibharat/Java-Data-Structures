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

		/*
		 * tree.printAllPathWithSum(1); tree.printAllPathWithSum(0);
		 * tree.printAllPathWithSum(16); tree.printAllPathWithSum(9);
		 */
		System.out.println();
		//tree.printAllPathToLeafNonRecursive();
		//tree.printAllPathToLeafNonRecursive();
	}

}