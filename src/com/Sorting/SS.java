package com.Sorting;

class SS{
	
	public static void main(String args[]){
		
			int list[]={9,8,7,6,5,4,3,2,1};
			int index,i,j, smallNumber;
			
			for(i=0;i<list.length;i++){
				System.out.print(list[i]+" ");
			}
			System.out.println();
			for(i=0;i<list.length-1;i++){
				
				index=i;
				for(j=i+1;j<list.length;j++){
					if(list[j]<list[index])
						index=j;
				}
				smallNumber=list[index];
				list[index]=list[i];
				list[i]=smallNumber;
				
				for(int k=0;k<list.length;k++)
					System.out.print(list[k]+" ");
				System.out.println();
			}
			
	}
}