package com.CoreJava.Chapter1;

public class VarArgsDemo {
	
	int x;
	
	public VarArgsDemo(int... x) {
		
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}
	
}
