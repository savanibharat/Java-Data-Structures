package com.HashCode.GeneratingHashCode;

import java.io.BufferedWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

import com.ArrayList.PermutationOfStringRecursive.StringHelper;

/**
 * @author Savani Bharat
 *
 * The Class GenerateHashCode.
 */
public class GenerateHashCode {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		long startTime=System.nanoTime();
		ArrayList<String> manyStrings=StringHelper.PermutationFinder("abcd");//Total execution for abcdefghi 2531934499571

		
		int hashReturned=0;
		int collisionDetected=0;
		int [] arryNum=new int[manyStrings.size()];
		Map <Integer, Integer> result = new HashMap<Integer, Integer>();
		
		try {
   		 
			File file = new File("HashKeys.txt");
			// if file doesnt exists, then create it
			if (!file.exists()) {
				file.createNewFile();
			}
 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			
			//bw.write(i+" "+result.get(i)+"\n");
			for(int i=0;i<manyStrings.size();i++){
				
				hashReturned=hashCode(manyStrings.get(i));
				
				//System.out.println("hashCode for "+ manyStrings.get(i)+" is "+hashReturned);
				arryNum[i]=hashReturned;
				fw.write("hashCode for "+ manyStrings.get(i)+" is "+hashReturned+"\n");
			}
			
			bw.close();
 
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for(int i: arryNum){ //foreach more correct in this case
            if (result.containsKey(i)) {
            	
            	
            	result.put(i, result.get(i)+1);
            	collisionDetected++;

            }
            else result.put(i, 1);
        }
        for ( int i: result.keySet()){
        	//System.out.println(i + ":" + result.get(i));
        	
        	//String s=i+" "+result.get(i);
        	
        	try {
        		 
    			File file = new File("HashKeysHistogram.txt");
    			// if file doesnt exists, then create it
    			if (!file.exists()) {
    				file.createNewFile();
    			}
     
    			FileWriter fw = new FileWriter(file.getAbsoluteFile());
    			BufferedWriter bw = new BufferedWriter(fw);
    			
    			bw.write(i+" "+result.get(i)+"\n");
    			
    			bw.close();
     
    		} catch (IOException e) {
    			e.printStackTrace();
    		}
        }
        long endTime=System.nanoTime();
        System.out.println("Total execution "+(endTime-startTime));
        System.out.println("Total collisins are "+collisionDetected);
	}
	
	/**
	 * Hash code.
	 *
	 * @param key the key
	 * @return the hashVal
	 */
	public static int hashCode(String key){

		
		//insert the hash function here
		int hashVal=0;
		for(int i=0;i<key.length();i++){
			//16908799
			hashVal=(127*hashVal+key.charAt(i)%16908799);/*consider the prime number which does not have common factor with multiplication value
			 												in this case it is 127 and 16,908,799 99,999,989 		*/
			System.out.println(hashVal);
		}
		System.out.println();
		//System.out.println(hashVal);
		return hashVal;
	}
}



/*
 *97
12417
1577058
200286466

98
12543
1593060
202318720

98
12545
1593312
202350724

98
12545
1593315
202351102

97
12418
1577184
200302468

99
12670
1609188
204366976

99
12671
1609314
204382978

99
12671
1609317
204383356

97
12418
1577186
200302720

99
12670
1609190
204367228

99
12673
1609568
204415234

99
12673
1609569
204415360

97
12417
1577059
200286592

98
12543
1593061
202318846

98
12546
1593439
202366852

98
12546
1593441
202367104

97
12419
1577311
200318596

100
12797
1625317
206415358

100
12798
1625443
206431360

100
12798
1625445
206431612

97
12419
1577312
200318722

100
12797
1625318
206415484

100
12799
1625570
206447488

100
12799
1625571
206447614

Total execution 223832588
Total collisins are 0
 
 * 
 * 
 * */
