package com.ArrayOperations;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordsHashMap {

	public static void main(String[] args) {
		
		String str="apple banana pear banana laptop apple";
		Map<String,Integer> map=new HashMap<String,Integer>();
		String count[]=str.split(" ");
		
		for(int i=0;i<count.length;i++){
			
			if(map.containsKey(count[i]))
				map.put(count[i],map.get(count[i])+1);
			else
				map.put(count[i],1);
			
		}
		//for(int i=0;i<count.length;i++)
		System.out.println(map);
	}
}
