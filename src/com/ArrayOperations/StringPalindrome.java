package com.ArrayOperations;

public class StringPalindrome {

	public static void main(String[] args) {

		String str = "malyylam";
		int len = str.length();
		boolean palin = false;
		for (int i = 0; i < (len / 2 + 1); i++) {

			if (str.charAt(i) != str.charAt(len - i - 1)) {
			
				palin = false;
				break;
			} 
			else
				palin = true;
		}
		
		System.out.println(palin);
	}
}
