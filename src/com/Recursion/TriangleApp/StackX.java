package com.Recursion.TriangleApp;

public class StackX {

	
	private int max;
	private int[] stackArray;
	private int top;
	
	public StackX(int s){
		
		max=s;
		stackArray=new int[max];
		top=-1;
		
	}
	public void push(int p){
		
		stackArray[++top]=p;
		
	}
	public int pop(){
		
		return stackArray[top--];
		
	}
	public int peek(){
		
		return stackArray[top];
		
	}
	public boolean isEmpty(){
		
		return (top==-1);
		
	}
}
