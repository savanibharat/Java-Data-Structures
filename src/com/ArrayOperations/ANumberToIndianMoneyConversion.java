package com.ArrayOperations;

public class ANumberToIndianMoneyConversion {

	public static void main(String[] args) {
		
		int number=1234567890;
		
		int rem1=number%1000;
		System.out.println("rem1 "+rem1);
		int temp=number/1000;
		System.out.println("temp is "+temp);
		number=temp;
		int length=0;
		
		while(temp!=0){
			
			length++;
			temp=temp/10;
		}
		System.out.println("length is " +length);
		if(length%2==1){
			
			System.out.print((int)(number/Math.pow(10,length-1)));
			System.out.print(",");
			length--;
			number=(int)(number%Math.pow(10,length));
			System.out.println("if condition number is "+number);
		}
		for(int i=length;i>0;i--){
			
			if((i%2==0) && (i!=length))
				System.out.print(",");
			
			System.out.print((int)(number/Math.pow(10,i-1)));
			number=(number%(int)Math.pow(10, i-1));
			System.out.println("for loop number is "+number);
		}
		System.out.print(",");
		System.out.print((int)rem1);
	}
}