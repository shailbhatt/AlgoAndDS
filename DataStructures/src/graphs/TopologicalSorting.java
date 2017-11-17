package graphs;

import java.util.Stack;

public class TopologicalSorting {

	static Graph graph = new Graph(6);

	public static void main(String[] args) {
		graph.addEdgesToDirectedGraph(graph, 5, 2);
		graph.addEdgesToDirectedGraph(graph, 5, 0);
		graph.addEdgesToDirectedGraph(graph, 4, 0);
		graph.addEdgesToDirectedGraph(graph, 4, 1);
		graph.addEdgesToDirectedGraph(graph, 2, 3);
		graph.addEdgesToDirectedGraph(graph, 3, 1);
		

        System.out.println("Following is a Topological sort of the given graph");
        
        topologicalSort();
	}
	
	
	static void topologicalSort(){
		boolean visited[]= new boolean[graph.v];
		
		Stack stack = new Stack();
		
		for(int v= 0 ; v<graph.v;v++){
			if(!visited[v]){
				topologicalUtil(v, visited,stack);
			}
		}
		
		// Print contents of stack
        while (!stack.empty()){
        	System.out.print(stack.pop() + " ");
        }
            
	}


	private static void topologicalUtil(int v, boolean[] visited, Stack stack) {
		visited[v] =  true;
		
		for(Integer p: graph.adjList[v]){
			if(!visited[p]){
				topologicalUtil(p, visited,stack);
			}
		}
		// Push current vertex to stack which stores result
		stack.push(new Integer(v));
	}
}
