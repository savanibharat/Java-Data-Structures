package com.ArrayOperations;

public class FizzBuzz {

	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			
			if(i%3==0) 
				System.out.println(i+" FIZZ divisible by 3");
			if(i%5==0)
				System.out.println(i+" BUZZ divisible by 5");
			if(i%(3*5)==0)
				System.out.println(i+" FIZZBUZZ divisible by 15");
		}
	}
}
/**
 * 0 FIZZ divisible by 3
0 BUZZ divisible by 5
0 FIZZBUZZ divisible by 15
3 FIZZ divisible by 3
5 BUZZ divisible by 5
6 FIZZ divisible by 3
9 FIZZ divisible by 3
10 BUZZ divisible by 5
12 FIZZ divisible by 3
15 FIZZ divisible by 3
15 BUZZ divisible by 5
15 FIZZBUZZ divisible by 15
18 FIZZ divisible by 3
20 BUZZ divisible by 5
21 FIZZ divisible by 3
24 FIZZ divisible by 3
25 BUZZ divisible by 5
27 FIZZ divisible by 3
30 FIZZ divisible by 3
30 BUZZ divisible by 5
30 FIZZBUZZ divisible by 15
33 FIZZ divisible by 3
35 BUZZ divisible by 5
36 FIZZ divisible by 3
39 FIZZ divisible by 3
40 BUZZ divisible by 5
42 FIZZ divisible by 3
45 FIZZ divisible by 3
45 BUZZ divisible by 5
45 FIZZBUZZ divisible by 15
48 FIZZ divisible by 3

*/
