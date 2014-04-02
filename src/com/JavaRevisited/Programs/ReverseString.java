package com.JavaRevisited.Programs;

// TODO: Auto-generated Javadoc
/**
 * The Class ReverseString.
 *
 * @author Savani Bharat
 */
public class ReverseString {

	/**
	 * The main method.
	 *
	 * @param args the args
	 */
	public static void main(String[] args) {
		
		String str="abcdef";
		String reverse=reverseRecursively(str);
		System.out.println("Recursion reverse "+reverse); 
		reverse=reverseIteratively(str);
		System.out.println("Iterative reverse "+reverse);
		reverse=reverseString(str);//reverse without StringBuilder or SstringBuffer
		System.out.println("String reverse "+reverse);
	}
	
	/**
	 * Reverse recursively.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String reverseRecursively(String str){
		
		if(str.length()<2)
			return str;
		
		return reverseRecursively(str.substring(1))+str.charAt(0);
	}
	
	/**
	 * Reverse iteratively.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String reverseIteratively(String str){
		
		char[] ch=str.toCharArray();
		if(str.length()==1)
			return str.toString();
		
		StringBuilder sb=new StringBuilder();
		for (int i =str.length()-1; i >=0 ; i--) {
			sb.append(ch[i]);
		}
		return sb.toString();
	}
	
	/**
	 * Reverse string.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String reverseString(String str){
		
		char ch[]=str.toCharArray();
		String newString="";
		for (int i = ch.length-1; i >=0 ; i--) {
			
			newString=newString+ch[i];
		}
		return newString;
	}
}
