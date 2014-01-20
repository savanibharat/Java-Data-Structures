package com.Graph.ShortestPathByPriorityQueue;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

// TODO: Auto-generated Javadoc
/**@author Savani Bharat
 * The Class Main.
 */
public class Main {
	
	/**
	 * The main method.
	 *com/Graph/ShortestPathByPriorityQueue/
	 * @param args the args
	 * @throws FileNotFoundException the file not found exception
	 */
	public static void main(String[] args) throws FileNotFoundException {
		String initial = null;
		Graph graph = new Graph();
		String current;
		Scanner input = new Scanner(new BufferedReader(new FileReader(
				"C:\\Users\\Savani Bharat\\Documents\\workspace-sts-3.3.0.RELEASE\\Java-Data-Structures\\src\\com\\Graph\\ShortestPathByPriorityQueue\\Input.txt")));

		while (input.hasNext()) {

			current = input.next();
			System.out.println(current);
			if (current.equals("-1")) {

				break;

			}
			String source = current;
			String dest = input.next();
			int weight = Integer.parseInt(input.next());
			graph.addVertex(source, dest, weight);

		}
		initial = input.next();
		System.out.println("Dijkstra's Algorithm");
		graph.dijkstra(initial);
	}
}