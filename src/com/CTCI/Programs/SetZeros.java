package com.CTCI.Programs;

// TODO: Auto-generated Javadoc
/**
 * @author Savani Bharat
 * The Class SetZeros.
 */
public class SetZeros {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		int[][] matrix={{1,2,3},{3,2,1},{0,9,8}};

		int[] row = new int[matrix.length];
		int[] col = new int[matrix[0].length];

		
		
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				if (matrix[i][j] == 0) {

					row[i] = 1;
					col[j] = 1;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[0].length; j++) {

				if ((row[i] == 1 || col[j] == 1)) {

					matrix[i][j] = 0;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/*
 * 
1 2 3 
3 2 1 
0 9 8 

0 2 3 
0 2 1 
0 0 0 
 * 
 * */