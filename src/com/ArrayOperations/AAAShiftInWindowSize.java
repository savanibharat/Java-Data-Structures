package com.ArrayOperations;

import java.util.LinkedList;

public class AAAShiftInWindowSize {

	public static void main(String[] args) throws InterruptedException {
		
		int a[]={12,3,4,5,6,7,8,9,10,11,12,13,14,15,16,27};
		//highestFeedPerSecond(a,3);
		lowestElemPerWindow(a,3);
	}
	
	public static void highestFeedPerSecond(int[] array,int k) throws InterruptedException {
		LinkedList<Integer> minimum=new LinkedList<Integer>();
		for(int i=0;i<array.length;i++) {
			int count=0;
			while(count < k) {
				minimum.add(array[i++]);
				count++;
			}
			System.out.print(minimum);
			System.out.print("  "+getMinimum(minimum));
			minimum.remove();
			System.out.println();
			k=1;
			i-=1;
		}
	}

	public static int getMinimum(LinkedList<Integer> myMinQueue) {
		int minimum=Integer.MAX_VALUE;
		for(Integer myInteger:myMinQueue) {
			if(myInteger<minimum) {
				minimum=myInteger;
			}
		}
		return minimum;
	}
	
	public static void lowestElemPerWindow(int a[],int k){
		int count=0;
		LinkedList<Integer> l=new LinkedList<Integer>();
		for (int i = 0; i < a.length; i++) {
			count=0;
			while(count<k){
				
				l.add(a[i]);
				i++;
				count++;
			}
			
			System.out.print(l);
			int min=getMin(l);
			System.out.println(min);
			l.remove();
			i--;
			k=1;
		}
	}
	public static int getMin(LinkedList<Integer> l){
		int a=Integer.MAX_VALUE;
		for(Integer xyz:l){
			
			if(xyz<a)
				a=xyz;
		}
		return a;
	}
	
	
}
/**
 * [12, 3, 4]  3
[3, 4, 5]  3
[4, 5, 6]  4
[5, 6, 7]  5
[6, 7, 8]  6
[7, 8, 9]  7
[8, 9, 10]  8
[9, 10, 11]  9
[10, 11, 12]  10
[11, 12, 13]  11
[12, 13, 14]  12
[13, 14, 15]  13
[14, 15, 16]  14
[15, 16, 27]  15

*/
