package com.ArrayOperations;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRU {

	private static final int MAX_ENTRIES = 5;
	Map<Integer,Integer> m = new LinkedHashMap<Integer, Integer>(MAX_ENTRIES){

		//Override this , if it returns true the eldest entry in the map is removed
		protected boolean removeEldestEntry(Map.Entry eldest) {
		       return m.size() > MAX_ENTRIES;
		    }
	};
		

    
	// model function
	int getValue(int x){
		//some complex calculations
		return ++x;
	}
	//to get value from cache
	int getCacheValue(int x){
		return m.get(x);
	}
	
	int get(int x){
		int result=0;
		if(m.containsKey(x)){
			result=getCacheValue(x);
		
		}else{
			result=getValue(x);
		}
		m.put(x, result);
		return result;
	}
	
	
	public static void main(String[] args) {
		LRU obj = new LRU();
		for (int i = 1; i <= 15; i++) {
			obj.get(i);
			System.out.println(obj.m);
		}
		
	}
}
/**
 * {1=2}
{1=2, 2=3}
{1=2, 2=3, 3=4}
{1=2, 2=3, 3=4, 4=5}
{1=2, 2=3, 3=4, 4=5, 5=6}
{2=3, 3=4, 4=5, 5=6, 6=7}
{3=4, 4=5, 5=6, 6=7, 7=8}
{4=5, 5=6, 6=7, 7=8, 8=9}
{5=6, 6=7, 7=8, 8=9, 9=10}
{6=7, 7=8, 8=9, 9=10, 10=11}
{7=8, 8=9, 9=10, 10=11, 11=12}
{8=9, 9=10, 10=11, 11=12, 12=13}
{9=10, 10=11, 11=12, 12=13, 13=14}
{10=11, 11=12, 12=13, 13=14, 14=15}
{11=12, 12=13, 13=14, 14=15, 15=16}

*/
