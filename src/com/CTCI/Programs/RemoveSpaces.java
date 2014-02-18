package com.CTCI.Programs;

public class RemoveSpaces {

	public static void main(String[] args) {

		String value = "abc c  f";
		char[] ch = value.toCharArray();
		// System.out.println(value.replaceAll("\\s+", ""));

		StringBuffer s = new StringBuffer();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] != 32)
				s.append(ch[i]);

		}
		System.out.println(s.toString());

	}

}
