//https://www.geeksforgeeks.org/problems/implementing-floyd-warshall2042/1
// floyd warshall Algorithm

public class E18 {

    public static  void floydWarshall(int[][] dist) {
        // Code here
        
        int n =dist.length;
        
        
        // k is the intermediate  node 
        for(int k=0; k< n;k++){
            // i is the source Node 
            for(int i=0; i< n; i++){
                // j is the destination node 
                for(int j=0; j< n ; j++){
                      
                     
                     // 1e8 is inifinty
                      if(i==j) dist[i][j]=0;
                      if(dist[i][k]!= 1e8 && dist[k][j]!= 1e8){
                        dist[i][j]= Math.min(dist[i][j], dist[i][k]+dist[k][j]);
                      }
                      
                }
            }
        }


    }

    public static void main(String[] args) {
        
       // int  dist[][]= new int[n][n];
         int  dist[][]= {{0,-1,2},
                        {1,0,(int)1e8},
                        {3,1,0}
                        };


                  for(int i=0; i< dist.length; i++){
                    for(int j=0; j <dist.length; j++){
                        System.out.print(dist[i][j]+ " ");
                    }
                    System.out.println();
                  }  


                   floydWarshall(dist);
                       System.out.println(" ");

                // printing it from multiple source (shortest path)
                   for(int i=0; i< dist.length; i++){
                    for(int j=0; j <dist.length; j++){
                        System.out.print(dist[i][j]+ " ");
                    }
                    System.out.println();
                  }  

    }
}    

