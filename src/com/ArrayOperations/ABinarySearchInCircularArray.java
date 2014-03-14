package com.ArrayOperations;

public class ABinarySearchInCircularArray {

	public static void main(String[] args) {
		
		int a[]={6,13,14,15,16,17,1,2,3,4,5};
		int arraySize=a.length;
		int key=4;
		int search=binarySearchOnCircularArray(a, arraySize, key);
		System.out.println(search);
	}
	public static int binarySearchOnCircularArray(int arr[], int arrSize, int key)
	{
	    int mid, start=0, end1=arrSize-1;
	    int index=-1;
	    if(arr[start] == key)
	        index = start;
	    else if(arr[end1] == key)
	        index = end1;

	    while(index == -1 && start != end1 -1)
	    {
	        mid = (start+end1)/2;
	        if(arr[mid] == key)     //If found the element
	            index = mid;
	        else if (arr[mid] < arr[start]) //Right part of mid is sorted array...
	        {
	            if(key > arr[mid] && key < arr[end1])
	                start = mid;
	            else
	                end1 = mid;
	        }
	        else    //Left part of mid is sorted array....
	        {
	            if(key > arr[start] && key < arr[mid])
	                end1 = mid;
	            else
	                start = mid;
	        }
	    }

	    return index;
	}
}
