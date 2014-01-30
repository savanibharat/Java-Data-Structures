package com.CTCI.Programs;

import java.util.HashMap;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {

		String str = "kasdasdsadadsz";
		char[] ch=str.toCharArray();
		HashMap<Character,Integer> strcnt=new HashMap<Character,Integer>();
		for (int i = 0; i < str.length(); i++) {
			if(strcnt.containsKey(ch[i])){
				int j=strcnt.get(ch[i])+1;
				strcnt.put(ch[i], j);
			}
			else
				strcnt.put(ch[i], 1);
		}
		for(char i:strcnt.keySet())
			System.out.println(i+" "+strcnt.get(i));
		for (int i = 0; i < ch.length; i++) {
			if(strcnt.get(ch[i])==1){
				System.out.println(ch[i]);
			break;
		}}
	}
}



/*
 * // returns nil char (0) if no unique matches found
public static char firstUniqueCharacter(String text) {
	text = text.toLowerCase();
	Map<Character, Integer> occurance = new HashMap<>();
	int length = text.length();
	for (int i = 0; i < length; i++) {
		char c = text.charAt(i);
		occurance.put(c, occurance.containsKey(c) ? null : i);
	}
	char match = 0;
	int index = Integer.MAX_VALUE;
	for (Entry<Character, Integer> entry : occurance.entrySet()) {
		if (entry.getValue() != null && index > entry.getValue()) {
			index = entry.getValue();
			match = entry.getKey();
		}
	}
	return match;
}
 * */
 