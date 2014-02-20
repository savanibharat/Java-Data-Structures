package com.ArrayOperations;

import java.util.Hashtable;

public class ElementsInOneArrayNotInAnother {

	public static void main(String[] args) {
		
		int arr1[]={ 1,2,3,4,5};
		int arr2[]={2,34,3,2,4};
		Hashtable<Integer,Integer> h=new Hashtable<Integer,Integer>();
		for (int i = 0; i < arr1.length; i++) {
			
			if(h.containsKey(arr1[i]))
				h.put(arr1[i], h.get(arr1[i])+1);
			else
				h.put(arr1[i], 1);
				
		}
		System.out.println(h);
		for (int i = 0; i < arr2.length; i++) {
			if(h.containsKey(arr2[i]))
				continue;
			else
				System.out.println(arr2[i]);
		}
		
	}
}
