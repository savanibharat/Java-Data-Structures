package com.Lab;

public class StringRotations {

	public static void main(String[] args) {
		
		String input="abcd";
		String input2="OPT";
		
		boolean isRotated=false;
		for (int i = 0; i < input.length(); i++) {
			
			String rotatedString=input.substring(i)+input.substring(0,i);
			System.out.println(input.substring(i)+"  "+input.substring(0,i));
			//System.out.println(rotatedString);
			if(rotatedString.equals(input2)){
				isRotated=true;
			}
		}
		System.out.println("Secons input is rotation of first one? "+isRotated);
		
	}
}
