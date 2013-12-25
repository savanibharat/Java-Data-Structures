package com.Stack.ArrayOperations;

import java.util.Arrays;

public class TheStack {

	private String[] stackArray;
	private int stackSize;
	private int topOfStack=-1;
	
	public TheStack(int size){
		
		stackSize=size;
		stackArray=new String[stackSize];
		Arrays.fill(stackArray,"-1");
		
	}

	public void push(String input){
		
		if(topOfStack+1<stackSize){
			
			topOfStack++;
			stackArray[topOfStack]=input;
			displayStack();
			System.out.println("The current element added is "+stackArray[topOfStack]);
			System.out.println();
		}
		else
			System.out.println("The stack is full");
	}
	
	public void pushMany(String input){
		
		String[] temp= input.split(" ");
		for(int i=0;i<temp.length;i++){
			
			push(temp[i]);
			
		}
		
	}
	
	public String pop(){
		
		if(topOfStack==-1){

			System.out.println("Stack is empty nothing to delete");
			System.out.println();
			return "-1";
			
		}
		else{
			
			//displayStack();
			System.out.println("The element deleted is "+stackArray[topOfStack]);
			System.out.println();
			stackArray[topOfStack]="-1";
			return stackArray[topOfStack--];
			
		}
	}
	public void peek(){
		
		System.out.println("The top element of stack is "+stackArray[topOfStack]);
		System.out.println();
		
	}
	public void displayStack(){
		
		if(topOfStack==-1){
			
			System.out.println("No elements in stack.");
			
		}
		else{
			
			for(int i=stackSize-1;i>=0;i--){
				
				if(!stackArray[i].equals("-1")){
					
					System.out.println("Element at index "+i+" is "+stackArray[i]);
				}
			}
		}
		
	}
	public static void main(String[] args) {
		
		TheStack theStack=new TheStack(10);
		theStack.push("a");
		theStack.push("b");
		theStack.push("c");
		theStack.push("d");
		theStack.pushMany("e f g h");
		theStack.displayStack();

		theStack.pop();
		theStack.displayStack();
		
		
	}
}
