package com.ArrayOperations;

public class StringToLowerCase {
	
	public static void main(String[] args) {
		
		String str="Vimal Is TALENted";
		String newStr="";
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z')
				newStr+=(char)(str.charAt(i)-'A'+'a');
			else
				newStr+=str.charAt(i);
			
		}
		System.out.println(newStr);
	}
}