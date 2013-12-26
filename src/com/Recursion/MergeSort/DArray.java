package com.Recursion.MergeSort;

public class DArray {
	
	private int[] theArray;
	private int nElements;
	
	public DArray(int max){
		
		theArray=new int[max];
		nElements=0;
		
	}
	public void insert(int value){
		
		theArray[nElements]=value;
		nElements++;
		
	}
	public void display(){
		
		for (int i = 0; i < nElements; i++) {
			
			System.out.print(theArray[i]+" ");
			
		}
		System.out.println();
		
	}
	public void mergeSort(){
		
		int[] workSpace=new int[nElements];
		recMergeSort(workSpace,0,nElements-1);
		
	}
	private void recMergeSort(int[] workSpace,int lowerBound, int upperBound){
		
		if(lowerBound==upperBound)
			return;
		else{
			
			int mid=(lowerBound+upperBound)/2;
			
			recMergeSort(workSpace, lowerBound, mid);
			recMergeSort(workSpace, mid+1, upperBound);
			merge(workSpace,lowerBound,mid+1,upperBound);
			
		}
	}
	private void merge(int[] workSpace,int lowPtr,int highPtr,int upperBound){
		
		int j=0;
		int lowerBound=lowPtr;
		int mid=highPtr-1;
		int n=upperBound-lowerBound+1;
		
		while(lowPtr<=mid && highPtr<=upperBound)
			if(theArray[lowPtr]<theArray[highPtr])
				workSpace[j++]=theArray[lowPtr++];
			else
				workSpace[j++]=theArray[highPtr++];
		
		while(lowPtr<=mid)
			workSpace[j++]=theArray[lowPtr++];
		while(highPtr<=upperBound)
			workSpace[j++]=theArray[highPtr++];
		
		
		for (j = 0; j < n; j++) {
			theArray[lowerBound+j]=workSpace[j];
		}
	}
}





















