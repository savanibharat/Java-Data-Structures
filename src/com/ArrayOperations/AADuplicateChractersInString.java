package com.ArrayOperations;

import java.util.LinkedHashMap;

public class AADuplicateChractersInString {

	public static void main(String[] args) {

		String str = "bharataryan";
		String sss = str.replaceAll("(.)(?=.*\\1)", "");
		char[] g = sss.toCharArray();
		removeDuplicates(str);
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (map.containsKey(ch[i]))
				map.remove(ch[i]);
			else
				map.put(ch[i], 1);
		}
		System.out.println(map);
		StringBuilder s = new StringBuilder();
		for (Character c : map.keySet()) {

			s.append(c);

		}
		System.out.println(s);
	}

	public static void removeDuplicates(String str) {

		int length = str.length();
		String newStr = "";
		for (int i = 0; i < length; i++) {

			if (!newStr.contains(str.charAt(i) + "")) {
				newStr = newStr + str.charAt(i);
			}
		}
		System.out.println(newStr);

	}

}