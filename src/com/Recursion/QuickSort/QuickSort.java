package com.Recursion.QuickSort;

public class QuickSort {

	private int[] theArray;
	private int number;

	public void sort(int[] values) {

		if (values == null || values.length == 0)
			return;

		this.theArray = values;
		number = values.length;
		display();
		quicksort(0,number-1);

	}
	private void quicksort(int low,int high){
		
		int i=low;
		int j=high;
		int pivot=theArray[low+(high-low)/2];
		
		while(i<=j){
			
			while(theArray[i]<pivot)
				i++;
			while(theArray[j]>pivot)
				j--;
			
			if(i<=j){
				exchange(i,j);
				i++;
				j--;
			}
		}
		if(low<j)
			quicksort(low, j);
		if(i<high)
			quicksort(i, high);
	}
	private void exchange(int i,int j){
		
		int temp=theArray[i];
		theArray[i]=theArray[j];
		theArray[j]=temp;
		
	}
	public void display() {

		for (int i = 0; i < theArray.length; i++) {
			System.out.print(theArray[i] + " ");
		}
		System.out.println();

	}

}
