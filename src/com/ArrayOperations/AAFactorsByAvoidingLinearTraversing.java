package com.ArrayOperations;

import java.util.HashSet;
import java.util.Set;

public class AAFactorsByAvoidingLinearTraversing {

	public static void main(String[] args) {

		int a = 91;
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(a);

		int forCnt = 0;
		if (a % 2 == 0)
			ifEven(set, a);
		else
			ifOdd(set,a);
	}

	public static void ifEven(Set<Integer> set, int a) {
		int counter = 0;
		for (int i = 2; i < (a / 4) + 1; i += 2) {

			if (a % i == 0) {
				int quotient = a / i;
				set.add(quotient);
				set.add(i);
				counter++;
				System.out.println(set);
			}
		}

		System.out.println(counter);
		System.out.println(set);

	}
	public static void ifOdd(Set<Integer> set, int a) {
		int counter = 0;
		
		System.out.println("in odd");
		for (int i = 1; i < (a / 4) + 1; i += 2) {

			if (a % i == 0) {
				int quotient = a / i;
				set.add(quotient);
				set.add(i);
				counter++;
				System.out.println(set);
			}
		}

		System.out.println(counter);
		//System.out.println(set);

	}
}
/*
 * [1, 2, 3, 18, 4, 6, 36, 8, 9, 24, 72, 12]
 * 
 * 1*32 2*16 4*8
 */
