package graphs;

import java.util.Iterator;

/*An undirected graph has a cycle if and only if a depth-first search (DFS) 
 * finds an edge that points to an already-visited vertex (a back edge).*/

public class UndirectedGraphCycle {
	static Graph graph = new Graph(5);

	public static void main(String[] args) {

		graph.addEdgesToUndirectedGraph(graph, 1, 0);
		graph.addEdgesToUndirectedGraph(graph, 0, 2);
		graph.addEdgesToUndirectedGraph(graph, 2, 0);
		graph.addEdgesToUndirectedGraph(graph, 0, 3);
		graph.addEdgesToUndirectedGraph(graph, 3, 4);
		System.out.println("Following is Depth First Traversal ");

		if (isCyclic()) {
			System.out.println("\n");
			System.out.println("Graph contains cycle");
		} else {
			System.out.println("\n");
			System.out.println("Graph doesn't contains cycle");
		}

	}

	// A recursive function that uses visited[] and parent to detect
	// cycle in subgraph reachable from vertex v.
	static Boolean isCyclicUtil(int v, Boolean visited[], int parent) {
		// Mark the current node as visited
		visited[v] = true;
		Integer i;

		// Recur for all the vertices adjacent to this vertex
		Iterator<Integer> it = graph.adjList[v].iterator();
		while (it.hasNext()) {
			i = it.next();

			// If an adjacent is not visited, then recur for that
			// adjacent
			if (!visited[i]) {
				if (isCyclicUtil(i, visited, v))
					return true;
			}

			// If an adjacent is visited and not parent of current
			// vertex, then there is a cycle.
			else if (i != parent)
				return true;
		}
		return false;
	}

	// Returns true if the graph contains a cycle, else false.
	static Boolean isCyclic() {
		// Mark all the vertices as not visited and not part of
		// recursion stack
		Boolean visited[] = new Boolean[graph.v];

		// Call the recursive helper function to detect cycle in
		// different DFS trees
		for (int u = 0; u < graph.v; u++)
			if (!visited[u]) // Don't recur for u if already visited
				if (isCyclicUtil(u, visited, -1))
					return true;

		return false;
	}

}
