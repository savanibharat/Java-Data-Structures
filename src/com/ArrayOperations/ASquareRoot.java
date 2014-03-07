package com.ArrayOperations;

public class ASquareRoot {

	public static void main(String[] args) {

		int square = 1024;
		int low = 0;
		int high = square;
		square();
		while (low <= high) {

			int mid = (high + low) / 2;
			if (mid * mid == square) {
				System.out.println("root is " + mid);
				break;
			}

			else if (mid * mid > square) {
				high = (mid - 1);
				System.out.println("high is " + high);
			} else
				low = (mid + 1);
			System.out.println("low is " + low);
		}
	}

	public static void square(){
		
		int s;
		int n=1025;
		for(s = 1; s*s <= n; s++);
		s--;
		
		double x=000;
		for(double d = 0.001; d < 1.0; d+= 0.001)
		{
			x = (double)s + d;
			if((x*x > (double)n))
			{
				x -= 0.001;
				break;
			}
		}
		System.out.print("square root is %.3lf\n" +x);
		
	}

}