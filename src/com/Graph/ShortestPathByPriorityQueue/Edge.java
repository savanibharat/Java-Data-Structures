package com.Graph.ShortestPathByPriorityQueue;

// TODO: Auto-generated Javadoc
/**@author Savani Bharat
 * The Class Edge.
 */
public class Edge {
	
	/** The destination. */
	public Vertex destination;
	
	/** The weight. */
	public int weight;

	/**
	 * The Constructor.
	 */
	public Edge() {
		destination = null;
		weight = 1;
	}

	/**
	 * The Constructor.
	 *
	 * @param d the d
	 * @param w the w
	 */
	public Edge(Vertex d, int w) {
		destination = d;
		weight = w;
	}

	/**
	 * Gets the weight.
	 *
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public Vertex getDestination() {
		return destination;
	}
}
