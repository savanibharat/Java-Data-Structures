package com.ArrayOperations;

public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num=12345;
		int numStore=num;
		int numDigits=0;
		do{
			
			num=num/10;
			numDigits++;
		}while(num>0);
		
		int result=0;
		for (int i = 0; i < numDigits; i++) {
		
			result*=10;
			result+=numStore%10;
			numStore=numStore/10;
		}
		System.out.println("result is "+result);
	}
}
