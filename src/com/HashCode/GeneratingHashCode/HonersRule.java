package com.HashCode.GeneratingHashCode;

import java.util.ArrayList;

import com.ArrayList.PermutationOfStringRecursive.StringHelper;

public class HonersRule {

	public static void main(String[] args) {
		
		
		ArrayList<String> manyStrings=StringHelper.PermutationFinder("bharat");//Total execution for abcdefghi 2531934499571
		for (int i = 0; i < manyStrings.size(); i++) {
			//hashing(manyStrings.get(i));
		
		}
		hashing("abcd");
		//hashing("bharat");

		
	}
	public static void hashing(String s){
		
		int h=0;
		char[] ch=s.toCharArray();
		for (int i = s.length()-1; i >= 0; i--) {
			h=(ch[i]+128*h)%127;
			System.out.println("ch[i] is "+ch[i]+"  "+(ch[i]+128*h));
			System.out.println(h);
		}
		System.out.println(h);
		
	}
	
}
/*
 * 100
72
43
13
13

 * 
 * */