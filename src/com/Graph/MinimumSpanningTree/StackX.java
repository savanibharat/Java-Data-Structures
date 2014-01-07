package com.Graph.MinimumSpanningTree;


// TODO: Auto-generated Javadoc
/**
 * The Class StackX.
 *
 * @author Savani Bharat
 */
public class StackX {

	/** The size. */
	private final int SIZE=20;
	
	/** The st. */
	private int[] st;
	
	/** The top. */
	private int top;
	
	/**
	 * Instantiates a new stack x.
	 */
	public StackX(){
		
		st=new int[SIZE];
		top=-1;
		   
	}
	
	/**
	 * Push.
	 *
	 * @param i the i
	 */
	public void push(int i){
		
		st[++top]=i;
		
	}
	
	/**
	 * Pop.
	 *
	 * @return the int
	 */
	public int pop(){
		
		return st[top--];
		
	}
	
	/**
	 * Peek.
	 *
	 * @return the int
	 */
	public int peek(){
		
		return st[top];
		
	}
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty(){
		
		return (top==-1);
		
	}
}
