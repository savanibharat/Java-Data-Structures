package com.Graph.BreadthFirstSearch;

// TODO: Auto-generated Javadoc
/**
 * The Class Vertex.
 *
 * @author Savani Bharat
 */
public class Vertex {

	/** The label. */
	public char label;
	
	/** The was visited. */
	public boolean wasVisited;
	
	/**
	 * Instantiates a new vertex.
	 *
	 * @param label the label
	 */
	public Vertex(char label){
		
		this.label=label;
		wasVisited=false;
		
	}
}
