package com.CTCI.Programs;

public class StringReverse {

	public static void main(String[] args) {

		String str = "Reverse";
		System.out.println("original string is "+str);
		System.out.println();
		reverseString(str);
		System.out.println();
		String abd=reverseRec(str);
		System.out.println(abd);
	}

	public static void reverseString(String str) {

		StringBuffer newStr = new StringBuffer(str.length());
		char[] newChar = str.toCharArray();
		for (int i = newChar.length-1; i >= 0; i--) {

			newStr.append(newChar[i]);

		}
		System.out.println(newStr.toString());

	}
	public static String reverseRec(String str){
		
		if(str.length()<2)
			return str;
		return(str.substring(1))+str.charAt(0);
		
	}
}
/**
original string is Reverse

esreveR
 
 */
