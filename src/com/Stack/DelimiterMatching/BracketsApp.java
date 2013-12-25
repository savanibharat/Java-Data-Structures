package com.Stack.DelimiterMatching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsApp {

	public static void main(String[] args) throws IOException {
		
		String input;
		while(true){
		
			System.out.println("Enter String containing delimiters ");
			System.out.flush();
			input=getString();
			if(input.equals("")){
				break;
			}
			BracketChecker bc=new BracketChecker(input);
			bc.check();
			break;
			
		}
		
	}
	public static String getString() throws IOException{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
		
	}
	
}
