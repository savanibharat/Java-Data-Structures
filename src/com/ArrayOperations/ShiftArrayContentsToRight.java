package com.ArrayOperations;

public class ShiftArrayContentsToRight {

	public static void main(String[] args) {
		
		int[] input={1,2,3,4,5,6,7,8,9};
		int i=0;
		int[] output=new int[input.length];
		while(i<input.length){
			
			int k=(i+1)%input.length;
			output[k]=input[k];
			i++;
			for (int j = 0; j < output.length; j++) {
				System.out.print(output[j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for (int j = 0; j < output.length; j++) {
			System.out.print(output[j]+" ");
		}
		
	}
}
/**
 *0 2 0 0 0 0 0 0 0 
0 2 3 0 0 0 0 0 0 
0 2 3 4 0 0 0 0 0 
0 2 3 4 5 0 0 0 0 
0 2 3 4 5 6 0 0 0 
0 2 3 4 5 6 7 0 0 
0 2 3 4 5 6 7 8 0 
0 2 3 4 5 6 7 8 9 
1 2 3 4 5 6 7 8 9 

1 2 3 4 5 6 7 8 9  
 */
