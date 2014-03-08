package com.ArrayOperations;

public class AAPringMatrixDiagonally {

	public static void main(String[] args) {
		int a[][] = new int[4][3];
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = i+j*3;
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		printDiagonal(a);
	}

	public static void printDiagonal(int[][] M) {

		int i = 0, j = 0;
		int N = 4;
		for (int cnt = 0; cnt < 2 * N - 1; cnt++) {

			System.out.println();
			if (cnt < N) {
				i = cnt;
				j = 0;
			} else {

				i = N - 1;
				j = (cnt + 1) % N;
			}
			while (i >= 0 && j < 3) {

				System.out.print(" " + M[i][j]);
				i--;
				j++;
			}
		}
	}
}
/*
0 3 6 
1 4 7 
2 5 8 
3 6 9 

 0
 1 3
 2 4 6
 3 5 7
 6 8
 9
 * 
*/
