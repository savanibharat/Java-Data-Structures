package com.ArrayOperations;


public class StringHashCode {

	public static void main(String[] args) {

		System.out.println(hash("abc"));
		System.out.println(hash("."));
	}

	public static int hash(String str) {
		int h = 0;
		int hash = 0;
		char[] value = str.toCharArray();
		if (h == 0 && value.length > 0) {
			char val[] = value;

			for (int i = 0; i < value.length; i++) {
				h = 31 * h + val[i];
				System.out.println(h);
			}
			hash = h;
		}
		return hash;

	}
}
