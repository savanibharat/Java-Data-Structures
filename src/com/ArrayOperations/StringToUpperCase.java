package com.ArrayOperations;

public class StringToUpperCase {

	public static void main(String[] args) {
		
		String str="comPuteR";
		String newStr="";
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)>='a'&& str.charAt(i)<='z')
				
				newStr+=(char)(str.charAt(i)-'a'+'A');
			
			else
				newStr+=str.charAt(i);
		}
		System.out.println(newStr);
	}
}
