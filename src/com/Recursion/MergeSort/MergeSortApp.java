package com.Recursion.MergeSort;

public class MergeSortApp {

	public static void main(String[] args) {
		
		int maxSize=100;
		DArray arr=new DArray(maxSize);
		arr.insert(2);
		arr.insert(1);
		arr.insert(0);
		arr.insert(9);
		arr.insert(44);
		arr.insert(33);
		arr.insert(1);
		arr.insert(5555);
		arr.insert(5);
		arr.insert(89);
		arr.insert(99);
		
		arr.display();
		arr.mergeSort();arr.display();
	}
}
