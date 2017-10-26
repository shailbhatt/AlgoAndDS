package demo;

//Java program to print BFS traversal from a given source vertex.
//BFS(int s) traverses vertices reachable from s.
import java.io.*;
import java.util.*;

//This class represents a directed graph using adjacency list
//representation
class Graph
{
 private int V;   // No. of vertices
 private LinkedList<Integer> adj[]; //Adjacency Lists

 // Constructor
 Graph(int v)
 {
     V = v;
     adj = new LinkedList[v];
     for (int i=0; i<v; ++i)
         adj[i] = new LinkedList();
 }

 // Function to add an edge into the graph
 void addEdge(int v,int w)
 {
     adj[v].add(w);
 }

 // prints BFS traversal from a given source s
 void BFS(int s)
 {
     // Mark all the vertices as not visited(By default
     // set as false)
     boolean visited[] = new boolean[V];

     // Create a queue for BFS
     LinkedList<Integer> queue = new LinkedList<Integer>();

     // Mark the current node as visited and enqueue it
     visited[s]=true;
     queue.add(s);

     while (queue.size() != 0)
     {
         // Dequeue a vertex from queue and print it
         s = queue.poll();
         System.out.print(s+" ");

         // Get all adjacent vertices of the dequeued vertex s
         // If a adjacent has not been visited, then mark it
         // visited and enqueue it
         Iterator<Integer> i = adj[s].listIterator();
         while (i.hasNext())
         {
             int n = i.next();
             if (!visited[n])
             {
                 visited[n] = true;
                 queue.add(n);
             }
         }
     }
 }

 // Driver method to
 public static void main(String args[])
 {
	 
	 Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     int [][] arr= new int[N][];
     
     sc.nextLine();
//     for(int i=0;i<N;i++){
//    	 String str = sc.nextLine();
// 		String[] splitStr = str.trim().split("\\s");
//    	for(int j=0;j<2;j++){
//    		arr[i][j]=Integer.parseInt(splitStr[j]);
//    		System.out.println(arr[i][j]);
//    	}
//     }
    
     int x=0;
     while (sc.hasNextLine()) {
    	   for (int j = 0; j < 2; j++) {
    	      arr[x][j] = sc.nextInt();
    	      System.out.println(arr[x][j]);
    	   }
    	   x++;
    	}

     sc.close();
     
     
     Graph g = new Graph(4);

     g.addEdge(0, 1);
     g.addEdge(0, 2);
     g.addEdge(1, 2);
     g.addEdge(2, 0);
     g.addEdge(2, 3);
     g.addEdge(3, 3);

//     System.out.println("Following is Breadth First Traversal "+
//                        "(starting from vertex 2)");
//
//     g.BFS(2);
 }
}