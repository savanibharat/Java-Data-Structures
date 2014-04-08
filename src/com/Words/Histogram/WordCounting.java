package com.Words.Histogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import com.Generics.GenericHashMap.HashMap;

public class WordCounting {

	public static void main(String[] args) throws Exception {

		/*
		 * String str; HashMap<String, HashMap<Integer,Integer>> counts=new
		 * HashMap<String, HashMap<Integer,Integer>>(); HashMap<Integer,Integer>
		 * documents=new HashMap<Integer,Integer>();
		 * 
		 * for (int i = 1; i < 3; i++) {
		 * 
		 * BufferedReader br=new BufferedReader(new
		 * FileReader("StringTokenizerInput"+i+".txt"));
		 * while((str=br.readLine())!=null){
		 * 
		 * 
		 * 
		 * }
		 * 
		 * 
		 * }
		 */
		String str[]={"apt","pat","tap"};
		int hash=0;
		ArrayList<Integer> a=new ArrayList<Integer>();
		for (int i = 0; i < str.length; i++) {
			
			hash=hashing(str[i]);
			a.add(hash,1);
		}
		System.out.println(a);
	}

	public static int hashing(String str) {
		int hash = 0;
		int h = hash;
		char[] value = str.toCharArray();
		if (h == 0 && value.length > 0) {
			char val[] = value;

			for (int i = 0; i < value.length; i++) {
				h = 3 * h + val[i];
			}
			hash = h;
		}
		System.out.println(hash);
		return hash;
	}
}
