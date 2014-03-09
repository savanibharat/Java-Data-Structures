package com.ArrayOperations;

public class ASearchInRowWiseColWiseSortedMatrix {

	public static void main(String[] args) {
		
		int a[][]={ {1, 2, 3, 4},
					{5, 6, 7, 8},
					{9,10,11,12},
					{13,14,15,16},
					{17,18,19,20}
				};
		
		/* 00,01,02,03
		 * 10,11,12,13
		 * 20,21,22,23
		 * 30,31,32,33,
		 * 40,41,42,43
		 * */
		
		
		int row=0; //5
		int col=a[0].length-1; //4
		int curVal=0;
		int x=11;
		while(row<a.length && col>=0){
			
			curVal=a[row][col];
			System.out.println("Current value is "+curVal);
			if(curVal==x) {
				System.out.println(x+" found at "+row+" "+col);
				break;
			}
			if(curVal>x){
				col--;
				System.out.println("Col -- Current value is "+a[row][col]);
			}
			else{
				row++;
				System.out.println("Row++ Current value is "+a[row][col]);
			}
		}
	}
}
/*
 *Current value is 4
Col -- Current value is 3
Current value is 3
Col -- Current value is 2
Current value is 2
Col -- Current value is 1
Current value is 1
1 found at 0 0
 
 
Current value is 4
Row++ Current value is 8
Current value is 8
Row++ Current value is 12
Current value is 12
Col -- Current value is 11
Current value is 11
11 found at 2 2

 */
