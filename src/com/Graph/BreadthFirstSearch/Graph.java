package com.Graph.BreadthFirstSearch;

// TODO: Auto-generated Javadoc
/**
 * The Class Graph.
 */
public class Graph {

	/** The max verts. */
	private final int MAX_VERTS=20;
	
	/** The vertex list. */
	private Vertex vertexList[];
	
	/** The adj mat. */
	private int adjMat[][];
	
	/** The n verts. */
	private int nVerts;
	
	/** The queue. */
	private Queue theQueue;
	
	/**
	 * Instantiates a new graph.
	 */
	public Graph(){
		
		vertexList=new Vertex[MAX_VERTS];
		nVerts=0;
		adjMat=new int[MAX_VERTS][MAX_VERTS];
		for (int i = 0; i < MAX_VERTS; i++) 
			for (int j = 0; j < MAX_VERTS; j++) 
				adjMat[i][j]=0;
		
		theQueue=new Queue();
	}
	
	/**
	 * Adds the vertex.
	 *
	 * @param lab the lab
	 */
	public void addVertex(char lab){
		
		vertexList[nVerts++]=new Vertex(lab);
		
	}
	
	/**
	 * Adds the edge.
	 *
	 * @param start the start
	 * @param stop the stop
	 */
	public void addEdge(int start,int stop){
		
		adjMat[start][stop]=1;
		adjMat[stop][start]=1;
		
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
	 * Bfs.
	 */
	public void bfs(){
		
		vertexList[0].wasVisited=true;
		displayVertex(0);
		theQueue.insert(0);
		
		int v2;
		
		while(!theQueue.isEmpty()){
			
			int v1=theQueue.remove();//remove vertex at head
			//until it has no unvisited neighbors
			
			while((v2=getAdjUnvisitedVertex(v1))!=-1){
				
				vertexList[v2].wasVisited=true;
				displayVertex(v2);
				theQueue.insert(v2);
			}
		}
		for (int j = 0; j < nVerts; j++) {//reset flag;
			vertexList[j].wasVisited=false;
		}
		
	}
	
	/**
	 * Gets the adj unvisited vertex.
	 *
	 * @param v the v
	 * @return the adj unvisited vertex
	 */
	public int getAdjUnvisitedVertex(int v){
		
		for (int j = 0; j < nVerts; j++) 
			if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
				return j;
		return -1;
		
	}
	
}