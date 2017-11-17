package graphs;

/* In addition to visited vertices we need to keep track of vertices currently 
 * in recursion stack of function for DFS traversal.
 * If we reach a vertex that is already in the recursion stack,
 * then there is a cycle in the tree.*/
public class DirectedGraphCycle {
	static Graph graph = new Graph(4);
	
	
	public static void main(String[] args) {
		graph.addEdgesToDirectedGraph(graph, 0, 1);
		graph.addEdgesToDirectedGraph(graph, 0, 2);
		graph.addEdgesToDirectedGraph(graph, 1, 2);
		graph.addEdgesToDirectedGraph(graph, 2, 0);
		graph.addEdgesToDirectedGraph(graph, 2, 3);
		graph.addEdgesToDirectedGraph(graph, 3, 3);
		
		if (isCyclic()) {
			System.out.println("Graph contains cycle");
		} else {
			System.out.println("Graph doesn't contains cycle");
		}
	}
	
	static boolean isCyclic(){
		boolean visited[] = new boolean[graph.v];
		
		boolean recStack[] = new boolean[graph.v];
		
		for(int v=0; v<graph.v; v++){
			if(cyclicUtil(v,visited,recStack )){
				return true;
			}
			
			
		}
		return false;
	}
	
	static boolean cyclicUtil(int v, boolean[] visited, boolean[] recStack){
		
		if(!visited[v]){
			visited[v]= true;
			recStack[v] = true;
			System.out.print(" "+ v);
			for(Integer p: graph.adjList[v]){
				
				if(!visited[p]  && cyclicUtil(p,visited,recStack)){
					return true;
				}else if(recStack[p]){
					return true;
				}
			}
		}
		recStack[v] = false;
		return false;
	}
	
}
