package com.ArrayOperations;

import java.io.*;
import java.lang.*;
import java.util.ArrayList;
 
 
class RotateNumber {   
 
 
      public static void RotateNumber1(long number)
      {
            long start = number;
            int numdigits = (int) Math.log10((double)number); // would return numdigits - 1
            int multiplier = (int) Math.pow(10.0, (double)numdigits);
            System.out.println(multiplier);
            //System.out.println(numdigits);
            //System.out.println(multiplier);

            while(true)
            {
                  //long q = number / 10;
                  //System.out.println("quotient is "+q);
                  long r = number % 10;
                  System.out.println("remainder is "+r);
 
                  //1234 = 123;
                  number = number / 10;
                  System.out.println("number is "+number);
                  number = number + multiplier * r;
                  System.out.println(number);
                 
                  if(number == start)
                        break;
            }
      }
 
 
    public static void main(String[] args) {
 
            String inpstring = "";
            InputStreamReader input = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(input);
 
            try
            {
                  System.out.println("Enter a Number to Rotate:");
                  inpstring = reader.readLine();
                  long number = Long.parseLong(inpstring, 10);
                  RotateNumber1(number);
            }
            catch (Exception e)
            {
                  e.printStackTrace();
            }
    }
}