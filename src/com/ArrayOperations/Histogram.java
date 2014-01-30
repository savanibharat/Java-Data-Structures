package com.ArrayOperations;

import java.util.HashMap;
import java.util.Map;

public class Histogram{
	
	public static void main(String[] args){
		
		Map <Integer, Integer> result = new HashMap<Integer, Integer>();
	      int arryNum[] = {2,3,4,5,4,4,3,6,5,4,5,5,6,4,4};
	      for(int i: arryNum){ //foreach more correct in this case
	            if (result.containsKey(i)) result.put(i, result.get(i)+1);
	            else result.put(i, 1);
	        }
	        for (int i: result.keySet()) 
	        	System.out.println(i + ":" + result.get(i));
		
		
	}
	
	
}
