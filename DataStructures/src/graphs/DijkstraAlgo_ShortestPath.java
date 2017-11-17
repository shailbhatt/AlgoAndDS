package graphs;

/*find shortest paths in directed acyclic graphs (DAGs) 
 * using topological sort, and in graphs without negative
 *  edges using Dijkstra's algorithm.*/
public class DijkstraAlgo_ShortestPath {
	static int graph[][];
	public static void main(String[] args) {
		 graph = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
				             {4, 0, 8, 0, 0, 0, 0, 11, 0},
				             {0, 8, 0, 7, 0, 4, 0, 0, 2},
				             {0, 0, 7, 0, 9, 14, 0, 0, 0},
				             {0, 0, 0, 9, 0, 10, 0, 0, 0},
				             {0, 0, 4, 14, 10, 0, 2, 0, 0},
				             {0, 0, 0, 0, 0, 2, 0, 1, 6},
				             {8, 11, 0, 0, 0, 0, 1, 0, 7},
				             {0, 0, 2, 0, 0, 0, 6, 7, 0}};

        dijkstra(0);
	}

	private static void dijkstra(int src) {
		int V = graph.length; // no of vertices in graph
		int parent[] = new int[V]; // store shortest path vertices
		
		boolean sptSet[] = new boolean[V]; //sptSet[i] == true -> i vertex is included in shortest path tree
		
		int dis[] = new int[V];
		
		for(int i=0;i<V;i++){
			dis[i] = Integer.MAX_VALUE;
		}
		
		dis[src] = 0;
		
		for(int count=0; count<V-1; count++){
			int u = minDistance(dis, sptSet); // EXTRACT_MIN
			
			sptSet[u] = true; // Mark the picked vertex as processed
			
			//RELAXATION
			for(int v= 0; v<V;v++){
				if(!sptSet[v] && graph[u][v] != 0 && graph[u][v] != Integer.MAX_VALUE && dis[v] > dis[u] + graph[u][v]){
					parent[v] = u;
					dis[v] = dis[u] + graph[u][v];
				}
			}
		}
		
		printShortestPath(dis,V,parent);
	}

	private static void printShortestPath(int[] dis, int v, int[] parent) {
			for(int i = 1 ; i<v;i++){
//				System.out.println(dis[i]+ " ");
				
				printPath(parent, i);
				System.out.println("\n");
			}
	}
	
	static void printPath(int parent[], int j)
	{
	    // Base Case : If j is source
	    if (parent[j]==0)
	        return;

	    printPath(parent, parent[j]);

//	    System.out.print(j + " ");
	}

	private static int minDistance(int[] dis, boolean[] sptSet) {
		
		int min = Integer.MAX_VALUE, min_index = -1;
		
		for(int v=0; v<graph.length; v++){
			if(!sptSet[v] && dis[v]<= min){
				min = dis[v];
				min_index = v;
			}
		}
		return min_index;
	}

}
