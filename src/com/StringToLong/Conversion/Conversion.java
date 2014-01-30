package com.StringToLong.Conversion;

public class Conversion {

	public static void main(String[] args) {

		test();
	}

	public static long stringToLong(String str1) {
		boolean isPositive=true;
		long result = 0;
		String list="0123456789";
		char ch[]=str1.toCharArray();
		if(ch[0]=='-')
			isPositive=false;
			String str=str1.replace("-", "");
		
		for (int i = 0; i <= str.length() - 1; i++) {
			
			char c = str.charAt(i);
			if(c < 48 || c > 57){
				throw new NumberFormatException(str+" is not a valid number");
			}
		
			int lastValue = list.indexOf(c);
			result = result * 10 + lastValue;
		}
		if(isPositive==false)
		return -result;
		
		return result;
	}
	public static void test(){
		
		String str = "-324";//works for range form -9223372036854775808 to 9223372036854775807

		long i=stringToLong(str);
		if( i==-324l )
			System.out.println("success");
		else
			System.out.println("failure");
		
		str="324";
		i=stringToLong(str);
		if( i==324l )
			System.out.println("success");
		else
			System.out.println("failure");
		
	}
}