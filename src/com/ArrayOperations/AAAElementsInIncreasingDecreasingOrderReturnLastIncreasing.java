package com.ArrayOperations;

public class AAAElementsInIncreasingDecreasingOrderReturnLastIncreasing {
	public static int iter=0;
		public static void main(String[] args){
			int arr[] = {1,2,3,4,5,6,7,6,2,1};
			System.out.println(searchLargest(arr,0,arr.length));
			//System.out.println(iter);
		}
		
		public static int searchLargest(int[] array,int start,int end){
			
			while ( start <= end){
				
				int mid = start + (end -start)/2;
				System.out.println("start is "+start);
				System.out.println("end is "+end);
				System.out.println(mid);
				if ( mid == array.length-1)return -1;
				if(  array[mid] > array[mid-1] && array[mid] > array[mid+1]){
					iter++;
					return array[mid];
					
				}
				else if( array[mid] < array[mid+1]){
					start = mid+1;
					iter++;
				}
				else if( array[mid] < array[mid-1]){
					end = mid-1;
					iter++;
				}
				iter++;
			}
			return -1;
		}
}