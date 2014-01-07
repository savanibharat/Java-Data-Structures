package com.Graph.MinimumSpanningTree;

// TODO: Auto-generated Javadoc
//TODO: Auto-generated Javadoc
/**
* The Class Graph.
*
* @author Savani Bharat
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
	
	/** The stack. */
	private StackX theStack;
	
	/**
	 * Instantiates a new graph.
	 */
	public Graph(){
		
		vertexList=new Vertex[MAX_VERTS];
		adjMat=new int[MAX_VERTS][MAX_VERTS];
		nVerts=0;
		
		for (int j = 0; j < MAX_VERTS; j++) 
			for (int k = 0; k < MAX_VERTS; k++)
				adjMat[j][k]=0;
		
		theStack=new StackX();
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
		
		adjMat[start][end]=1;
		adjMat[end][start]=1;
		
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
	 * Gets the adj unvisited vertex.
	 *
	 * @param v the v
	 * @return the adj unvisited vertex
	 */
	public int getAdjUnvisitedVertex(int v){//returns unvisited vertex adjacent to v
		
		for (int j = 0; j < nVerts; j++) 
			if(adjMat[v][j]==1 && vertexList[j].wasVisited==false)
				return j;
		return -1;
	}
	
	/**
	 * Minimum Spanning tree.
	 */
	public void minimumSpanningTree(){
	
		vertexList[0].wasVisited=true;
		theStack.push(0);
		
		while(!theStack.isEmpty()){
			
			int currentVertex=theStack.peek();
			//get next unvisited neighbor
			int v=getAdjUnvisitedVertex(currentVertex);
			if(v==-1)
				theStack.pop();
			else
			{
				
				vertexList[v].wasVisited=true;
				theStack.push(v);
				
				displayVertex(currentVertex);
				displayVertex(v);
				System.out.println(" ");
			}
		}
			for (int i = 0; i < nVerts; i++) {
				
				vertexList[i].wasVisited=false;
			}
	}
}