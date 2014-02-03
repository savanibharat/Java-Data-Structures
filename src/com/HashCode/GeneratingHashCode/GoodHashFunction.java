package com.HashCode.GeneratingHashCode;

public class GoodHashFunction {

	public static void main(String[] args) {
		
		int []arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
		int size=100;
		double factor=0.485;
		int hash[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			
			hash[i]=(int)(size*((arr[i]*factor)%1));
			System.out.println("hash of "+arr[i]+" is "+hash[i]);
			
		}
		
	}
}
