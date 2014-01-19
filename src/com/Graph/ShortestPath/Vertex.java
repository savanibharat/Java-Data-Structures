package com.Graph.ShortestPath;

// TODO: Auto-generated Javadoc
/**
 * @author Savani Bharat
 * The Class Vertex.
 */
public class Vertex {
	
	/** The label. */
	public char label;
	
	/** The is visited. */
	public boolean isVisited;
	
	/**
	 * Instantiates a new vertex.
	 *
	 * @param lab the lab
	 */
	public Vertex(char lab){
		
		label=lab;
		isVisited=false;
	}
}
