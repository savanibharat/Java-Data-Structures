package com.Hashing.SeparateChaining;

public class HashTable {

	private SortedList[] hashArray;
	private int arraySize;
	
	public HashTable(int arraySize){
		
		this.arraySize=arraySize;
		hashArray=new SortedList[this.arraySize];
		
		for (int j = 0; j < this.arraySize; j++) {
			
			hashArray[j]=new SortedList();
			
		}
		
	}
	public void displayTable(){
		
		for (int i = 0; i < arraySize; i++) {
			
			System.out.print(i+". ");
			hashArray[i].displayList();
			
		}
		
	}
	public int hashFunction(int key){
		
		return key%arraySize;
		
	}
	public void insert(Link theLink){
		
		int key=theLink.getKey();
		int hashVal=hashFunction(key);
		hashArray[hashVal].insert(theLink);
		
	}
	public void delete(int key){
		
		int hashVal=hashFunction(key);
		hashArray[hashVal].delete(key);
				
	}
	public Link find(int key){
		
		int hashVal=hashFunction(key);
		Link theLink=hashArray[hashVal].find(key);
		return theLink;
		
	}
	
	
}
