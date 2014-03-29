package com.CoreJava.Chapter1;

public class Shadowing {

	int count=9;
	public void logIn(){
		
		int count=10;
		System.out.println("local var is "+count);
		
	}
	private void count() {
	
		System.out.println("instance var count is "+count);

	}
	public static void main(String[] args) {
		
		new Shadowing().logIn();
		new Shadowing().count();
	}
}
/*
 * local var is 10
instance var count is 9

*/
