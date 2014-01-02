package com.Searching;


public class BinarySearch {
	public static void main(String args[]){

		int list[]={11,12,13,14,15,16,17,18,19,20};
		System.out.println("Numbers in list "+list);
		int key=14;
		int first=0;
		int last=list.length-1;
		int mid;
		
		while(first<=last)
		{
			mid=(first+last)/2; //dividing the array into halves
		
			if(list[mid]==key){
				System.out.println(key+" found at " +(mid+1)+" position");
				break;
			}
			
			else if(list[mid]<key){
				first=mid+1;
			}
			
			else//(list[mid]>key){
				last=mid-1;
			}

		if(first>last){
			System.out.println("Number not found");
		}
	}
}