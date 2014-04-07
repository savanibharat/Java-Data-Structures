package com.CoreJava.Chapter1;

public class StaticBlockDemo {

	static{
		
		System.out.println("static block executed");
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("main block executed");
		
	}
		
}
/**
 * 
static block executed
main block executed

 */
