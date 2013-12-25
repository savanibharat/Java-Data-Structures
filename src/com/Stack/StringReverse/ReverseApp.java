package com.Stack.StringReverse;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseApp {

	public static void main(String[] args) throws IOException {

		String input, output;
		while (true) {

			System.out.print("Enter String");
			System.out.flush();
			input = getString();
			System.out.println("::String is " + input);
			if (input.equals(""))
				break;

			Reverser rev = new Reverser(input);
			output = rev.doRev();

			System.out.println("output is " + output);
			break;

		}
	}

	public static String getString() throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		return s;
	}

}
