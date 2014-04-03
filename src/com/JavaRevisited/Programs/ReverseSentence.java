package com.JavaRevisited.Programs;

// TODO: Auto-generated Javadoc
/**
 * The Class ReverseSentence.
 */
public class ReverseSentence {

	/**
	 * The main method.
	 *
	 * @param args the args
	 */
	public static void main(String[] args) {
	
		String str="This sentence will be reversed";
		String reverseSentence=reverseSentence(str);
		System.out.println(" "+reverseSentence);
		
	}
	
	/**
	 * Reverse sentence.
	 *
	 * @param str the str
	 * @return the string
	 */
	public static String reverseSentence(String str){
		
		String[] newString=str.split(" ");
		StringBuffer sb=new StringBuffer();
		for (int i = newString.length-1; i >=0 ; i--) {
			
			sb.append(newString[i]+" ");
			
		}
		return sb.toString();
		
	}
}
