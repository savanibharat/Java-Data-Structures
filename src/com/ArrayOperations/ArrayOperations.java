package com.ArrayOperations;

public class ArrayOperations {
	
	private int[] array=new int[50];
	private int arraySize=10;
	
	public void populateArray(){
	
		for(int i=0;i<arraySize;i++){
		
			array[i]=(int)(Math.random()*10);
		
		}
	
	}
	
	public void printArray(){
		
		for(int i=0;i<arraySize;i++){
			
			System.out.print("Index i ::"+i+" value :: "+array[i]);
			System.out.println();
		}
	}
	
	public int getValueAtIndexInArray(int index){
		
		if(index<arraySize){
			
			return array[index];
			
		}
		else
			return -1;
		
	}
	
	public void deleteIndexFromArray(int index){
		
		if(index<arraySize){
			
			for(int i=index;i<(arraySize-1);i++){
				
				array[i]=array[i+1];
				
			}
			arraySize=arraySize-1;
		}
		
	}
	
	public void insertValueInArray(int value){
		
		if(arraySize<50){

			array[arraySize]=value;
			arraySize++;
		}
		
	}
	
	public void deleteValueInArray(int value){
		
		int k=0;
		int i;
		for(i=0;i<arraySize;i++){
			
			if(array[i]==value){
				
				k=i;
				break;
			}
			
		}
		if(i==arraySize){
			
			System.out.println("Element not found");
			
		}
		for(int index=k;index<arraySize;index++){
			
			array[index]=array[index+1];
			
		}
		arraySize--;
		
	}
	
	public static void main(String[] args) {
	
		ArrayOperations arrayOperations=new ArrayOperations();
		arrayOperations.populateArray();
		arrayOperations.printArray();
	
		System.out.println(arrayOperations.getValueAtIndexInArray(3));
		
		arrayOperations.deleteIndexFromArray(3);
		arrayOperations.printArray();
		
		arrayOperations.insertValueInArray(100);
		System.out.println();
		arrayOperations.printArray();
		
		System.out.println("----");
		
		
		arrayOperations.deleteValueInArray(1000);
		arrayOperations.printArray();
	}
}
