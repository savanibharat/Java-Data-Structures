package com.ArrayOperations;

public class ACountNumberOfTwos {

	static int count_2 =0;
		
		public static void main(String[] args){
			
		    int num=100;
		    
		    for(int i=0; i<=num; i++){
		    	count_2 = count2_recur(i);
		    }
		    
		    System.out.println("Count of 2 is:"+count_2);
		}
		
		public static int count2_recur(int num){
			
			if(num == 2 ){ count_2++;}
			else{
				int a = num % 10;
				if(a==2){
					count_2++;
				}
				num = num/10;
				if(num > 0 ){
					count2_recur(num);
				}
				else{
					return count_2;
				}
			}
			return count_2;
		}
		
	}
