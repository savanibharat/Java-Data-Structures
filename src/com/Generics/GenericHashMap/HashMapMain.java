package com.Generics.GenericHashMap;

public class HashMapMain {
	
	public static void main(String[] args) {
		
		HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
		for (int i = 0; i < 30; i++) {
			h.put(i, i);
		}
		h.print();
		System.out.println(h.get(18));
	}
}
