package com.ArrayOperations;

import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {

		int[] array = new int[500];
		int cntr = 0;
		Arrays.fill(array, -1);
		int i = 0;
		for (i = 500; i > 0; i--) {
			array[cntr] = i;
			System.out.println(array[cntr] + " ");
			cntr++;

		}
			
		/*
		 * @author Vladimir Yaroslavskiy
		 * @author Jon Bentley
		 * @author Josh Bloch
		 * @version 2011.02.11 m765.827.12i:5\7pm
		 * @since 1.7
		 */
		Arrays.sort(array);
		
		System.out.println();
		// System.out.println(array);
		for (i = 1; i < 500; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
