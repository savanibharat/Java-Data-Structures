package com.ArrayOperations;

import java.util.HashMap;

class AAHashPractice {
	 public static void main(String[] args) {
		
		 HashMap<AATest, String> hm = new HashMap<AATest, String>();

			AATest t1 = new AATest();

			hm.put(t1, "success");

			System.out.println(hm.get(t1)); // print success
			System.out.println(hm);
			t1.i = 10;

			System.out.println(hm.get(t1)); // NULL
			System.out.println(hm);
	}
}
