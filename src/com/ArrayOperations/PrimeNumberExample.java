package com.ArrayOperations;

public class PrimeNumberExample {

    public static void main(String args[]) {
      
     
      System.out.println("Enter the number till which prime number to be printed: ");
      int limit = 20;
    
      
      System.out.println("Printing prime number from 1 to " + limit);
      for(int number = 2; number<=limit; number++){

    	  if(isPrime(number)){
              System.out.println(number);
          }
      }

    }

    /*
     * Prime number is not divisible by any number other than 1 and itself
     * @return true if number is prime
     */
    public static boolean isPrime(int number){
        for(int i=2; i<number/2; i++){
           if(number%i == 0){
               return false; //number is divisible so its not prime
           }
        }
        return true; //number is prime now
    }
}