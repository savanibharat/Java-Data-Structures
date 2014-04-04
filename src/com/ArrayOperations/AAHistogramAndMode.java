package com.ArrayOperations;

import java.util.HashMap;
import java.util.Map;

public class AAHistogramAndMode {

	public static void main(String[] args) {

		int a[] = { 4,4,5,6,4,3,7,8,2,6,5,4,3,7,6,4,3,5 };
		int b[] = new int[a.length];
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			b[a[i]] = b[a[i]] + (++counter);
			counter = 0;
		}
		
		for (int i = 0; i < b.length; i++) {
			//if(b[i]==1)
			//System.out.println(i+"  "+b[i]);
		}
		int g=my(a);	
		System.out.println(g);
		/*int max = 1;
		int index = 0;
		for (int i = 0; i < b.length; i++) {
			if (b[i] > 0) {
				if (max < b[i]) {
					max = b[i];
					index = i;
				}
			}
		}
		System.out.println(index);
		System.out.println("Mode is " + max + " for value " + index);
		for (int i = 0; i < b.length; i++) {
			if (b[i] > 0) {
				System.out.println(i + " " + b[i]);

			}
		}
*/
	}
	public static int my(int [] aa){
		
		/*if(a[0]==a[1])
			return a[0];
		int b[] = new int[a.length+1];
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			b[a[i]] = b[a[i]] + (++counter);
			counter = 0;
		}
  		int i=0;
  		for (i = 0; i < b.length; i++) {
			
  			
  			if(b[i]==1){
				return i;
        	}
		}
  		return -1;*/
		
		int a[]={0,0,1,2,1};
		
  		HashMap<Integer, Integer> hashMap=new HashMap<Integer,Integer>();
  		if(a.length==1)
  			return a[0];
  		
    	if(a.length==2)
            if(a[0]==a[1])
  			return a[0];
    	
    	for (int i = 0; i < a.length; i++) {
			
    		if(hashMap.containsKey(a[i]))
    			hashMap.put(a[i],hashMap.get(a[i])+1);
    		else
    			hashMap.put(a[i],1);
    		
		}
    	
  		for (Map.Entry<Integer,Integer> entry : hashMap.entrySet()) {
  		  Integer key=entry.getKey();
  		  Integer value = entry.getValue();
  		  
  		  if(value==1)
  			  return key;
  		  
  		}
		return -1;
  		
	}
}
/*
4
Mode is 5 for value 4
2 1
3 3
4 5
5 3
6 3
7 2
8 1

 * */
 