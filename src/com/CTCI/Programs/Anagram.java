package com.CTCI.Programs;

import java.util.Arrays;

/**
 * @author Savani Bharat
 *
 */
public class Anagram {

	public static void main(String[] args) {

		String s1 = "sadsa", s2 = "sad";
		boolean isAnagram = anagram(s1, s2);
		System.out.println(isAnagram);
	}

	public static boolean anagram(String s1, String s2) {

		char ch1[] = s1.toCharArray();
		char ch2[] = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (int i = 0; i < ch1.length; i++) {

			if (ch1[i] == ch2[i])
				continue;
			else
				return false;

		}
		return true;
	}
}