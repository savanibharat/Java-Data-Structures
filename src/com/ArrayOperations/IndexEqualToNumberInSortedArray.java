package com.ArrayOperations;

public class IndexEqualToNumberInSortedArray {

	public static void main(String[] args) {
		
		int input[]={0,1,2};
		
		int low=0;
		int high=input.length;
		
		while(low<high){
			
			int mid=(low+high)/2;
			if(input[mid]==mid){
				System.out.println("found");
				break;
			}
			else if(input[mid]>mid)
				high=mid-1;
			else
				low=mid+1;
			
		}
		
	}
}
