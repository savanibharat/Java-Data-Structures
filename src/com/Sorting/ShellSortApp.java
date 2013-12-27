package com.Sorting;

public class ShellSortApp {

	public static void main(String[] args) {

		int maxSize = 10;
		ShellSortArray shellSortArray = new ShellSortArray(maxSize);
		
		shellSortArray.insert(10);
		shellSortArray.insert(9);
		shellSortArray.insert(2);
		shellSortArray.insert(100);
		shellSortArray.insert(89);
		shellSortArray.insert(43);
		shellSortArray.insert(23);
		shellSortArray.insert(1);
		shellSortArray.insert(4);
	    shellSortArray.insert(7);

	    shellSortArray.display();
		shellSortArray.shellSort();
		shellSortArray.display();

	}
	}
