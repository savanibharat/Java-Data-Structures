package com.ArrayOperations;


public class AReplaceEachNodeWithSUmOfAllGreaterNode {

}
/**
 * public void sumofAllGreater(){
		
		sumofallgreater(root);
		
	}
	public void sumofallgreater(Node root)
    {
        if(root==null)
            return;
        sumofallgreater(root.rightChild);
        
        sum+=root.iData;
        System.out.println("root.idata is "+root.iData);
        System.out.println("sum is "+sum);
        root.iData=sum-root.iData;
        System.out.println("root.iData=sum-root.iData :: new root.idata is "+root.iData);
        System.out.println();
        sumofallgreater(root.leftChild);
        
    }
    
     { 1 } 
 { 3 } 
 { 5 } 
 { 7 } 
 { 10 } 
 { 14 } 
 { 15 } 
 { 16 } 

root.idata is 16
sum is 16
root.iData=sum-root.iData :: new root.idata is 0

root.idata is 15
sum is 31
root.iData=sum-root.iData :: new root.idata is 16

root.idata is 14
sum is 45
root.iData=sum-root.iData :: new root.idata is 31

root.idata is 10
sum is 55
root.iData=sum-root.iData :: new root.idata is 45

root.idata is 7
sum is 62
root.iData=sum-root.iData :: new root.idata is 55

root.idata is 5
sum is 67
root.iData=sum-root.iData :: new root.idata is 62

root.idata is 3
sum is 70
root.iData=sum-root.iData :: new root.idata is 67

root.idata is 1
sum is 71
root.iData=sum-root.iData :: new root.idata is 70

 { 70 } 
 { 67 } 
 { 62 } 
 { 55 } 
 { 45 } 
 { 31 } 
 { 16 } 
 { 0 } 

    -----------------------------------------------------------------------
     { 1 } 
 { 5 } 
 { 6 } 
found
 { 1 } 
 { 5 } 
 { 6 } 

root.idata is 6
sum is 6
root.iData=sum-root.iData :: new root.idata is 0

root.idata is 5
sum is 11
root.iData=sum-root.iData :: new root.idata is 6

root.idata is 1
sum is 12
root.iData=sum-root.iData :: new root.idata is 11

 { 11 } 
 { 6 } 
 { 0 } 

 * 
 * */
