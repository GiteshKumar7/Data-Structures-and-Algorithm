//Dijkstra Algorithm
// Shortest path(Distance) from source to destination

import java.util.*;


public class E4 {
    public static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));

    }

    public static class Pair implements Comparable<Pair> {
        int Node;
        int path;

        public Pair(int Node, int path) {
            this.Node = Node;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;// in ascending or sorting
        }
    }

    public static void dijkstraAlgo(ArrayList<Edge> graph[], int src) {
        int dist[]= new int[graph.length];// dist[i]->> src to i
        
        // infinity value assigning to all dist[]
        for(int i=0; i< graph.length; i++){
            if(i!=src){
                dist[i]=Integer.MAX_VALUE;// +infinity
            }
        }

        boolean visited[]= new boolean[graph.length];
        PriorityQueue<Pair>  pq = new PriorityQueue<>();
          pq.add(new Pair(src, 0));

          // loop
          while(!pq.isEmpty()){
            Pair  curr= pq.remove();
             if(!visited[curr.Node]){
                visited[curr.Node]= true;// not vivited then make it visited
                 // for the neighbour
                for(int i=0; i< graph[curr.Node].size(); i++){
                          Edge e=  graph[curr.Node].get(i);
                           int u=e.src;
                           int v=e.dest;
                           int wt =e.wt;

                           if(dist[u] + wt < dist[v]){
                             dist[v]=dist[u]+wt; //update source to v
                              pq.add(new Pair(v, dist[v]));
                            }
                  } 
             }

          }

          // printing alll source to vertices shortest dist
          for(int i=0;i< dist.length; i++){
            System.out.print(dist[i]+" ");
          }
          System.out.println();

    }

    public static void main(String[] args) {

        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        int src = 0;
        dijkstraAlgo(graph,0);

    }
}
