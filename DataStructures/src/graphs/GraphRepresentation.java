package graphs;

public class GraphRepresentation {
	
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdgesToUndirectedGraph(graph, 1 , 2);
		graph.addEdgesToDirectedGraph(graph, 1, 3);
		graph.addEdgesToDirectedGraph(graph, 2, 3);
		graph.addEdgesToDirectedGraph(graph, 2, 4);
		graph.addEdgesToDirectedGraph(graph, 3, 4);
		
		
		graph.printGraph(graph);
		
	}

}


