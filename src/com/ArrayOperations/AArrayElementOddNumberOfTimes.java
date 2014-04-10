package com.ArrayOperations;

import java.util.Arrays;
import java.util.HashMap;

public class AArrayElementOddNumberOfTimes {

	public static void main(String[] args) {

		int a1[] = { 7, 4, 3, 8, 5, 6, 4, 8, 7, 2, 6, 4, 8, 7, 6, 4, 8, 7, 3,
				2, 6, 4, 8, 7, 3, 2, 6, 4 };
		int a[] = { 1,2,3,4,5,1,2,3,4,5,4,3,2,1 };
		int b[]=new int[a.length];
		Arrays.sort(a);
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {

			if (hashMap.containsKey(a[i]))
				hashMap.put(a[i], hashMap.get(a[i]) + 1);

			else
				hashMap.put(a[i], 1);
		}
		System.out.println(hashMap);
		int res = 0;
		
		int counter=0;
		for (int i = 0; i < a.length; i++) {

			b[a[i]]=b[a[i]]+(++counter);
			counter=0;
			//res = res ^ a[i];

		}

		for (int i = 0; i < b.length; i++) {
			 
			 System.out.println("for i " + i + "     " + b[i]);
		}
	}
}
