package com.HashCode.GeneratingHashCode;

public class TimePass {

	public static void main(String[] args) {
		
		int i=finallyExecutor();
		System.out.println(i);

		
	}
	public static int finallyExecutor(){
		
		try{
			
			System.out.println("in try");
			return 0;
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		finally{
			
			System.out.println("inside finally");
			return 1;
			
		}
		
	}
}
