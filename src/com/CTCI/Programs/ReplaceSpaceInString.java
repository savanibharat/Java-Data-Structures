package com.CTCI.Programs;

public class ReplaceSpaceInString {

	public static void main(String[] args) {

		String str = "abd dfjd      z";
		int space = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (ch[i] == ' ')
				space++;
		}
		int newLength = str.length() + space * 2;
		// ch[newLength-1]='\0';
		char ch1[] = new char[newLength];
		for (int i = str.length() - 1; i >= 0; i--) {

			if (ch[i] == ' ') {// %20

				ch1[newLength - 1] = '0';
				ch1[newLength - 2] = '2';
				ch1[newLength - 3] = '%';
				newLength -= 3;

			} else {
				ch1[newLength - 1] = ch[i];
				newLength--;
			}
		}
		System.out.println(ch1);

	}

}
