package com.Graph.ShortestPath;

// TODO: Auto-generated Javadoc
/**
 * @author Savani Bharat
 * The Class Graph.
 */
public class Graph {

	/** The max_verts. */
	private final int max_verts=20;
	
	/** The infinity. */
	private final int infinity=100000;
	
	/** The vertex list. */
	private Vertex vertexList[];
	
	/** The adj mat. */
	private int adjMat[][];
	
	/** The n verts. */
	private int nVerts;
	
	/** The n tree. */
	private int nTree;
	
	/** The s path. */
	private DistPar sPath[];
	
	/** The current vert. */
	private int currentVert;
	
	/** The start to current. */
	private int startToCurrent;
	
	/**
	 * Instantiates a new graph.
	 */
	public Graph(){
		
		vertexList=new Vertex[max_verts];
		adjMat=new int[max_verts][max_verts];
		nVerts=0;
		nTree=0;
		for (int i = 0; i < max_verts; i++) {
			for (int j = 0; j < max_verts; j++) {
				adjMat[i][j]=infinity;
			}
		}
		sPath=new DistPar[max_verts];//shortest paths
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
	 * @param end the end
	 * @param weight the weight
	 */
	public void addEdge(int start,int end,int weight){
		
		adjMat[start][end]=weight;
	}
	
	/**
	 * Path.
	 */
	public void path(){
		
		int startTree=0;//start at vertex 0
		vertexList[startTree].isVisited=true;
		nTree=1;//put in tree
		
		//transfer row of distances from adjmat to sPath
		
		for(int j=0;j<nVerts;j++){
			
			int tempDist=adjMat[startTree][j];//{0,1},{0,2},{0,3},{0,4}
			sPath[j]=new DistPar(startTree, tempDist);
		}
		
		while(nTree<nVerts){
			
			int indexMin=getMin();
			int minDist=sPath[indexMin].distance;
			
			if(minDist==infinity){
				
				System.out.println("No reachable vertex");
				break;
			}
			else{
				
				currentVert=indexMin;//reset current vertex to closest vert
				startToCurrent=sPath[indexMin].distance;
				//minimum distance from start tree os to currentVert, and is starttocurrent
			}
			//put current vertex in tree
			vertexList[currentVert].isVisited=true;
			nTree++;
			adjust_sPath();//update sPath[] array
		}
		displayPaths();
		
		nTree=0;
		for (int j = 0; j < nVerts; j++) {
			vertexList[j].isVisited=false;
		}
	}
	
	/**
	 * Gets the min.
	 *
	 * @return the min
	 */
	public int getMin(){
		
		int minDist=infinity;
		int indexMin=0;
		for(int j=1;j<nVerts;j++){
			
			if(!vertexList[j].isVisited && //smaller than old one
										sPath[j].distance<minDist){
				
				minDist=sPath[j].distance;
				indexMin=j;//update minimum
			}
		}
		return indexMin;//return index of minimum
	}
	
	/**
	 * Adjust_s path.
	 */
	public void adjust_sPath(){
		
		//adjust values in shortest path array sPath
		int column=1;//skip starting vertex
		while(column<nVerts){//go across columns
		
			//if this column's vertez already in tree,skip it
			if(vertexList[column].isVisited){
				
				column++;
				continue;
			}
			//calculate distance for one sPath entry
				//get edge from currentVert to column
			int currentToFringe=adjMat[currentVert][column];
			    //add distance from start
			int startToFringe=startToCurrent+currentToFringe;
				//get distance to current sPath entry
			int sPathDist=sPath[column].distance;
			
			//compare distance from start with sPath entry
			if(startToFringe<sPathDist){
				
				sPath[column].parentVert=currentVert;
				sPath[column].distance=startToFringe;
			}
			column++;
		}
	}
	
	/**
	 * Display paths.
	 */
	public void displayPaths(){
		
		for(int j=0;j<nVerts;j++){
			
			System.out.print(vertexList[j].label+" = ");
			if(sPath[j].distance==infinity)
				System.out.print("inf");
			else
				System.out.print(sPath[j].distance);
		char parent=vertexList[sPath[j].parentVert].label;
		System.out.print(" ( "+parent+" ) ");
		System.out.println();
		}
		System.out.println(" ");
	}
}
































