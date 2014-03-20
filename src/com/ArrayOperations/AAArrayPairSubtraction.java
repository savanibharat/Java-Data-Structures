package com.ArrayOperations;

import java.util.HashMap;

public class AAArrayPairSubtraction {

	public static void main(String[] args) {

		int arr[] = {  0,1, 1, 4, 5, 6, 9, 16, 27};
		int k = 4;
		getDiffPair(arr, k);
	}
	public static int getDiffPair(int a[] , int diff){
		HashMap<Integer,Integer> hashMap = new HashMap<Integer,Integer>();

		int count = 1;
		for(int i = 0;i<a.length;i++){
			if(hashMap.containsKey(a[i])){
				count = hashMap.get(a[i]);
				hashMap.put(a[i], ++count);
			}else{
				hashMap.put(a[i], 1);
			}
		}
		System.out.println(hashMap);
		count = 0;
		for(int j = 0;j<a.length;j++){
			if(hashMap.containsKey(a[j]+diff)){
				count+=hashMap.get(a[j]+diff);
			}
		}
		System.out.println(count);
		return count;
	}

}
