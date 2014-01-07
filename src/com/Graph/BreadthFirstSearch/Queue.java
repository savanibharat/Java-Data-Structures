package com.Graph.BreadthFirstSearch;

/**
 * The Class Queue.
 *
 * @author Savani Bharat
 */
public class Queue {
	
	/** The size. */
	private final int SIZE=20;
	
	/** The queue array. */
	private int[] queueArray;
	
	/** The front. */
	private int front;
	
	/** The rear. */
	private int rear;
	
	/**
	 * Instantiates a new queue.
	 */
	public Queue(){
		
		queueArray=new int[SIZE];
		front=0;
		rear=-1;
		
	}
	
	/**
	 * Insert.
	 *
	 * @param i the i
	 */
	public void insert(int i){
		
		if(rear==SIZE-1)
			rear=-1;
		queueArray[++rear]=i;
		
	}
	
	/**
	 * Removes the element from queue
	 *
	 * @return the int
	 */
	public int remove(){
		
		int temp=queueArray[front++];
		if(front==SIZE)
			front =0;
		return temp;
		
	}
	
	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty(){
		
		return (rear+1==front || (front+SIZE-1==rear));
		
	}
}
