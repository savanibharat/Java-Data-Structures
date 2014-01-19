package com.Graph.ShortestPath;

// TODO: Auto-generated Javadoc
/**
 * @author Savani Bharat
 * The Class PathApp.
 */
public class PathApp {

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
		
		
		theGraph.addEdge(0, 1, 50);//AB 50
		theGraph.addEdge(0, 3, 80);//AD 80
		theGraph.addEdge(1, 2, 60);//BC 60
		theGraph.addEdge(1, 3, 90);//BD 90
		theGraph.addEdge(2, 4, 40);//CE 40
		theGraph.addEdge(3, 2, 20);//DC 20
		theGraph.addEdge(3, 4, 70);//DE 70
		theGraph.addEdge(4, 1, 50);//EB 50

		System.out.println("shortest paths");
		theGraph.path();System.out.println();
		
	}
}
/*
 * shortest paths
A = inf ( A ) 
B = 50 ( A ) 
C = 100 ( D ) 
D = 80 ( A ) 
E = 140 ( C ) 
 * 
 * */