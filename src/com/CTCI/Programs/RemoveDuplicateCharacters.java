package com.CTCI.Programs;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String str1 = "abababa";
		char[] str = str1.toCharArray();
		removeDups(str);

	}

	private static void removeDups(char[] str) {

		for (int i = 0; i < str.length; i++) {

			for (int j = i+1; j < str.length; j++) {

				if (str[i] == str[j])
					str[i] = ' ';

			}

		}
		System.out.println(str);
	}
}
