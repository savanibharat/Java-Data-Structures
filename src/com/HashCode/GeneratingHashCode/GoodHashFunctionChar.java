package com.HashCode.GeneratingHashCode;

public class GoodHashFunctionChar {

public static void main(String[] args) {
		String str="GOOD HASH FUNCTION";
		
		char []arr=str.toCharArray();
		int size=100;
		double factor=0.485;
		int hash[]=new int[arr.length];
		for(int i=0;i<arr.length;i++){
			
			hash[i]=(int)(size*((arr[i]*factor)%1));
			System.out.println("hash of "+arr[i]+" is "+hash[i]);
		}
	}
}
/*Same characters have same value so collision can be more
 * Example :: apt,pat,tap

hash of G is 43
hash of O is 31
hash of O is 31
hash of D is 97
hash of   is 51
hash of H is 92
hash of A is 52
hash of S is 25
hash of H is 92
hash of   is 51
hash of F is 94
hash of U is 22
hash of N is 82
hash of C is 49
hash of T is 74
hash of I is 40
hash of O is 31
hash of N is 82

 * 
 */
