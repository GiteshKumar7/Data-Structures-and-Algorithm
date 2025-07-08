
////https://www.geeksforgeeks.org/problems/articulation-point-1/1
// Articulation point using tarjan's algorithm
import java.util.*;

public class E17 {

    // DFS function to find articulation points using Tarjan's algorithm
    private void dfs(ArrayList<ArrayList<Integer>> adj, int curr, int par,
            int[] dt, int[] low, boolean[] vis, boolean[] ap, int[] time) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time[0]; // discovery time and low time
        int children = 0; // count of children in DFS tree

        for (int neigh : adj.get(curr)) {
            if (neigh == par) {
                // Ignore the edge to parent
                continue;
            }

            if (!vis[neigh]) {
                // Tree edge
                children++;
                dfs(adj, neigh, curr, dt, low, vis, ap, time);

                // Check if subtree rooted at neigh has a connection to
                // one of ancestors of curr
                low[curr] = Math.min(low[curr], low[neigh]);

                // Articulation point condition
                if (par != -1 && dt[curr] <= low[neigh]) {
                    ap[curr] = true;
                }
            } else {
                // Back edge (visited)
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }

        // If curr is root and has two or more children, it's an articulation point
        if (par == -1 && children > 1) {
            ap[curr] = true;
        }
    }

    // Function to return all articulation points in sorted order
    public ArrayList<Integer> articulationPoints(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] dt = new int[V]; // discovery times
        int[] low = new int[V]; // low values
        boolean[] vis = new boolean[V];
        boolean[] ap = new boolean[V]; // articulation points marker
        int[] time = new int[1]; // single element array to keep track of time

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                dfs(adj, i, -1, dt, low, vis, ap, time);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (ap[i]) {
                res.add(i);
            }
        }

        if (res.size() == 0) {
            res.add(-1);
        }

        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
        int V = 5;

        // creating the aadajcency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // sample of the graph
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(3);

        adj.get(1).add(0);
        adj.get(1).add(2);

        adj.get(2).add(1);
        adj.get(2).add(0);

        adj.get(3).add(0);
        adj.get(3).add(4);

        adj.get(4).add(3);


        E17 soln= new E17();
        ArrayList<Integer> ans= soln.articulationPoints(V, adj);

      System.out.println("Articulation points :" + ans);

    }
}
