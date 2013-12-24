package com.ArrayOperations;

public class InsertInSortedOrder {

	private int nElements;
	private int[] a;
	public InsertInSortedOrder(int max){
		
		a=new int[max];
		nElements=0;
		
	}
	
	public void insertInOrder(int value){
		
		int i;
		for (i = 0; i < nElements; i++) {
			if(a[i]>value)
				break;
		}
		for(int k=nElements;k>i;k--){
			
			a[k]=a[k-1];
			
		}
		a[i]=value;
		nElements++;
		
	}
	
	public void display(){
		
		for (int i = 0; i < nElements; i++) {
			
			System.out.println(a[i]);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		InsertInSortedOrder insertInSortedOrder=new InsertInSortedOrder(10);
		insertInSortedOrder.insertInOrder(10);
		insertInSortedOrder.insertInOrder(9);
		insertInSortedOrder.display();
	}
}
