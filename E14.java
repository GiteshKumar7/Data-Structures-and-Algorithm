// Strongly connected Components : Kosaraju Algorithms
// TC---> O(V+E)


import java.util.*;

public class E14 {
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

        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    // code for topological sort
    public static void TopSort(ArrayList<Edge> graph[], int curr, boolean visited[], Stack<Integer> s) {
        visited[curr] = true;

        // for loop for edges
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                TopSort(graph, e.dest, visited, s);
            }
        }
        s.push(curr);
    }

    public static void dfs(ArrayList<Edge> graph[], int curr, boolean visited[]) {
        visited[curr] = true;
        System.out.println(curr + " ");

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if (!visited[e.dest]) {
                dfs(graph, e.dest, visited);
            }
        }
    }

    public static void KosaRajuAlgo(ArrayList<Edge> graph[], int V) {
        // 1. topological sort
        Stack<Integer> s = new Stack<>();
        boolean visited[] = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                TopSort(graph, i, visited, s);
            }
        }

        // 2. reverse the graph

        ArrayList<Edge> transpose[] = new ArrayList[V];
        for (int i = 0; i < graph.length; i++) {
            visited[i] = false;// futher use
            transpose[i] = new ArrayList<>();
        }

        // getting the vertices and edegs
        for (int i = 0; i < graph.length; i++) { // runnning on vertices
            for (int j = 0; j < graph[i].size(); i++) { // running on edes
                Edge e = graph[i].get(j);
                transpose[e.dest].add(new Edge(e.dest, e.src));
            }
        }

        // 3. revese dfs
        while (!s.isEmpty()) {
            int curr = s.pop();
            if (!visited[curr]) {
                visited[curr] = true;
                System.out.print("Strongly connected componets --> ");
                dfs(transpose, curr, visited);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {

        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        KosaRajuAlgo(graph, V);
    }

}
