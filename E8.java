//minimum spanning tree;
import java.util.*;

public class E8 {
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

    public static void createGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Undirected edges
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

    static class Pair implements Comparable<Pair> {
        int vertex;
        int cost;

        public Pair(int v, int c) {
            this.vertex = v;
            this.cost = c;
        }

        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    static int spanningTree(int V, int E, List<List<int[]>> adj) {
        boolean[] visited = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0, 0));
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();

            if (!visited[curr.vertex]) {
                visited[curr.vertex] = true;
                finalCost += curr.cost;

                for (int[] neighbor : adj.get(curr.vertex)) {
                    int nextVertex = neighbor[0];
                    int edgeWeight = neighbor[1];

                    if (!visited[nextVertex]) {
                        pq.add(new Pair(nextVertex, edgeWeight));
                    }
                }
            }
        }

        return finalCost;
    }

    // Helper function to convert from Edge[] to adj List<List<int[]>>
    public static List<List<int[]>> convertToAdjList(ArrayList<Edge>[] graph, int V) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (Edge e : graph[i]) {
                adj.get(i).add(new int[]{e.dest, e.wt});
            }
        }
        return adj;
    }

    public static void main(String[] args) {
        int V = 4;
        int E = 5;
        ArrayList<Edge>[] graph = new ArrayList[V];
        createGraph(graph);

        List<List<int[]>> adj = convertToAdjList(graph, V);

        int mstCost = spanningTree(V, E, adj);
        System.out.println("Total cost of MST: " + mstCost);
    }
}
