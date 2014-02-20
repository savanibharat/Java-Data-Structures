package com.ArrayOperations;

public class RemoveCharFromString {

	public static void main(String[] args) {

		String str = "ansbdabbsdbabsbabab";
		StringBuffer strBuffer = new StringBuffer();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'A')
				continue;
			else
				strBuffer.append(ch[i]);
		}
		System.out.println(strBuffer.toString());

	}
}
