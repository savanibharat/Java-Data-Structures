package com.CTCI.Programs;

/**
 * @author Savani Bharat
 *
 */
public class ReplaceBlankCharacterInString {

	public static void main(String[] args) {

		String s1 = "ab  cf  s ";
		char[] str = s1.toCharArray();
		int length = str.length;
		int newLength;

		int spaceCount = 0;

		for (int i = 0; i < length; i++) {
			if (str[i] == ' ')
				spaceCount++;
		}

		System.out.println("Spaces are " + spaceCount);
		System.out.println("Length of char[] " + length);
		newLength = length + (spaceCount * 2);
		System.out.println(newLength);
		char[] str1 = new char[newLength];
		// str1[newLength]=' ';
		int i;

		for (i = length - 1; i >= 0; i--) {

			if (str[i] == ' ') {

				str1[newLength - 1] = '0';
				str1[newLength - 2] = '2';
				str1[newLength - 3] = '%';
				newLength = newLength - 3;

			} else {

				str1[newLength - 1] = str[i];
				newLength--;
			}
		}

		for (int j = 0; j < str1.length; j++) {
			System.out.print(str1[j]);
		}
		System.out.println("\nNew char[] length" + str1.length);

	}
}
/*
 * Spaces are 5 Length of char[] 10 20 ab%20%20cf%20%20s%20 New char[] length20
 */