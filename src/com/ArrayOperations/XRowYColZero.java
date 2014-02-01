package com.ArrayOperations;

public class XRowYColZero {
	
	public static void main(String[] args) {
		
		int [][] list={{0,1},
					   {1,0},
					   {1,2}};
		//00 
		//01
		//10 2
		//11 3
		int [][]arr={{1,1,1},
					 {1,1,1},
					 {1,1,1}};
		
		setZero(arr,list);
		
		
	}
	public static void setZero(int [][]arr,int [][]list){
		
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list[0].length; j++) {
				int x=list[i][0];
				int	y=list[i][1];
				arr[x][y]=-1;
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
/*1 -1 1 
-1 1 -1 
1 1 1 */