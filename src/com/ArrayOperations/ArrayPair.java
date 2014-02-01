package com.ArrayOperations;

import java.util.Arrays;

public class ArrayPair {

	public static void main(String[] args) {
		
		int arr[]={6,5,7,3,6,7,3,4,2,5,6,8,7,9,4,5,6,3};
		Arrays.sort(arr);
		getPair(arr,14);
		
		
	}
	public static void getPair(int arr[],int k){
		
		int start=0;
		int end=arr.length-1;
		int sum=0;
	    StringBuilder arrs = new StringBuilder();

		while(start<end){
			sum=arr[start]+arr[end];
			if(sum==k){
				
	            arrs.append(arr[start] + "," + arr[end] + ";");
	            start++;
	            end--;
			}
			else if(sum<k){
				
				start++;
			}
			else{
				
				end--;
			}
			
		}
		System.out.println(arrs.toString());
		
	}
	
	
}
