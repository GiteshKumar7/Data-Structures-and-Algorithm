// Topoligical sort using BFS(Kahns algorithm)

import java.util.*;

public class E2 {
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

    // method for calculating indegree
    public static void inDegree(ArrayList<Edge> graph[], int indeg[]) {
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indeg[e.dest]++;
            }
        }
    }

    public static void topologicalSort(ArrayList<Edge> graph[]) {
        int indegree[] = new int[graph.length];
        inDegree(graph, indegree);

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // bfs perform
        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print( +curr + " ");

            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                indegree[e.dest]--;//decrease by 1 
                if (indegree[e.dest] == 0) {
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
    int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        topologicalSort(graph);
    }
}
