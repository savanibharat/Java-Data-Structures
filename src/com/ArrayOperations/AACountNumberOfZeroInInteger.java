package com.ArrayOperations;

public class AACountNumberOfZeroInInteger {

	public static void main(String[] args) {

		int num=912312313;
		int count=0;
		int k;
		while (num != 0) {
			k = num % 10;

			if (k == 1)
				count++;

			num = num / 10;
		}
		System.out.println(count);
	}
}
