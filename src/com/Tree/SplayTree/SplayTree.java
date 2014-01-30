package com.Tree.SplayTree;

import com.StringToLong.Conversion.Node;

public class SplayTree {
	private BinaryNode root;

	public SplayTree() {
		root = null;
	}

	/**
	 * Insert into the tree.
	 * 
	 * @param x
	 *            the item to insert.
	 * @throws DuplicateItemException
	 *             if x is already present.
	 */
	public void insert(Comparable key) {
		BinaryNode n;
		int c;
		if (root == null) {
			root = new BinaryNode(key);
			return;
		}
		splay(key);
		if ((c = key.compareTo(root.key)) == 0) {
			// throw new DuplicateItemException(x.toString());
			return;
		}
		n = new BinaryNode(key);
		if (c < 0) {
			n.left = root.left;
			n.right = root;
			root.left = null;
		} else {
			n.right = root.right;
			n.left = root;
			root.right = null;
		}
		root = n;
	}

	/**
	 * Remove from the tree.
	 * 
	 * @param x
	 *            the item to remove.
	 * @throws ItemNotFoundException
	 *             if x is not found.
	 */
	public void remove(Comparable key) {
		BinaryNode x;
		splay(key);
		if (key.compareTo(root.key) != 0) {
			// throw new ItemNotFoundException(x.toString());
			return;
		}
		// Now delete the root
		if (root.left == null) {
			root = root.right;
		} else {
			x = root.right;
			root = root.left;
			splay(key);
			root.right = x;
		}
	}

	/**
	 * Find the smallest item in the tree.
	 */
	public Comparable findMin() {
		BinaryNode x = root;
		if (root == null)
			return null;
		while (x.left != null)
			x = x.left;
		splay(x.key);
		return x.key;
	}

	/**
	 * Find the largest item in the tree.
	 */
	public Comparable findMax() {
		BinaryNode x = root;
		if (root == null)
			return null;
		while (x.right != null)
			x = x.right;
		splay(x.key);
		return x.key;
	}

	/**
	 * Find an item in the tree.
	 */
	public Comparable find(Comparable key) {
		if (root == null)
			return null;
		splay(key);
		if (root.key.compareTo(key) != 0)
			return null;
		return root.key;
	}

	/**
	 * Test if the tree is logically empty.
	 * 
	 * @return true if empty, false otherwise.
	 */
	public boolean isEmpty() {
		return root == null;
	}

	/**
	 * this method just illustrates the top-down method of implementing the
	 * move-to-root operation
	 */
	private void moveToRoot(Comparable key) {
		BinaryNode l, r, t, y;
		l = r = header;
		t = root;
		header.left = header.right = null;
		for (;;) {
			if (key.compareTo(t.key) < 0) {
				if (t.left == null)
					break;
				r.left = t; /* link right */
				r = t;
				t = t.left;
			} else if (key.compareTo(t.key) > 0) {
				if (t.right == null)
					break;
				l.right = t; /* link left */
				l = t;
				t = t.right;
			} else {
				break;
			}
		}
		l.right = t.left; /* assemble */
		r.left = t.right;
		t.left = header.right;
		t.right = header.left;
		root = t;
	}

	private static BinaryNode header = new BinaryNode(null); // For splay

	/**
	 * Internal method to perform a top-down splay.
	 * 
	 * splay(key) does the splay operation on the given key. If key is in the
	 * tree, then the BinaryNode containing that key becomes the root. If key is
	 * not in the tree, then after the splay, key.root is either the greatest
	 * key < key in the tree, or the lest key > key in the tree.
	 * 
	 * This means, among other things, that if you splay with a key that's
	 * larger than any in the tree, the rightmost node of the tree becomes the
	 * root. This property is used in the delete() method.
	 */

	private void splay(Comparable key) {
		BinaryNode l, r, t, y;
		l = r = header;
		t = root;
		header.left = header.right = null;
		for (;;) {
			if (key.compareTo(t.key) < 0) {
				if (t.left == null)
					break;
				if (key.compareTo(t.left.key) < 0) {
					y = t.left; /* rotate right */
					t.left = y.right;
					y.right = t;
					t = y;
					if (t.left == null)
						break;
				}
				r.left = t; /* link right */
				r = t;
				t = t.left;
			} else if (key.compareTo(t.key) > 0) {
				if (t.right == null)
					break;
				if (key.compareTo(t.right.key) > 0) {
					y = t.right; /* rotate left */
					t.right = y.left;
					y.left = t;
					t = y;
					if (t.right == null)
						break;
				}
				l.right = t; /* link left */
				l = t;
				t = t.right;
			} else {
				break;
			}
		}
		l.right = t.left; /* assemble */
		r.left = t.right;
		t.left = header.right;
		t.right = header.left;
		root = t;
	}

	public void traverse() {

		inOrder(root);

	}

	public void inOrder(BinaryNode localRoot) {

		if (localRoot != null) {

			inOrder(localRoot.left);
			localRoot.displayNode();
			inOrder(localRoot.right);

		}
	}

	public static void main(String[] args) {

		SplayTree t = new SplayTree();

		t.insert(10);
		t.insert(5);
		t.insert(15);
		t.insert(1);
		t.insert(6);
		t.insert(20);
		t.insert(25);

		System.out.println("Inserts complete");

		t.traverse();
	}

}
