package graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFT {
	
	public static void main(String[] args) {
		Graph graph = new Graph(4);
		graph.addEdgesToDirectedGraph(graph, 0, 1);
		graph.addEdgesToDirectedGraph(graph, 0, 2);
		graph.addEdgesToDirectedGraph(graph, 1, 2);
		graph.addEdgesToDirectedGraph(graph, 1, 2);
		graph.addEdgesToDirectedGraph(graph, 2, 0);
		graph.addEdgesToDirectedGraph(graph, 2, 3);
		graph.addEdgesToDirectedGraph(graph, 3, 3);
		
		breathFirstTraversal(graph,2);
	}
	
	
	static void breathFirstTraversal(Graph g,int sourceV){
		boolean visited[] = new boolean[g.v];
		
		LinkedList<Integer> queue = new LinkedList();
		
		visited[sourceV] = true;
		queue.add(sourceV);
		
		while(queue.size()>0){
			
			sourceV = queue.poll();
			System.out.print(sourceV+ " "); 
			
			Iterator<Integer> i= g.adjList[sourceV].listIterator();
			
			while(i.hasNext()){
				int n = i.next();
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

}
