// Lc 787 
//cheapest Flights within K Stops

import java.util.*;

public class E9 {
    public static class Edge {
        int src, dest, wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void createGraph(int[][] flights, ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        for (int[] flight : flights) {
            int src = flight[0];
            int dest = flight[1];
            int wt = flight[2];
            graph[src].add(new Edge(src, dest, wt));
        }
    }

    public static class Info {
        int v, cost, stop;
        public Info(int v, int c, int s) {
            this.v = v;
            this.cost = c;
            this.stop = s;
        }
    }

    public static int cheapestFlight(int n, int[][] flights, int src, int dest, int k) {
        ArrayList<Edge>[] graph = new ArrayList[n];
        createGraph(flights, graph);

        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        while (!q.isEmpty()) {
            Info curr = q.poll();
            if (curr.stop > k) continue;

            for (Edge e : graph[curr.v]) {
                int next = e.dest;
                int newCost = curr.cost + e.wt;

                if (newCost < dist[next]) {
                    dist[next] = newCost;
                    q.add(new Info(next, newCost, curr.stop + 1));
                 }
            }
        }

        return dist[dest] == Integer.MAX_VALUE ? -1 : dist[dest];
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] flights = {
            {0, 1, 100}, {1, 2, 100}, {2, 0, 100},
            {1, 3, 600}, {2, 3, 200}
        };

        int src = 0, dest = 3, k = 1;

        int result = cheapestFlight(n, flights, src, dest, k);
        System.out.println("Cheapest Price: " + result);
    }
}
