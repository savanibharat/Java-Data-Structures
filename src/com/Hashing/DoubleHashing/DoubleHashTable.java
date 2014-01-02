package com.Hashing.DoubleHashing;

public class DoubleHashTable {

	DataItem[] hashArray;
	private int arraySize;
	private DataItem nonDataItem;

	public DoubleHashTable(int arraySize) {

		this.arraySize = arraySize;
		hashArray = new DataItem[this.arraySize];
		nonDataItem = new DataItem(-1);

	}

	public void displaytable() {

		for (int i = 0; i < arraySize; i++) {

			if (hashArray[i] != null) {

				System.out.print(hashArray[i].getKey() + " ");

			} else {

				System.out.print("** ");

			}
		}
		System.out.println();
	}

	public int hashFunction(int key) {

		return key % arraySize;

	}

	public int doubleHashFunction(int key) {

		// non-zero, less than array size, different from hashFunction(int key)
		// array size must be relatively prime to 5, 4, 3, and 2

		return 5 - (key % 5); // stepSize = constant - ( key % constant )

	}

	public void insert(int key, DataItem dataItem) {

		int hashVal = hashFunction(key);
		System.out.println();
		System.out.println("hashVal for "+key+" is "+hashVal);
		int stepSize = doubleHashFunction(key);
		System.out.println("stepSize for "+key+" is "+stepSize);
		System.out.println();

		while (hashArray[hashVal] != null && hashArray[hashVal].getKey() != -1) { // COLLISION
																					// ::
																					// there
																					// is
																					// some
																					// value
																					// at
																					// this
																					// location
			System.out.println();
			System.out.println("collision for key "+key);
			
			hashVal += stepSize; // ++hashVal;
			System.out.println("New (hashVal+=stepSize) for "+key+" is "+hashVal);
			
			hashVal %= arraySize; // hashVal%=arraySize;
			System.out.println("New (hashVal%=arraySize) for "+key+" is "+hashVal);
			
			System.out.println();
			
		}
		hashArray[hashVal] = dataItem;
	}

	public DataItem find(int key) {

		int hashVal = hashFunction(key);
		int stepSize = doubleHashFunction(key);

		while (hashArray[hashVal] != null) {

			if (hashArray[hashVal].getKey() == key)
				return hashArray[hashVal];
			hashVal += stepSize;	// search in next step
			hashVal %= arraySize;	// wrap around
		}
		return null;	// can't find
	}
	
	public DataItem deleteItem(int key){
		
		int hashVal=hashFunction(key);
		int stepSize=doubleHashFunction(key);
		
		while(hashArray[hashVal]!=null){
			
			if(hashArray[hashVal].getKey()==key){
				
				DataItem temp=hashArray[hashVal];
				hashArray[hashVal]=nonDataItem;
				return temp;
			}
			hashVal+=stepSize;
			hashVal%=arraySize;
		}
		
		return null;
	}
}