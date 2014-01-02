package com.Hashing.LinearProbing;

public class HashTableApp{
	
	
	public static void main(String[] args) {
		
		DataItem dataItem;
		int n=8, size=12,akey;
		
		HashTable theHashTable=new HashTable(size);
		
		for (int i = 0; i < n; i++) {
			
			akey=(int)(java.lang.Math.random()*size);
			System.out.println("Key to be inserted "+akey);
			dataItem=new DataItem(akey);
			theHashTable.insert(dataItem);
			theHashTable.display();
		}
		
		DataItem findValidation=theHashTable.find(5);
		if(findValidation!=null)
			System.out.println("key found");
		else
			System.out.println("key not found");
		
		DataItem delete =theHashTable.delete(5);
		if(delete!=null)
			System.out.println("key "+delete.getKey()+" deleted");
		else
			System.out.println("key not found");
		
		theHashTable.display();
		
	}
}