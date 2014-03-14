package com.ArrayOperations;

import java.util.Arrays;

public class AAnagramTogether {

	public static void main(String[] args) {

		String[] strArr = { "god", "dog", "abc", "cab", "man" };
		String[] astrArr = { "cat", "dog", "act", "god", "tac" };
		Arrays.sort(strArr, new AnagramComparator());
		for (String str : strArr) {
			System.out.print(str + " ");
		}
	}
}
//abc cab god dog man 