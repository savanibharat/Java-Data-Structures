package com.ArrayOperations;

public class AAHistogramAndMode {

	public static void main(String[] args) {

		int a[] = { 4,4,5,6,4,3,7,8,2,6,5,4,3,7,6,4,3,5 };
		int b[] = new int[a.length];
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			b[a[i]] = b[a[i]] + (++counter);
			counter = 0;
		}
		int max = 1;
		int index = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] > 0) {
				if (max < b[i]) {
					max = b[i];
					index = i;
				}
			}
		}
		System.out.println(index);
		System.out.println("Mode is " + max + " for value " + index);
		for (int i = 0; i < b.length; i++) {
			if (b[i] > 0) {
				System.out.println(i + " " + b[i]);

			}
		}

	}
}
/*
4
Mode is 5 for value 4
2 1
3 3
4 5
5 3
6 3
7 2
8 1

 * */
 