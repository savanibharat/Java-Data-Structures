package com.Recursion.TriangleApp;

public class NonRecursiveTriangleApp {

	static int number;
	static int answer;
	static StackX stack;
	public static void main(String[] args) {
		
		number=4;
		stackTriangle();
		System.out.println("The triangle is "+answer);
		
	}
	public static void stackTriangle(){
		
		stack=new StackX(4);
		answer=0;
		while(number>0){
			
			stack.push(number);
			--number;
			
		}
		while(!stack.isEmpty()){
			
			int newN=stack.pop();
			answer+=newN;
			
		}
			
		
	}
	
}
