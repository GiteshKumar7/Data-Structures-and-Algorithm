// All path from source to destination in directed graph
// Directed graph 
//dfs

import java.util.*;

public class E3 {

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

        
        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));

        graph[3].add(new Edge(3, 1));

        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));

        graph[5].add(new Edge(5, 2));
        graph[5].add(new Edge(5, 0));

    }

    public static void printAllDirectedPath(ArrayList<Edge> graph[], String path, int src, int dest) {
        if (src == dest) {
            System.out.println(path + dest);
            //System.out.println();
            return;
        }


        for(int i=0; i<graph[src].size(); i++){
            Edge e= graph[src].get(i);
            printAllDirectedPath(graph, path+src, e.dest, dest);//imp

        }

    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);

        int src = 5;
        int des = 1;

        printAllDirectedPath(graph, "", src, des);
    }
}
