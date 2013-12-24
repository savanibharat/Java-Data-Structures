package com.searching;

public class LinearSearch {
	public static void main(String args[]){
		
		int list[]={2,4,1,3,5,6,7,8,9,10};
		int key=9;
		//for(int i=0;i<list.length;i++){
		for(int i=0;;i++){//sentinal approach-each condition requires 2 conditions to be checked and one to be executed
			if(list[i]==key){
				System.out.println("Position of "+ key +" is " +(i+1));
				break;
			}
		}
		
	}
}
