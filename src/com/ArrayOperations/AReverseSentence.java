package com.ArrayOperations;

public class AReverseSentence {

	public static void main(String[] args) {

		reverseSentence("THis sentence will be reversed");
		rev("This will also be reversed");
	}

	public static void reverseSentence(String str) {
		StringBuilder revStr = new StringBuilder("");
		int end = str.length(); // substring takes the end index -1
		int counter = str.length() - 1;

		for (int i = str.length() - 1; i >= 0; i--) {

			if (str.charAt(i) == ' ' || i == 0) {

				if (i != 0) {

					revStr.append(str.substring(i + 1, end));
					revStr.append(" ");
				} else {

					revStr.append(str.substring(i, end));
				}

				end = counter;
			}

			counter--;
		}
		System.out.println(revStr);
	}

	public static void rev(String str) {

		String[] newStr = str.split(" ");
		StringBuilder string = new StringBuilder("");

		for (int i = newStr.length - 1; i >= 0; i--) {

			string.append(newStr[i]);
			string.append(" ");
		}
		System.out.println(string);
	}

}