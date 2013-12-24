package com.Sorting;

public class BubbleSort
{
	public static void main(String args[]){

	int list[]={9,8,7,6,5,4,3,2,1};
	int n=list.length;
	int temp;
	/*for(int i=0;i<n;i++){
		System.out.println("position "+i+": "+list[i]);	

	}
*/	for(int i=0;i<n;i++){
		for(int j=1;j<n-i;j++){
			if(list[j-1]>list[j]){
				temp=list[j-1];
				list[j-1]=list[j];
				list[j]=temp;
				
				for (int k = 0; k < list.length; k++) {
					System.out.print(list[k]+" ");
				}
				System.out.println();
				System.out.println();
			}
				
		}
		
	}
/*	System.out.println("\n\n");
	for(int i=0;i<n;i++){
		System.out.println("position "+i+": "+list[i]);	

	}
*/
	}
}