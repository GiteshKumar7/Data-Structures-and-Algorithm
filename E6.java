// bellman Ford Algorithm
// Normal ways 
// TC =O(V*E)

import java.util.*;

public class E6 {
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

        graph[1].add(new Edge(1, 2, -4));

        graph[2].add(new Edge(2, 3, 2));

        graph[3].add(new Edge(3, 4, 4));

        graph[4].add(new Edge(4, 1, -1));

    }

    public static void bellmanFord(ArrayList<Edge> graph[], int src) {

        int dist[] = new int[graph.length];
        // infinity val
        for (int i = 0; i < dist.length; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        // relaxing upto N-1
        //TC =O(v*E)
        //algo -> O(V)
        for (int i = 0; i < graph.length - 1; i++) {
               // edges -> O(E)
            for (int j = 0; j < graph.length; j++) {// to get vertices
                for (int k = 0; k < graph[j].size(); k++) { // to get the edges of he vertices
                    Edge e = graph[j].get(k);
                    int u = e.src;
                    int v = e.dest;
                    int w = e.wt;

                    if (dist[u] != Integer.MAX_VALUE && dist[u] + w < dist[v]) {
                        dist[v] = dist[u] + w;
                    }
                }
            }
        }

        // printing the bellman ford algorithm
        for (int i = 0; i < dist.length; i++) {
            System.out.print(dist[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        int src = 0;
        bellmanFord(graph, 0);

    }
}
