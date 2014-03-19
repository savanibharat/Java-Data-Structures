package com.ArrayOperations;

public class AAAElementsInIncreasingDecreasingOrderReturnLastIncreasing {

	

		public static void main(String[] args){
			int arr[] = {1,2,3,4,5,6,5,4,3,2,1};
			System.out.println(searchLargest(arr,0,arr.length));
		}
		
		public static int searchLargest(int[] arr,int start,int end){
			int mid=0;
			if(start <= end){
				mid = (start+end)/2;
				
				if((mid-1)>=0 && arr[mid-1] > arr[mid]){
					 return searchLargest(arr,start,mid);
				}else if((mid+1) < arr.length && arr[mid+1] >= arr[mid]){
					 return searchLargest(arr,mid,end);
				}
			}
			return arr[mid];
		}
	
}
