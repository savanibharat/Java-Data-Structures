package com.ArrayOperations;

/**
 * The Class AllEvensToLeftandOddsToRight.
 * 
 * Input array has several elements. What we need to do is just place all even
 * number to left hand side and odd number to right hand side
 */
public class AllEvensToLeftandOddsToRight {

	/**
	 * The main method.
	 * 
	 * @param args
	 *            the args
	 */
	public static void main(String[] args) {

		int input[] = { 1,3,5,7,9,2,4,6,8 };
		int i = 0;
		int temp = 0;
		int iterationCount=0;
		int j = input.length - 1;
		while (i < j) {

			while (input[i] % 2 == 0){
				i++;
				iterationCount++;
			}
			while (input[j] % 2 != 0){
				j--;
				iterationCount++;
			}
			if (i < j) {

				temp = input[i];
				input[i] = input[j];
				input[j] = temp;
				iterationCount++;
			}
			iterationCount++;
		}

		for (int j2 = 0; j2 < input.length; j2++) {
			System.out.print(input[j2] + " ");
		}
		System.out.println("Total number of iteration is "+iterationCount);
	}

}
/*
 * 8 6 4 2 9 7 5 3 1 Total number of iteration is 18
 */