/*
*
* | *
* | * | *
* | * | * | *
4 + 3 + 2 + 1 = 10
so we have ((n^2)+n)/2
Example
For n=4

4^2=16

16+4=20

20/2=10
Program Output

Enter the number 
4
Entering n 4
Entering n 3
Entering n 2
Entering n 1
Returning 1
Returning 3
Returning 6
Returning 10
Time to execute recursion 1.0
Triangle is :: 10



Characteristics of recursion
--> It calls itself
--> When it calls itself, it does so to solve a smaller proble
--> There's some version of the problem that is simple enoug that the routine can solve it, and return, without calling itself

*/
package com.Recursion.TriangleApp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleApp {

	static int number;

	public static void main(String[] args) throws IOException {

		System.out.println("Enter the number ");
		System.out.flush();
		number = getInt();
		
		double start = System.currentTimeMillis();
		int theAnswer = triangle(number);
		double end = System.currentTimeMillis();
		
		System.out.println("Time to execute recursion "+(end - start));
		System.out.println("Triangle is :: " + theAnswer);

	}

	public static int triangle(int n){
		
		System.out.println("Entering n "+n);
		if(n==1){
			
			System.out.println("Returning 1");
			return 1;
			
		}
		else
		{
			
			int temp=n+triangle(n-1);
			System.out.println("Returning "+temp);
			return temp;
			
		}
		
	}
	
	
	
	/*public static int triangle(int n) {

		if (n == 1)
			return 1;
		else{
			
			return (n + triangle(n - 1));
		}
	}

*/	public static int getInt() throws IOException {

		String s = getString();
		return Integer.parseInt(s);

	}

	public static String getString() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return (br.readLine());

	}

}
