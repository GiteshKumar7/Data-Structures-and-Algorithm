//https://www.geeksforgeeks.org/problems/distance-from-the-source-bellman-ford-algorithm/1
// Bellman ford  Algorithm
// take forward

import java.util.Arrays;

public class E5 {
     public int[] bellmanFord(int V, int[][] edges, int src){
        int infinity=(int)1e8;// keep in mind
      int dist[]= new int[V];

      //1. initiallizing the infinity to dist[] array
        for(int i =0; i< V; i++){
            dist[i]=infinity;
        }
        dist[src]=0;

        // Arrays.fill(dist, infinity);
        // dist[src]=0;

        //2.  relaxing all N-1 vertices
        for(int i=0; i< V-1;i++){
            for(int[] edge :edges){
                int u=edge[0]; 
                int v=edge[1];
                int w=edge[2];
           
                if(dist[u]!=infinity && dist[u]+w <dist[v]){
                 dist[v]= dist[u]+w ;// relsaxation;  
                }

            }
        }

        //3. check for negative weight cycle 
         for(int[] edge :edges){
                int u=edge[0];
                int v=edge[1];
                int w=edge[2];
           
                if(dist[u]!=infinity && dist[u]+w <dist[v]){
               return new int[]{-1};
                }

            }
            return dist;
     }

    public static void main(String[] args) {
        E5 e= new E5();// object creation

        int v=5;
        // 2D array
        int[][] edges1= {
                {1,3,2},
                {4,3,-1},
                {2,4,1},
                {1,2,1},
                {0,1,5}
        };

        int src=0;


   System.out.println(Arrays.toString(e.bellmanFord(v,edges1,src)));


    }
}
