package com.CTCI.Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GoodHashFunctionJava {
	
	static int i;
	static Map<Integer,Integer> result=new HashMap<Integer,Integer>();
	static List<Integer> arr=new ArrayList<Integer>();
	public static void main(String[] args) {
		
		for (int i = 0; i < 100; i++) {
			
			hashIt(i);
		}
		//System.out.println(arr);
		histogram(arr);
	}
	public static void histogram(List<Integer>arr){
		boolean unique=true;
		for (Integer i:arr){
			
            if (result.containsKey(i)){
            	result.put(i, result.get(i)+1);
            	unique=false;
            }
            else result.put(i, 1);
		}
		System.out.println(unique);
		
	}
	public static void hashIt(int h){
		
		h ^= (h >>> 20) ^ (h >>> 12);
		// System.out.println(h);
		int a = h ^ (h >>> 7) ^ (h >>> 4);
		//System.out.println("for i = " + i + " " + a);
		arr.add(a);
		
		i++;
		
		
	}
	
}
/*
for i = 0 0
for i = 1 1
for i = 2 2
for i = 3 3
for i = 4 4
for i = 5 5
for i = 6 6
for i = 7 7
for i = 8 8
for i = 9 9
for i = 10 10
for i = 11 11
for i = 12 12
for i = 13 13
for i = 14 14
for i = 15 15
for i = 16 17
for i = 17 16
for i = 18 19
for i = 19 18
for i = 20 21
for i = 21 20
for i = 22 23
for i = 23 22
for i = 24 25
for i = 25 24
for i = 26 27
for i = 27 26
for i = 28 29
for i = 29 28
for i = 30 31
for i = 31 30
for i = 32 34
for i = 33 35
for i = 34 32
for i = 35 33
for i = 36 38
for i = 37 39
for i = 38 36
for i = 39 37
for i = 40 42
for i = 41 43
for i = 42 40
for i = 43 41
for i = 44 46
for i = 45 47
for i = 46 44
for i = 47 45
for i = 48 51
for i = 49 50
for i = 50 49
for i = 51 48
for i = 52 55
for i = 53 54
for i = 54 53
for i = 55 52
for i = 56 59
for i = 57 58
for i = 58 57
for i = 59 56
for i = 60 63
for i = 61 62
for i = 62 61
for i = 63 60
for i = 64 68
for i = 65 69
for i = 66 70
for i = 67 71
for i = 68 64
for i = 69 65
for i = 70 66
for i = 71 67
for i = 72 76
for i = 73 77
for i = 74 78
for i = 75 79
for i = 76 72
for i = 77 73
for i = 78 74
for i = 79 75
for i = 80 85
for i = 81 84
for i = 82 87
for i = 83 86
for i = 84 81
for i = 85 80
for i = 86 83
for i = 87 82
for i = 88 93
for i = 89 92
for i = 90 95
for i = 91 94
for i = 92 89
for i = 93 88
for i = 94 91
for i = 95 90
for i = 96 102
for i = 97 103
for i = 98 100
for i = 99 101
 
 */
