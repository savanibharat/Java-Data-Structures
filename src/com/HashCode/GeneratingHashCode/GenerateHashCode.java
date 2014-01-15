package com.HashCode.GeneratingHashCode;

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
		
		/*String key="Bharat";
		int hashReturned=hashCode(key);
		System.out.println("  "+hashReturned);
		
		key="Bharat ";
		hashReturned=hashCode(key);
		System.out.println("  "+hashReturned);
		
		key="Bha rat";
		hashReturned=hashCode(key);
		System.out.println("  "+hashReturned);*/
				
		String[] manyStrings={"apt","tap","pat","aaa","aab","aac"};
		for(int i=0;i<manyStrings.length;i++){
			
			int hashReturned=hashCode(manyStrings[i]);
			System.out.println("hashCode for "+ manyStrings[i]+" is "+hashReturned);
		}
	}
	
	/**
	 * Hash code.
	 *
	 * @param key the key
	 * @return the hashVal
	 */
	public static int hashCode(String key){
		
		int hashVal=0;
		for(int i=0;i<key.length();i++){
			
			hashVal=(127*hashVal+key.charAt(i))%16908799;/*consider the prime number which does not have common factor with multiplication value
			 												in this case it is 127 and 16908799		*/
		}
		return hashVal;
	}
}
