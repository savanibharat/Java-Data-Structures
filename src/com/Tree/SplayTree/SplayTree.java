package com.Tree.SplayTree;

public class SplayTree {

	private BinaryNode root;
	
	public SplayTree(){
		
		root=null;
	}
	/*Insert into the tree
	 * @param x the item to insert
	 *  
	 * */
	public void insert(Comparable key){
		
		BinaryNode n;
		int c;
		if(root==null){
			
			root=new BinaryNode(key);
			return;
		}
		splay(key);
		if((c=key.compareTo(root.key))==0){
			
			//throw new DuplicateItemException(x.toString());
			return;
		}
		n=new BinaryNode(key);
		if(c<0){
			
			n.left=root.left;
			n.right=root;
			root.left=null;
		}
		else{
			
			n.right=root.right;
			n.left=root;
			root.right=null;
			
		}
		root=n;
		
	}
	
	 /**
     * Remove from the tree.
     * @param x the item to remove.
     * @throws ItemNotFoundException if x is not found.
     */
	
	
	
}




























