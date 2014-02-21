package com.ArrayOperations;

public class ReverseStringWithoutStringBuffer {

	public static void main(String[] args) {
		
		String str="This is a string reverse program without using StringBuffer";
		String newStr="";
		for (int i = str.length()-1; i >= 0; i--) {
				
			newStr=newStr+str.charAt(i);
			
		}
		System.out.println(newStr);
		
	}
}
/*
 * reffuBgnirtS gnisu tuohtiw margorp esrever gnirts a si sihT
 */
