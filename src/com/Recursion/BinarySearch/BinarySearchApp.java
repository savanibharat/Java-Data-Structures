package com.Recursion.BinarySearch;

public class BinarySearchApp {

	public static void main(String[] args) {

		int maxSize = 20;
		OrdArray array = new OrdArray(maxSize);

		array.insert(20);
		array.insert(10);
		array.insert(40);
		array.insert(60);
		array.insert(14);
		array.insert(15);
		array.insert(12);
		array.insert(16);
		array.insert(9);
		array.insert(2);

		array.display();
		int searchKey = 40;

		int content = array.find(searchKey);
		if(content!=array.size()){
			
			System.out.println("found "+searchKey+" at location "+content);
			
		}
		else
			System.out.println("Number not found");
	}

}
