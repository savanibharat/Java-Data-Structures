package com.ArrayOperations;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
 
public class DuplicateNumber {
 
    public int findDuplicateNumber(List<Integer> numbers){
         
       	Set<Integer> set=new HashSet<Integer>();
    	
    	for(int i=0;i<numbers.size();i++){
    		
    		if(set.contains(numbers.get(i)))
    			return numbers.get(i);
    		else
    			set.add(numbers.get(i));
    		
    	}
    	return -1;
    }
     
    public static void main(String a[]){
        List<Integer> numbers = new ArrayList<Integer>();
        Random rand=new Random();
        for (int i = 0; i < 10; i++) {
			numbers.add((int)rand.nextInt(10));
		}
        System.out.println(numbers);

        DuplicateNumber dn = new DuplicateNumber();
        System.out.println("Duplicate Number: "+dn.findDuplicateNumber(numbers));
    }
}