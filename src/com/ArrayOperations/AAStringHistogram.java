package com.ArrayOperations;

public class AAStringHistogram {

	public static void main(String[] args) {
		
		String str="abcab";
		for (int i = 0; i < str.length(); i++) {
			//System.out.println((int)str.charAt(i));
		}
		
		int a[]=new int[256];
		int counter=0;
		for (int i = 0; i < str.length(); i++) {
			a[((int)str.charAt(i))]=a[((int)str.charAt(i))]+(++counter);
			counter=0;
		}
		
		for (int i = 0; i < a.length; i++) {
			if(a[i]==1){
				System.out.println((char)i+" "+i+" "+a[i]);
				break;
			}
		}
	}
}
/*
a 97 4
d 100 2
e 101 1
f 102 2
g 103 2
i 105 2
s 115 2
u 117 3
y 121 1
 * */
