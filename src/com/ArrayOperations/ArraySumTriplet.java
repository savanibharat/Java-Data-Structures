package com.ArrayOperations;

import java.util.Arrays;

public class ArraySumTriplet {

	public static void main(String[] args) {
		
		int arr[]={6,5,7,3,6,7,3,4,2,5,6,8,7,9,4,5,6};
		Arrays.sort(arr);
		int left,right;
		for(int i=0;i<arr.length-2;i++){
			
			left=i+1;
			right=arr.length-1;
			while(left<right){
				
				if(arr[i]+arr[left]+arr[right]==14){
					System.out.println("triplet is "+arr[i]+","+arr[left]+","+arr[right]);
					break;
				}
				else if(arr[i]+arr[left]+arr[right]<14)
					left++;
				else
					right--;
			}
		}
	}
}
/*triplet is 2,3,9
triplet is 3,3,8
triplet is 3,4,7
triplet is 4,4,6
triplet is 4,5,5

 * */
 