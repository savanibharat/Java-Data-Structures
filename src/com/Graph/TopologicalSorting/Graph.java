package com.Graph.TopologicalSorting;

// TODO: Auto-generated Javadoc
/**
 * The Class Graph.
 */
public class Graph {

	/** The max verts. */
	private final int MAX_VERTS=20;
	
	/** The n verts. */
	private int nVerts;
	
	/** The adj mat. */
	private int adjMat[][];
	
	/** The vertex list. */
	private Vertex vertexList[];
	
	/** The sorted array. */
	private char sortedArray[];
	
	/**
	 * Instantiates a new graph.
	 */
	public Graph(){
		
		vertexList=new Vertex[MAX_VERTS];
		nVerts=0;
		adjMat=new int[MAX_VERTS][MAX_VERTS];
		for (int i = 0; i <MAX_VERTS; i++) 
			for (int j = 0; j < MAX_VERTS; j++) 
				adjMat[i][j]=0;
		
		sortedArray=new char[MAX_VERTS];
	}
	
	/**
	 * Adds the vertex.
	 *
	 * @param label the label
	 */
	public void addVertex(char label){
		
		vertexList[nVerts++]=new Vertex(label);
		
	}
	
	/**
	 * Adds the edge.
	 *
	 * @param start the start
	 * @param end the end
	 */
	public void addEdge(int start,int end){
		
		adjMat[start][end]=1; //topological sorting works on Directed, Acylic Graph (DAG)
		
	}
	
	/**
	 * Display vertex.
	 *
	 * @param v the v
	 */
	public void displayVertex(int v){
		
		System.out.println(vertexList[v].label);
		
	}
	
	/**
	 * Topological sort.
	 */
	public void topologicalSort(){
		
		int orig_nVerts=nVerts;
		while(nVerts>0){
			
			//get a vertex with no successors or -1
			int currentVertex=noSuccessors();
			if(currentVertex==-1){
				
				System.out.println("ERROR: graph has cycles");
				return;
			}
			//insert vertex label in sorted array (start at end)
			sortedArray[nVerts-1]=vertexList[currentVertex].label;
			
			deleteVertex(currentVertex);
		}
		System.out.println("Topologically sorted order");
		for (int i = 0; i < orig_nVerts; i++) {
			
			System.out.print(sortedArray[i]);
			
		}
		System.out.println();
	}
	
	/**
	 * No successors.
	 *
	 * @return the int
	 */
	public int noSuccessors(){
		
		boolean isEdge;
		for(int row=0;row<nVerts;row++){
			
			isEdge=false;
			for (int col = 0; col < nVerts; col++) {
				
				if(adjMat[row][col]>0){	//is there is edge
					
					isEdge=true;		//yes, there is edge
					break;				
					
				}
				
			}
			if(!isEdge)					//it doesnot have edge
				return row;				
			
		}
		return -1;	//no such vertex
	}
	
	/**
	 * Delete vertex.
	 *
	 * @param delVertex the del vertex
	 */
	public void deleteVertex(int delVertex){
		
		if(delVertex!=nVerts-1){//if not last vertex
			for(int j=delVertex;j<nVerts-1;j++)//delete from vertex list
				vertexList[j]=vertexList[j+1];
		
		for(int row=delVertex;row<nVerts-1;row++)//delete row from adjMat
			moveRowUp(row,nVerts);
		
		for(int col=delVertex;col<nVerts-1;col++)//delete col from adjMat
			moveColLeft(col,nVerts-1);
		}
		nVerts--;
	}
	
	/**
	 * Move row up.
	 *
	 * @param row the row
	 * @param length the length
	 */
	private void moveRowUp(int row,int length){
		
		for(int col=0;col<length;col++)
			adjMat[row][col]=adjMat[row+1][col];
		
	}
	
	/**
	 * Move col left.
	 *
	 * @param col the col
	 * @param length the length
	 */
	private void moveColLeft(int col,int length){
		
		for(int row=0;row<length;row++)
			adjMat[row][col]=adjMat[row][col+1];
	}
}