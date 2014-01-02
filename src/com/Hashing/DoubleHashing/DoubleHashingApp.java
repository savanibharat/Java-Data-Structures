package com.Hashing.DoubleHashing;

public class DoubleHashingApp {

	public static void main(String[] args) {

		int arraySize = 23;
		DoubleHashTable doubleHashTable = new DoubleHashTable(arraySize);
		int[] key = { 1, 38, 37, 16, 20, 3, 11, 24, 5, 16, 10, 31, 18, 12, 30,
				1, 19, 36, 41, 15, 25 };
		DataItem dataItem;

		for (int i = 0; i < key.length; i++) {

			dataItem = new DataItem(key[i]);
			doubleHashTable.insert(key[i], dataItem);
			doubleHashTable.displaytable();
		}
		System.out.println();
		doubleHashTable.displaytable();

	}
}
