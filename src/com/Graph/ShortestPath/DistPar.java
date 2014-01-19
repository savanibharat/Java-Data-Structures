package com.Graph.ShortestPath;

// TODO: Auto-generated Javadoc
/**
 * @author Savani Bharat
 * The Class DistPar.
 */
public class DistPar {

	/** The distance. */
	public int distance;
	
	/** The parent vert. */
	public int parentVert;
	
	/**
	 * Instantiates a new dist par.
	 *
	 * @param pv the pv
	 * @param d the d
	 */
	public DistPar(int pv,int d){
		
		distance=d;
		parentVert=pv;
	}
}
