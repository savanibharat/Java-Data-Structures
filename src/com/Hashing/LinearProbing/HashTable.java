package com.Hashing.LinearProbing;

public class HashTable {

	DataItem[] hashArray;
	int arraySize;
	DataItem nonItem;
	
	public HashTable(int size){
		
		arraySize=size;
		hashArray=new DataItem[arraySize];
		nonItem=new DataItem(-1);
		
	}
	public void displayTable(){
		
		System.out.println("Table: ");
		for (int i = 0; i < arraySize; i++) {
			
			if(hashArray[i]!=null)
				System.out.print(hashArray[i].iData+" ");
			else
				System.out.print("** ");
			
		}
		System.out.println();
	}
	public int hashFunction(int key){
		System.out.println("Hash Function output "+key%arraySize);
		return key%arraySize; 
		
	}
	public void insert(DataItem item){
		//assumes table is full
		
		int key=item.iData;
		int hashVal=hashFunction(key);
		while(hashArray[hashVal]!=null && hashArray[hashVal].iData!=-1){
			System.out.println("in insert hashVal is "+hashVal);
			++hashVal;
			System.out.println("hashVal%=arraySize is "+(hashVal%=arraySize));
			hashVal%=arraySize;
			
		}
		hashArray[hashVal]=item;
	}
	
	public DataItem delete(int key){
		
		int hashVal=hashFunction(key);
		while(hashArray[hashVal]!=null){
			
			if(hashArray[hashVal].iData==key){
				
				DataItem temp= hashArray[hashVal];
				hashArray[hashVal]=nonItem;
				return temp;
				
			}
			++hashVal;// go to next cell
			hashVal%=arraySize;//wraparound if possible
		}
		return null;
	}
	public DataItem find(int key){
		
		int hashVal=hashFunction(key);
		while(hashArray[hashVal]!=null){
			
			if(hashArray[hashVal].iData==key)
				return hashArray[hashVal];
			++hashVal;
			hashVal%=arraySize;
		
		}
		return null;
		}
		
	}

