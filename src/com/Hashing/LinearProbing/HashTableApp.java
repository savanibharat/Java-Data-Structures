package com.Hashing.LinearProbing;

public class HashTableApp {

	public static void main(String[] args) {
		
		DataItem dataItem;
		int size=12;
		int keysPerCell=10;
		int n=8;
		int aKey;
		HashTable hashTable=new HashTable(size);
		for (int j = 0; j < n; j++) {
			
			aKey=(int)(java.lang.Math.random()*keysPerCell*size);
			System.out.println();
			System.out.println("In main :: akey is "+aKey);
			dataItem=new DataItem(aKey);
			hashTable.insert(dataItem);
			System.out.println();
			
		}
		hashTable.displayTable();
	}
}
