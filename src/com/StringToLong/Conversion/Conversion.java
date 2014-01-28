package com.StringToLong.Conversion;

public class Conversion {

	public static void main(String[] args) {

		String str = "123";
		stringToLong(str);

	}

	public static long stringToLong(String str) {

		long result = 0;
		//String list = "0123456789";
		String list="0123456789";
		for (int i = 0; i <= str.length() - 1; i++) {
			
			char c = (char) str.charAt(i);
			if(c < 48 || c > 57){
				throw new NumberFormatException(str+" is not a valid number.");
			}
			int lastValue = list.indexOf(c);
			System.out.println("lastValue "+lastValue);
			result = result * 10 + lastValue;
			System.out.println("result is "+result);
			System.out.println();
		}
		return result;

	}

}
