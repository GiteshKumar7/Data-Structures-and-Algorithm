//kruskal's Algorithms
// using Edge List instead of adjacency Matrix

import java.util.*;

public class E12 {
    public static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }

        @Override
        public int compareTo(Edge e2) {
            return this.wt - e2.wt;// ascending
        }
    }

    public static void creategraph(ArrayList<Edge> edges) {
        // edges
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(0, 2, 15));

        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));

    }

    static int n = 4;// no. of vertices
    static int par[] = new int[n];// initially zero
    static int rank[] = new int[n];// initially 0

    // orooiving parent of itself
    public static void initializationFunction() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    // path compression
    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }
        return par[x] = find(par[x]);
    }

    // union find
    public static void unionFind(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (parA == parB) {
            return;
        }

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void kruskalMST(ArrayList<Edge> edges, int V){
     initializationFunction();
   Collections.sort(edges);// ascending order
   int finalCost=0;
   int count=0;

   for(int i=0; i<edges.size(); i++){
    Edge e= edges.get(i);

    // src,dest,wt
     int parA=find(e.src);// src= a
     int parB=find(e.dest);// dest=b

     // == condition leads loop finding 
     if(parA!=parB){ 
        unionFind(e.src, e.dest);
        finalCost+=e.wt;
         count++; 
        System.out.println(e.src + " -- " + e.dest + " @ " + e.wt);

     }
    }
     System.out.println(finalCost);
  }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edge = new ArrayList<>();
        creategraph(edge);

        kruskalMST(edge, V);

    }
}
