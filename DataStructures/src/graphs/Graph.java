package graphs;

import java.util.LinkedList;

public class Graph {

	int v;
	public LinkedList<Integer> adjList[];
	
	Graph(int v){
		this.v = v;
		
		adjList = new LinkedList[v];
		
		for(int i=0;i<v;i++){
			adjList[i] = new LinkedList();
		}
	}
	
	static void addEdgesToUndirectedGraph(Graph g, int src, int dest){
		// Add an edge from src to dest. 
        g.adjList[src].addFirst(dest);
        
        g.adjList[dest].addFirst(src);
	}
	
	static void addEdgesToDirectedGraph(Graph g, int src, int dest){
		g.adjList[src].addFirst(dest);
	}
	
	static void printGraph(Graph g){
		for(int i=0;i<g.v;i++){
			System.out.println("Adjacency list of vertex "+ i);
            System.out.print("head");
            for(Integer head : g.adjList[i]){
            	System.out.print("->"+ head);
            }
            System.out.println("\n");
		}
	}
}
