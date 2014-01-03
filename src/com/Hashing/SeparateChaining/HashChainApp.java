package com.Hashing.SeparateChaining;


public class HashChainApp {

	public static void main(String[] args) {
		
		HashTable theHashTable=new HashTable(10);
		int aKey;
		Link theLink;
		int a[]={1,6,5,4,9,13,16,17,23,53};
		for(int j=0; j<10; j++) // insert data
		{
		//aKey = (int)(java.lang.Math.random() *size);
			aKey=a[j];
		System.out.println("akey is "+aKey);

		theLink = new Link(aKey);
		theHashTable.insert(theLink);
		theHashTable.displayTable();
		
		}
		System.out.println();
		System.out.println();
		theHashTable.displayTable();
		
		
	}
}
