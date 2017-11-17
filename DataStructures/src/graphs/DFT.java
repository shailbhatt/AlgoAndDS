package graphs;

public class DFT {
	static Graph graph = new Graph(4);
	
	public static void main(String[] args) {
		
		graph.addEdgesToDirectedGraph(graph, 0, 1);
		graph.addEdgesToDirectedGraph(graph, 0, 2);
		graph.addEdgesToDirectedGraph(graph, 1, 2);
		graph.addEdgesToDirectedGraph(graph, 2, 0);
		graph.addEdgesToDirectedGraph(graph, 2, 3);
		graph.addEdgesToDirectedGraph(graph, 3, 3);
		System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");
		
		depthFirstTravel(2);
	}
	
	static void depthFirstTravel(int s){
		boolean[] visited = new boolean[graph.v];
		 // starting from all vertices one by one
		
			DFTutil(s,visited);
		
		
		
	}
	
	static void DFTutil(int v, boolean[] visited ){
		visited[v] = true;
		System.out.print(" "+ v);
		

		for(Integer p: graph.adjList[v] ){
			if(!visited[p]){
				visited[p] = true;
				DFTutil(p,visited);
			}
		}
	}
}
