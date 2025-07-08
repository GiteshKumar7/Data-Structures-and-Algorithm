//https://leetcode.com/problems/critical-connections-in-a-network/description/
//1192. Critical Connections in a Network 
// Articulation point( Tarjan Algorithm)
// Tc --->> O(V+E) equals to dfs time complexity

import java.util.ArrayList;

public class E16 {
    public static class Edge {
        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {

        // loop running on the vertics
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 2));

        graph[2].add(new Edge(2, 1));
        graph[2].add(new Edge(2, 0));

        graph[3].add(new Edge(3, 0));
        graph[3].add(new Edge(3, 4));

        graph[4].add(new Edge(4, 3));

    }

    public static void dfs(ArrayList<Edge> graph[], int curr, int par, int dt[], int low[], boolean vis[], int time[], boolean ap[]) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time[0];
        int children = 0;

        // loop running on  edge
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            int neigh = e.dest;

            if (neigh == par) {
                continue;
            } else if (!vis[neigh]) {
                
                dfs(graph, neigh, curr, dt, low, vis, time,ap);
                low[curr] = Math.min(low[curr], low[neigh]);

                if (par != -1 && dt[curr] <= low[neigh]) {
                 ap[curr]= true;
                }
                children++;
            } else {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }

        if (par == -1 && children > 1) {
                 ap[curr]= true;
        }

    }

    public static void getAP(ArrayList<Edge> graph[], int V) {
        int dt[] = new int[V];
        int low[] = new int[V];
        int time[] = new int[V];
        

        boolean vis[] = new boolean[V];// prevent from loop
        boolean ap[]= new boolean[V];

        // running on the vertices 
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, dt, low, vis, time,ap);
            }
        }

        // printing the value of articulation point
         for (int i = 0; i < graph.length; i++) {
            if (ap[i]) {
           System.out.println("Ap : " + i);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);

        getAP(graph, V);

    }
}
