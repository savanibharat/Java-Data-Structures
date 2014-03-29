package com.CoreJava.Chapter1;

public class FinalDemo {

	final int a;
	
	public FinalDemo() {
		
		a=2;//legal
		System.out.println("In constructor "+a);
	}
	private void display() {
		//a=0; illegal
		System.out.println("display method "+(a+1));

	}
	public static void main(String[] args) {
		
		FinalDemo f=new FinalDemo();
		f.display();
		
		
	}
}
/*In constructor 2
display method 3

 * */
 