package com.HashCode.GeneratingHashCode;

/**
 * @author Savani Bharat
 *
 */
public class Example {
	public static void main(String[] args) {
		String text = "Bharat iudsfd";
		int size = text.length();

		System.out.println("size of text is " + size);
		String[] msgsplit = text.split(" ");
		System.out.println("msgsplit " + msgsplit);

		for (int k = 0; k < msgsplit.length; k++) {

			String arraycontents = msgsplit[k];
			System.out.println("array contents " + arraycontents);
			int counter = 0;
			int arrLength = arraycontents.length();

			System.out.println("arrLength " + arrLength);

			for (int j = 0; j < arrLength; j++) {

				String newmsg = "";
				char[] msgchrs = arraycontents.toCharArray();

				for (int i = 0; i < msgchrs.length; i++) {

					if (i == counter && counter < msgchrs.length) {
						System.out.println("inside if");
						int singleLength = arraycontents.length();
						System.out.println("singleLength "+singleLength);
						if (singleLength == 1) {

							newmsg = newmsg + arraycontents;
							System.out.println("message generated is :"
									+ newmsg);
							break;
						}
						 continue;
					} else if (counter < msgchrs.length) {
						newmsg = newmsg + msgchrs[i];
						 System.out.println("newmsg "+newmsg); 
					}
				}
			}
		}
	}
}