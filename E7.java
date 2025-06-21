//MST
// Minimum spanning tree
// prim's algorithm  using priority Queue(Min heap)

import java.util.*;

public class E7 {
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

        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));

        graph[1].add(new Edge(1, 0, 10));
        graph[1].add(new Edge(1, 3, 40));

        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));

        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));

    }

    public static class pair implements Comparable<pair> {
        int vertices;
        int cost;
        int parent;

        public pair(int v, int c, int p) {
            this.vertices = v;
            this.cost = c;
            this.parent=p;
        }

        @Override
        public int compareTo(pair p2) {
            return this.cost - p2.cost;// in ascending order
        }
    }

    public static void primAlgo(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        PriorityQueue<pair> pq = new PriorityQueue<>();// (min heap)

        // ading the initial vertices and its cost
        pq.add(new pair(0, 0,-1));


        // for storing edges
        ArrayList<Edge> mstEdge= new ArrayList<>();
        int finalCost = 0;// mst cost / toatl min weight

        while (!pq.isEmpty()) {
            pair curr = pq.remove();
            if (!visited[curr.vertices]) {
                visited[curr.vertices] = true;
                finalCost += curr.cost;// minimum cost

                // Add edge to MST if it's not the starting node
                if (curr.parent != -1) { 
                    mstEdge.add(new Edge(curr.parent, curr.vertices, curr.cost));
                }

                // finding all the neighbour of current vertices
                for (int i = 0; i < graph[curr.vertices].size(); i++) {
                     Edge e = graph[curr.vertices].get(i);
                      pq.add(new pair(e.dest, e.wt,curr.vertices));
                }
            }

        }

        // printing the cost
      System.out.println("Edges in MST");
     for(Edge e: mstEdge){
       System.out.println(e.src + "--->" +e.dest  +" = " + e.wt);
      }
      System.out.println("total Mst cost for prim's algo:  "+ finalCost);


    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> graph[] = new ArrayList[V];

        createGraph(graph);

         primAlgo(graph);
      
    }
}
