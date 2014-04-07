package com.ArrayOperations;

//# and _
public class AAAWordHistogram {

	public static void main(String[] args) {

		String str="abc,.';?><:s12dh#jdhf874354r';[]r-rew./.,ds/f';'l'`1`3p@#&^@%^%#";
		String s1[]=str.split("[\\[\\]\\!$%&'()*+,-./:;<=>?@\\^`{|}~΅Ά£¤¥¦§¨©ª«¬­®―°±²³΄µ¶"
				+ "·ΈΉΊ»Ό½ΎΏΐΑΒΓΔΕΖΗΘΙΚΛΜΝΞΟΠΡÒΣΤΥΦΧΨΩΪΫάέήίΰαβγδεζηθικλμνξοπρςστυφχψωϊϋόύώÿ?]+");
		for (int i = 0; i < s1.length; i++) {
			System.out.println(i+" "+s1[i]);
		}
	}
}
