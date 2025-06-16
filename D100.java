//cycle detection in directed graph

import java.util.ArrayList;

public class D100 {
    public static class Edge {
        int src;
        int dest; 

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;

        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // this is for the directed graph
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 0));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 0));

    }

    public static boolean cycleDetectionInDirectedGraph(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (isCycle(graph, visited, stack, i)) {
                    return true;
                }
            }
        }
         return false;

    }

    public static boolean isCycle(ArrayList<Edge> graph[], boolean visited[], boolean stack[], int curr) {
        visited[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (stack[e.dest]) { // cycle
                return true;
            }

            if (!visited[e.dest] && isCycle(graph, visited, stack, e.dest)) {
                return true;
            }
        }

         stack[curr]= false;// removing from stack
        return false;
    }

    public static void main(String[] args) {

        int v = 4;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        System.out.println(cycleDetectionInDirectedGraph(graph));
    }
}
