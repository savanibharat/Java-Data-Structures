package com.ArrayOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AAStoringRepeatedStringIndex {



	public static void main(String[] args) throws Throwable {

		Map<String, ArrayList<Integer>> hashMap = new ConcurrentHashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> c;

		BufferedReader br = new BufferedReader(new FileReader(
				"StringTokenizerInput.txt"));

		String str;
		while ((str = br.readLine()) != null) {

			String[] newStr = str.toLowerCase().split(" ");
			for (int i = 0; i < newStr.length; i++) {
				c = new ArrayList<Integer>();
				if (hashMap.containsKey(newStr[i])) {

					c = hashMap.get(newStr[i]);
					c.add(i);
					hashMap.put(newStr[i], c);
				} else {

					c.add(i);
					hashMap.put(newStr[i], c);
				}
			}
		}
		System.out.println(hashMap);
	}
}
/*
 * 
This is a String string my String
{this=[0], a=[2], my=[5], string=[3, 4, 6], is=[1]}
 * */
