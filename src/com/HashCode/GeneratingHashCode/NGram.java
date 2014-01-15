package com.HashCode.GeneratingHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Savani Bharat
 *
 * The Class NGram.
 */
public class NGram {

	/**
	 * Ngrams.
	 *
	 * @param n the n
	 * @param str the str
	 * @return the list
	 */
	public static List<String> ngrams(int n, String str) {
		
		List<String> ngrams = new ArrayList<String>();
		String[] words = str.split(" ");
		
		for (int i = 0; i < words.length - n + 1; i++)
			ngrams.add(concat(words, i, i + n));
		
		return ngrams;
	}

	/**
	 * Concat.
	 *
	 * @param words the words
	 * @param start the start
	 * @param end the end
	 * @return the string
	 */
	public static String concat(String[] words, int start, int end) {
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = start; i < end; i++)
			sb.append((i > start ? " " : "") + words[i]);
		
		return sb.toString();
	}

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		for (int n = 1; n <= 6; n++) {
		
			for (String ngram : ngrams(n,
					"This is a program very good one wwith ngram working on it"))
				System.out.println(ngram);
			
			System.out.println();
		}
	}
}