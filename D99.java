//LC->785 
//->https://leetcode.com/problems/is-graph-bipartite/
// Bipartite Graph
//check for whether a graph is bipartite using BFS in Java.
// o(v+e)
// sc -> o(v)

import java.util.*;

public class D99 {
    public static class Edge{
     int src;
      int dest;
      int wt;
      public Edge(int s, int d, int w){
        this.src=s;
        this.dest=d;
        this.wt=w;
      }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
     
        for(int i=0; i<graph.length; i++){
           graph[i]= new ArrayList<>();
        }

        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));


        graph[1].add(new Edge(1,0,1));
        graph[1].add(new Edge(1,3,1));

        graph[2].add(new Edge(2,0,1));
        graph[2].add(new Edge(2,4,1));

        
        graph[3].add(new Edge(3,1,1));
        graph[3].add(new Edge(3,4,1));

        
        graph[4].add(new Edge(4,2,1));
        graph[4].add(new Edge(4,3,1));

    }

  public static boolean isBipartite(ArrayList<Edge> graph[]){
      
    Queue<Integer> q= new LinkedList<>();
    int colour[]= new int[graph.length];

    for(int i=0; i<colour.length; i++){
        colour[i]=-1;
    }
   
    // BFS
    for(int i=0; i<graph.length; i++){
        if(colour[i]==-1){
            q.add(i);//add in queue
            colour[i]=0;
            while(!q.isEmpty()){
                int curr= q.remove();
                for(int j=0; j<graph[curr].size(); j++){
                    Edge e=graph[curr].get(j);
                     if(colour[e.dest]==-1){
                        int nextCol= (colour[curr] == 0 ?1:0);
                        colour[e.dest]=nextCol;// 0 or 1 in color
                        q.add(e.dest);// add to queue
                     }else if(colour[e.dest]==colour[curr]){
                       return false;// not bipartite coniion
                     }
                }
            }
         }
       }

    return true;

  }

  public static void main(String[] args) {
    /*
     *        0
     *      /    \
     *     1      2
     *      \     /
     *       3---4
     *      FALSE
     */  


     int v=5;
     ArrayList<Edge> graph[] = new ArrayList[v];

     createGraph(graph);

     System.out.println(isBipartite(graph));
  }    
}
