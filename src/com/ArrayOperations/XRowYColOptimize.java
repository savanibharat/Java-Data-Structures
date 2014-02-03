package com.ArrayOperations;

public class XRowYColOptimize {

	public static void main(String[] args) {

		int[][] list = { { 0, 1 }, { 1, 0 }, { 1, 2 } };
		// 00
		// 01
		// 10 2
		// 11 3
		int[][] arr = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
		setArray(list,arr);
//		setZero(arr, list);

	}
	
	
	public static void setArray(int[][] list,int[][] arr){
		
		for (int i = 0; i < list.length; i++) {
				
				arr[list[i][0]][list[i][1]] = -1;
			}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}