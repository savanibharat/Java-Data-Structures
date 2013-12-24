package com.Queue.ArrayOperations;

import java.util.Arrays;

public class TheQueue {

	private String[] queueArray;
	private int arraySize;
	private int front, rear=0, numOfElements;
	
	public TheQueue(int size){
		
		arraySize=size;
		queueArray=new String[arraySize];
		Arrays.fill(queueArray,"-1");
	}
	
	public void insert(String input){
		
		if(numOfElements+1<=arraySize){
			
			queueArray[rear]=input;
			System.out.println("Inserted "+ queueArray[rear] + " element in queue ");
			rear++;
			numOfElements++;
			
		}
		else{
			
			System.out.println("Queue is full cannot enter more elements");
			
		}
	}
	public void insertPriority(String input){
		
		  int i;
		  	         
		  	        if(numOfElements == 0){
		  	             
		  	            insert(input);
		  	             
		  	        } else {
		  	             
		  	            for(i = numOfElements-1; i >= 0; i--){
		  	                 
		  	                if(Integer.parseInt(input) > Integer.parseInt(queueArray[i])){
		  	                     
		  	                    queueArray[i+1] = queueArray[i];
		  	                } else break; // Done shifting items in queue
		  	            }
		  	            queueArray[i+1] = input;
		  	            rear++;
		  	            numOfElements++;
		  	        }
		  	    }
	public void remove(){
		
		if(numOfElements>0){
			
			System.out.println("Deleted "+queueArray[front]+" element from queue");
			queueArray[front]="-1";
			front++;
			//numOfElements--;
			
		}
		else{
			
			System.out.println("There are no elements in queue.");
			
		}
	}
	public void displayQueue(){

		for(int i=front; i<numOfElements; i++){
			System.out.println("Element at index "+ i + " is "+queueArray[i]);
		
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		TheQueue theQueue=new TheQueue(10);
		/*theQueue.insert("a");
		theQueue.insert("b");
		theQueue.insert("c");
		theQueue.insert("d");
		theQueue.insert("e");*/
		//theQueue.displayQueue();
		long start=System.currentTimeMillis();
		System.out.println("start is "+start);
		theQueue.insertPriority("10");
		theQueue.insertPriority("1");
		theQueue.insertPriority("0");
		theQueue.insertPriority("1111");
		theQueue.insertPriority("99");
		theQueue.displayQueue();
		theQueue.remove();
		theQueue.displayQueue();
		long end=System.currentTimeMillis();
		System.out.println("end is "+end);
		System.out.println("time for execution "+(end-start));
	}
}
