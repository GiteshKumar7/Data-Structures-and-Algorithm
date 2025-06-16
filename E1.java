// Topological sort using dfs

import java.util.*;

public class E1 {
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

        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));

        graph[5].add(new Edge(5, 2));
        graph[5].add(new Edge(5, 0));

    }

    public static void topologicalSort(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                topologicalSortUtil(graph, visited, i, s);
            }
        }

        // geting in order
        while (!s.isEmpty()) {
            System.out.print(s.pop() +" ");
        }

    }

    // perform DFS here
    public static void topologicalSortUtil(ArrayList<Edge> graph[], boolean visited[], int curr, Stack<Integer> s) {

        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                topologicalSortUtil(graph, visited, e.dest, s);
            }
        }

        s.push(curr);
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        topologicalSort(graph);
    }

}
