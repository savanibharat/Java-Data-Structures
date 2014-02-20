package com.ArrayOperations;

public class ArmstrongTest {

	public static void main(String[] args) {

		int num = 153;
		for (int i = 0; i < 1000; i++) {
			
			isArmstrong(i);
		}

	}

	public static void isArmstrong(int num) {

		int original = num;
		int result = 0;

		while (num != 0) {

			int remainder = num % 10;
			result = result + (remainder * remainder * remainder);
			num = num / 10;

		}
		if (original == result)
			
			System.out.println(result + " is armstrong number");
	}
}
