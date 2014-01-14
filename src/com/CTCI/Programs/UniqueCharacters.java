package com.CTCI.Programs;

/**
 * @author Savani Bharat
 *
 */
public class UniqueCharacters {

	public static void main(String[] args) {

		String str = "aabbccdaadeeff";
		boolean isUnique = isUniqueChar(str);
		System.out.println(str + " " + isUnique);

	}

	public static boolean isUniqueChar(String str) {

		boolean char_set[] = new boolean[256];
		for (int i = 0; i < str.length(); i++) {

			int val = str.charAt(i);
			if (char_set[val]) {
				return false;
			} else {
				char_set[val] = true;
			}
		}
		return true;

	}

}
