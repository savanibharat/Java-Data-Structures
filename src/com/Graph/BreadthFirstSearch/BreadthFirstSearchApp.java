package com.Graph.BreadthFirstSearch;

// TODO: Auto-generated Javadoc
/**
 * The Class BreadthFirstSearchApp.
 */
public class BreadthFirstSearchApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Graph theGraph=new Graph();
		theGraph.addVertex('A');
		theGraph.addVertex('B');
		theGraph.addVertex('C');
		theGraph.addVertex('D');
		theGraph.addVertex('E');
		
		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);
		System.out.println();
		theGraph.bfs();
	}
}
