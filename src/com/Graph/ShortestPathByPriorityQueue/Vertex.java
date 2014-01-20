package com.Graph.ShortestPathByPriorityQueue;

import java.util.Comparator;
import java.util.LinkedList;

// TODO: Auto-generated Javadoc
/**@author Savani Bharat
 * The Class Vertex.
 */
public class Vertex implements Comparator<Vertex> {
	
	/** The name. */
	public String name;
	
	/** The adjacent d. */
	public LinkedList<Edge> adjacentD;
	
	/** The adjacent t. */
	public LinkedList<Vertex> adjacentT;

	/** The distance. */
	public int distance;
	
	/** The previous. */
	public Vertex previous; // previous vertex on shortest path
	
	/** The known. */
	public boolean known;
	
	/** The default dis. */
	public int defaultDis = Integer.MAX_VALUE;

	/**
	 * The Constructor.
	 */
	public Vertex() {

		name = null;
		distance = defaultDis;
		previous = null;
		known = false;

	}

	/**
	 * The Constructor.
	 *
	 * @param argName the arg name
	 */
	public Vertex(String argName) {

		this.name = argName;
		adjacentD = new LinkedList<Edge>();
		adjacentT = new LinkedList<Vertex>();
		distance = defaultDis;
		previous = null;
		known = false;

	}

	/**
	 * Gets the distance.
	 *
	 * @return the distance
	 */
	public int getDistance() {

		return distance;

	}

	/**
	 * Sets the distance.
	 *
	 * @param w the distance
	 */
	public void setDistance(int w) {

		distance = w;

	}

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Vertex v1, Vertex v2) {

		int w1 = v1.getDistance();
		int w2 = v2.getDistance();

		if (w1 > w2)
			return 1;

		else if (w1 < w2)
			return -1;

		else
			return 0;
	}
}