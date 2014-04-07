package com.ArrayOperations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class AAStoringRepeatedStringIndex {

	public static void main(String[] args) throws Throwable {
		Map<String, ArrayList<Integer>> hashMap = new ConcurrentHashMap<String, ArrayList<Integer>>();
		ArrayList<Integer> c;

		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(new FileReader(
				"StringTokenizerInput2.txt"));

		String str;
		int lineNumber=0;
		while ((str = br.readLine()) != null) {
			lineNumber++;
			String[] newStr = str.toLowerCase().split(" ");
			for (int i = 0; i < newStr.length; i++) {
				if(newStr[i].length()>2){
				c = new ArrayList<Integer>();

				if (hashMap.containsKey(newStr[i])) {

					c = hashMap.get(newStr[i]);
					if (!c.contains(i)) {
						c.add(i);
						hashMap.put(newStr[i], c);
					}
				}
				else {

					c.add(i);
					hashMap.put(newStr[i], c);

				}
			}
			}
		}
		System.out.println(hashMap);
	}
}
/*
 * 
{well=[4], this=[0, 1], hope=[0], called=[5], string=[3, 4, 6], thing=[2], new=[3], savani=[7], works=[3], bharat=[6]}

 * */
