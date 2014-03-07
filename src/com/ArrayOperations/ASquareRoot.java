package com.ArrayOperations;

public class ASquareRoot {

	public static void main(String[] args) {

		int square = 1024;
		int low = 0;
		int high = square;
		//square();
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

}