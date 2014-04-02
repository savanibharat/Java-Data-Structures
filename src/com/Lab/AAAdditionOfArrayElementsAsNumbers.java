package com.Lab;

public class AAAdditionOfArrayElementsAsNumbers {

	/**
	 * The main method.
	 *
	 * @param args the args
	 */
	public static void main(String[] args) {
		/*
		 * int a[] = { 1, 2, 8 }; int b[] = { 1, 2, 9 };
		 */
		int a[] = { 1, 2, 88 };
		int b[] = { 1, 2, 10000 };

		int aa=add(a);
		int bb=add(b);
		System.out.println(aa+bb);
		int c[] = new int[5];
		int div = 0;
		int sum = 0;
		for (int i = b.length - 1; i >= 0; i--) {

			int d = a[i] + b[i] + div;// d=17
			if (d > 9) {
				int mod = d % 10;
				// sum=a[i]+b[i]+mod;
				c[i] = mod;
				// System.out.println("c[i] " + c[i]);
				// System.out.println("mod result is " + mod);
				div = d / 10;
				// System.out.println("div result is " + div);
			} else {
				c[i] = a[i] + b[i] + div;
			}
			// System.out.println(c[i]);
		}
	}

	public static int integerLength(int a) {

		int length = 0;
		while (a != 0) {
			a = a / 10;
			length++;
		}
		return length;
	}
	
	public static int add(int a[]) {
		int finalNumber = 0;
	    for (int i = 0; i < a.length; i++) {
	        int num = a[i];
	        if (num != 0) {
	            while (num > 0) {
	                finalNumber *= 10;
	                num /= 10;
	            }
	            finalNumber += a[i];
	        } else {
	            finalNumber *= 10;
	        }
	    }
	    System.out.println(finalNumber);
	    return finalNumber;
	}
}