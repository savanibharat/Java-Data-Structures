package com.Graph.PrimsAlgorithm;

class Prim {
	public static void main(String ag[]) {

		int vertex=5;
		boolean select[] = new boolean[vertex];
		
		for (int i = 0; i < vertex; i++)
			select[i] = false;
		
		select[0] = true;

		int cost[][]={	{0,1,3,4,0},
						{1,0,2,5,1},
						{3,2,0,4,0},
						{4,5,4,0,7},
						{0,1,0,7,0}
					};
		
		/*for (int i = 0; i < vertex; i++) {
			
			for (int j = 0; j < vertex; j++)
			
				System.out.print(cost[i][j] + " ");
			
			System.out.println();
		
		}*/
		
		int min = 0, mincost = 0;
		
		for (int i = 0; i < vertex; i++) {
		
			for (int j = 0; j < vertex && i > j; j++) {
				//System.out.println(select[i]+"  "+select[j]);
				if ((select[i] && !select[j]) || (!select[i] && select[j])){
				
					min = cost[i][j];
				}
				if (min > cost[i][j]){
				
					min = cost[i][j];
				}
			}
			mincost += min;
			System.out.println("mincost "+mincost);
		}
		System.out.println("the minimum cost of the graph is " + mincost);
	}
}