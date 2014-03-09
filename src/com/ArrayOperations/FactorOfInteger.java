package com.ArrayOperations;

class FactorOfInteger{

	public static void main (String[] args){
		//printFactors(12);
		printDivisors(16);
	}

	static void printDivisors(int n){
		System.out.println("1*" + n);
		printDivisors("",1,n);
	}
	
	static void printDivisors(String prefix,int prev,int n){
		if(n<2)
			return;
		int s = (int) Math.ceil(Math.sqrt(n));
		for(int i = 2;i<=s;i++){
			if(n%i == 0){
				if(i>=prev && n/i>=i){
					System.out.println(prefix + i + "*" + n/i);
					printDivisors(prefix + i + "*",i,n/i);
				}
			}
				
		}
	}
}
/*  (12)
 * 1*12
2*6
2*2*3
3*4

(24)
1*24
2*12
2*2*6
2*2*2*3
2*3*4
3*8
4*6

(1024)
1*1024
2*512
2*2*256
2*2*2*128
2*2*2*2*64
2*2*2*2*2*32
2*2*2*2*2*2*16
2*2*2*2*2*2*2*8
2*2*2*2*2*2*2*2*4
2*2*2*2*2*2*2*2*2*2
2*2*2*2*2*2*4*4
2*2*2*2*2*4*8
2*2*2*2*4*16
2*2*2*2*4*4*4
2*2*2*2*8*8
2*2*2*4*32
2*2*2*4*4*8
2*2*2*8*16
2*2*4*64
2*2*4*4*16
2*2*4*4*4*4
2*2*4*8*8
2*2*8*32
2*2*16*16
2*4*128
2*4*4*32
2*4*4*4*8
2*4*8*16
2*8*64
2*8*8*8
2*16*32
4*256
4*4*64
4*4*4*16
4*4*4*4*4
4*4*8*8
4*8*32
4*16*16
8*128
8*8*16
16*64
32*32


 */
		