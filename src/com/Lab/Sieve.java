package com.Lab;

import java.util.*;

public class Sieve
{
    private BitSet sieve;
    static int iter=0;
    private Sieve() {}
 
    private Sieve(int size) {
        sieve = new BitSet((size+1)/2);
    }
 
    private boolean is_composite(int k)
    {
        assert k >= 3 && (k % 2) == 1;
        return sieve.get((k-3)/2);
    }
 
    private void set_composite(int k)
    {
        assert k >= 3 && (k % 2) == 1;
        sieve.set((k-3)/2);
    }
 
    public static List<Integer> sieve_of_eratosthenes(int max)
    {	
        Sieve sieve = new Sieve(max + 1); // +1 to include max itself
        for (int i = 3; i*i <= max; i += 2) {
            if (sieve.is_composite(i)){
            	iter++;
            	continue;
                }
 
            // We increment by 2*i to skip even multiples of i
            for (int multiple_i = i*i; multiple_i <= max; multiple_i += 2*i){
                sieve.set_composite(multiple_i);
                iter++;
            }
        }
        List<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        for (int i = 3; i <= max; i += 2){
            if (!sieve.is_composite(i))
                primes.add(i);
            iter++;
            }
 
        return primes;
    }
  
    public static void main(String[] args) {
		
    	Sieve s=new Sieve();
    	long start=System.currentTimeMillis();
    	ArrayList<Integer> answer=(ArrayList<Integer>) s.sieve_of_eratosthenes(1000000);
    	long end=System.currentTimeMillis();
    	/*System.out.println(answer);
    	System.out.println("iter is "+iter);
    	
    	*/System.out.println("start - end "+(end-start));
    	double time=1311399/1000000.0;
    	System.out.println(time);
	}
}