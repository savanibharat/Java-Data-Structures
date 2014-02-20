package com.ArrayOperations;

public class NumPower2 {

	public static void main(String[] args) {
		
		int n=1024;
		boolean xy=isPowerOfTwo(n);
		System.out.println(xy);
		for(int i=1;i<=n/2;i++){
			
			double x=Math.pow(2,i);
			if(x>n)
				break;
			else if(x==n)
				System.out.println("2^"+i);
		}
		
	}
	public static boolean isPowerOfTwo (int x)
	{
	 while (((x % 2) == 0) && x > 1) /* While x is even and > 1 */
	   x /= 2;
	 return x == 1;
	}
}
/**
 * true
2^10
*/
