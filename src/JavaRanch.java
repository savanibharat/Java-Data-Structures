public class JavaRanch {
	public static void main(String[] args){
    
		boolean[] char_set=new boolean[256];
    	
		String str=",,kkll";

		for (int i = 0; i < str. length(); i++) {
    	
			int val = str.charAt(i);
    		
			if (char_set[val]) { // Already found this char in string
    			//return false;
    			System.out.println("str.charAt "+i+" found");
    		}
    		char_set[val] = true;
    	}
    	
	}
}
