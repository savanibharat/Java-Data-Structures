package com.ArrayOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class AAStringHashCode {

	public static void main(String[] args) throws IOException {

		String str = " ";
		BufferedReader br = null;
		BufferedWriter bw=null;
		int negative=0;
		int total=0;
		HashMap<Long, String> hashMap=new HashMap<Long,String>();
		try {
 
			String sCurrentLine;
 
			br = new BufferedReader(new FileReader("US.dic"));
			bw=new BufferedWriter(new FileWriter("USHASH.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				
				//System.out.println(sCurrentLine);
				long hash=hashIt(sCurrentLine);
				if(hash<0){
				
					negative++;
					hash=-hash;
					total++;
				
				}
				hashMap.put(hash,sCurrentLine);
				total++;
				bw.write(sCurrentLine+" "+hash+"\n");
			}
			for(Long l:hashMap.keySet())
			{
				if(l<0)
					System.out.println("L is "+l);
				
			}
			
			System.out.println("total instance are "+total);
			System.out.println(negative);
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			
			br.close();
			bw.close();
			
		}
		
	}

	public static long hashIt(String str) {
		long hash=0;
		long h = hash;
		char[] value=str.toCharArray();
		if (h == 0 && value.length > 0) {
			char val[] = value;

			for (int i = 0; i < value.length; i++) {
				h =  31* h + val[i];
			}
			hash = h;
		}
		return hash;
	}
}