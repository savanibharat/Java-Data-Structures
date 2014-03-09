package com.ArrayOperations;

import java.util.HashMap;
import java.util.Map;

public class ATwoArrayNAndNPlusTwo {

	public static void main(String[] args) {

		int[] a = { 5, 6, 7, 4, 3, 9 };
		int[] b = { 1, 5, 6, 7, 4, 2, 3, 9 };

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		insert(hashMap, a, b);
		deleteMethod(hashMap, a, b);
	}

	public static void insert(HashMap<Integer, Integer> hashMap, int[] a,
			int[] b) {

		for (int i = 0; i < a.length; i++) {
			hashMap.put(a[i], 1);
		}

		for (int i = 0; i < b.length; i++) {
			if (hashMap.containsKey(b[i]))
				hashMap.put(b[i], hashMap.get(b[i]) + 1);

			else
				hashMap.put(b[i], 1);

		}
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {

			if (entry.getValue() == 1)
				System.out.println(entry.getKey());
		}
	}

	public static void deleteMethod(HashMap<Integer, Integer> hashMap, int[] a,
			int[] b) {

		for (int i = 0; i < a.length; i++) {
			hashMap.put(a[i], 1);
		}

		for (int i = 0; i < b.length; i++) {
			if (hashMap.containsKey(b[i]))
				hashMap.remove(b[i]);

			else
				hashMap.put(b[i], 1);

		}
		for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
			System.out.println("" + entry.getKey());
		}
	}
}
