package com.Hashing.SeparateChaining;

public class HashChainApp {

	public static void main(String[] args) {

		HashTable theHashTable = new HashTable(10);
		int aKey;
		Link theLink;
		int a[] = { 1, 6, 5, 4, 9, 13, 16, 17, 23, 53, 7, 177, 166, 133, 2, 4,
				7, 98, 43, 59, 47, 6, 5, 29, 4, 65 };
		for (int j = 0; j < a.length; j++) // insert data
		{ 
			aKey = (int) (java.lang.Math.random() * 10);
			aKey = a[j];
			System.out.println("akey is " + aKey);

			theLink = new Link(aKey);
			theHashTable.insert(theLink);
			theHashTable.displayTable();

		}
		System.out.println();
		System.out.println();
		theHashTable.displayTable();

		/*
		 * SortedList s = new SortedList(); Link theLink; int a[] = { 1, 6, 5,
		 * 4, 9, 13, 16, 17, 23, 53, 7, 177, 166, 133, 2, 4, 7, 98, 43, 59, 47,
		 * 6, 5, 29, 4, 65 }; for (int j = 0; j < a.length; j++) // insert data
		 * { // aKey = (int)(java.lang.Math.random() *size); int aKey = a[j];
		 * System.out.println("akey is " + aKey);
		 * 
		 * theLink = new Link(aKey); s.insert(theLink); } s.displayList();
		 */}
}