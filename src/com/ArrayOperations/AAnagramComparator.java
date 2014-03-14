package com.ArrayOperations;

import java.util.Comparator;

class AnagramComparator implements Comparator<String> {

	public int compare(String str1, String str2) {
		return sumLetters(str1) - sumLetters(str2);
	}

	private int sumLetters(String str) {
		int sum = 0;
		for (int ch : str.toCharArray()) {
			sum += ch;
		}
		return sum;
	}
}
