package com.Hashing.LinearProbing;

public class HashTable
{
	
	DataItem[] hashArray;
	DataItem nonDataItem;
	private int arraySize;
	
	public HashTable(int size){
		
		this.arraySize=size;
		hashArray=new DataItem[this.arraySize];
		nonDataItem=new DataItem(-1); //indicates that a cell is empty ; used in case for deletion
	
	}
	
	public void display(){
		
		for (int i = 0; i < arraySize; i++) {
			
			if(hashArray[i]!=null)
				System.out.print(hashArray[i].getKey()+" ");
			else
				System.out.print("** ");
		}
		System.out.println();
		System.out.println();
	}
	public int hashFunction(int key){
		
		return key%arraySize;
		
	}
	public void insert(DataItem item){
		
		int key=item.getKey();
		
		int hashVal=hashFunction(key);
		System.out.println("hashVal in insert function is "+hashVal);
		
		while(hashArray[hashVal]!=null && hashArray[hashVal].getKey()!=-1){
			
			++hashVal;
			hashVal%=arraySize;
			System.out.println("Collision for key "+key);
			
		}
		hashArray[hashVal]=item;
	}
	
	public DataItem delete(int key){
		
		int hashVal=hashFunction(key);
		while(hashArray[hashVal]!=null){
			
			if(hashArray[hashVal].getKey()==key){
				
				DataItem item=hashArray[hashVal];
				hashArray[hashVal]=nonDataItem;
				return item;
			}
			++hashVal;
			hashVal%=arraySize;
		}
		return null;
	}
	public DataItem find(int key){
		
		int hashVal=hashFunction(key);
		while(hashArray[hashVal]!=null){
			
			if(hashArray[hashVal].getKey()==key)
				return hashArray[hashVal];
			
			++hashVal;
			hashVal%=arraySize;
		}
		return null;
		}
}