// Cycle detection in undirected graph
//Tc ---> O(V+E)

import java.util.*;

public class D97 {

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

        graph[0].add(new Edge(0, 1));
         graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

         graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));
    }

    // use for connected Compnents also
    public static boolean DetectCycle(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                if (DetectCycleUtil(graph, visited, i, -1)) {
                    return true; // cycle exist in one of the parts
                }
            }
        }
        return false;
    }

    public static boolean DetectCycleUtil(ArrayList<Edge> graph[], boolean visited[], int src, int par) {
        visited[src] = true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);

            // case 1;
            if (!visited[e.dest]) {
                if (DetectCycleUtil(graph, visited, e.dest, src)) {
                    return true;
                }
            } else if (visited[e.dest] && par != e.dest) {
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        /*
         *  0--------3
         * / |      |
         * 1 |      |
         * \ |      |
         *  2        4
         */

        int v = 5;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);

        System.out.println(DetectCycle(graph));

    }
}
