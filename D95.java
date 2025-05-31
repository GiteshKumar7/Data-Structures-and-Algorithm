//Connected components 

import java.util.*;

public class D95 {
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

        // 0 -vertex
        graph[0].add(new Edge(0, 1, 1));

        // 1 vertex
        graph[1].add(new Edge(1, 0, 1));

        // 2 vertex
        graph[2].add(new Edge(2, 3, 1));

        // 3 vertex
        graph[3].add(new Edge(3, 2, 1));

        // 4 vertex
        graph[4].add(new Edge(4, 5, 1));

        // 5 vertex
        graph[5].add(new Edge(5, 4, 1));
        graph[5].add(new Edge(5, 6, 1));

        // 6 vertex
        graph[6].add(new Edge(6, 5, 1));

    }

    public static void bfs(ArrayList<Edge> graph[]) {
        boolean visited[] = new boolean[graph.length];// for explored set
        int componentsCount = 0;
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                System.out.println("Componenet "+componentsCount + ":");
                bfshelper(graph, visited, i);
                System.out.println();
                componentsCount++; 
            }
        }  
    }

    public static void bfshelper(ArrayList<Edge> graph[], boolean visited[], int src) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);// initally siurce =0;
        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!visited[curr]) {
                System.out.print(curr + " ");
                visited[curr] = true;
                // // 1.way to print
                // for(int i=0; i<graph[curr].size(); i++){
                // Edge e= graph[curr].get(i);
                // q.add(e.dest);
                // }

                // 2.way to print
                for (Edge e : graph[curr]) {

                    q.add(e.dest);
                }

            }

        }
    }

    public static void main(String[] args) {
         /*
                0---->1 (components 0)
                2---->3  (components 1)
                4---->5----->6  (components 2)
          */
      

        int v = 7;
        // graph[] is an array of arraylist of edge objects
        ArrayList<Edge> graph[] = new ArrayList[v];

        createGraph(graph);
        bfs(graph);

    }
}
