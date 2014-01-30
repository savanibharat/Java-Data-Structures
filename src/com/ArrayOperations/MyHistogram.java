package com.ArrayOperations;

public class MyHistogram {

	public static void main(String[] args) {

		int[] a = { 1,2,3,4,3,2,1,5,4,3,2,1 };
		int cnt[] = new int[a.length];
		boolean multiple_count[]=new boolean[a.length];
		for (int i = 0; i < a.length; i++) {

			int temp = a[i];
			for (int j = 0; j < a.length; j++) {

				if (a[j] == temp && multiple_count[i]==false) {
					cnt[a[i]-1]++;
					multiple_count[i]=true;
				}
			}

		}
		for (int i = 0; i < cnt.length; i++)
			
			System.out.println(a[i]+" :: "+cnt[i]);

	}
}
