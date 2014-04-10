package com.ArrayList.PermutationOfStringRecursive;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashMap;
import java.util.HashMap;
import java.util.HashMap;

public class Dict {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new FileReader(
				"StringTokenizerInput2.txt"));

		// // doc keyword linenumber index
		HashMap<String, HashMap<String, HashMap<Integer, ArrayList<Integer>>>> doc1 = new HashMap<String, HashMap<String, HashMap<Integer, ArrayList<Integer>>>>();
		ArrayList<Integer> index1;// =new ArrayList<Integer>();
		HashMap<Integer, ArrayList<Integer>> lineNumber1 = new HashMap<Integer, ArrayList<Integer>>();
		HashMap<String, HashMap<Integer, ArrayList<Integer>>> keyword = new HashMap<String, HashMap<Integer, ArrayList<Integer>>>();
		String str;
		int lineNumber = 0;
		while ((str = br.readLine()) != null) {
			lineNumber++;
			String newStr[] = str.toLowerCase().split(" ");

			for (int i = 0; i < newStr.length; i++) {
				if (newStr[i].length() > 2) {
					
					index1 = new ArrayList<Integer>();
					
					if (keyword.containsKey(newStr[i])) {
						
						lineNumber1 = keyword.get(newStr[i]);
						index1 = lineNumber1.get(lineNumber);
						if (!index1.contains(i)) {

							index1.add(i);
							lineNumber1.put(lineNumber, index1);
							keyword.put(newStr[i],
									lineNumber1);
							doc1.put("StringTokenizerInput2.txt", keyword);
						}
					} else {
						index1.add(i);
						lineNumber1.put(lineNumber, index1);
						keyword.put(newStr[i], lineNumber1);
						doc1.put("StringTokenizerInput2.txt", keyword);
						System.out.println(keyword);
						System.out.println(lineNumber);
					}
				}
			}
		}
		System.out.println(keyword);
		// }
	}
}

/*
 * index1.add(1); index1.add(2); System.out.println(index1);
 * System.out.println(); index2.add(1); index2.add(3);
 * System.out.println(index2); System.out.println(); lineNumber1.put(20,
 * index1); lineNumber2.put(30, index1); System.out.println(lineNumber1);
 * System.out.println(lineNumber2); System.out.println(); doc1.put("document1",
 * lineNumber1); doc1.put("document2", lineNumber1); System.out.println(doc1);
 * System.out.println(doc1); System.out.println(); doc2.put("document3",
 * lineNumber1); doc2.put("document4", lineNumber1); System.out.println(doc2);
 * System.out.println(doc2); System.out.println(); keyword.put("keyword1",
 * doc1); keyword.put("keyword2", doc2); System.out.println(keyword);
 */