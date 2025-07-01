//https://leetcode.com/problems/flood-fill/submissions/1644399823/
//https://www.geeksforgeeks.org/problems/flood-fill-algorithm1856/1
// lc-733
// flood Fill Algorithm 
// Implicit graph form 

import java.util.Scanner;

public class E13 {

    //Helper function Tc---> O(M*N)
  public static void  Helper(int image[][], int sr, int sc, int color,boolean visited[][],int orgCol){
    if(sr<0 || sc <0 || sr >= image.length || sc >= image[0].length || image[sr][sc]!= orgCol || visited[sr][sc]){
      return;
    }
    
    visited[sr][sc]=true;
    image[sr][sc]=color;
   
    // moving all directions 
    // left 
    Helper(image,sr,sc-1,color,visited,orgCol);

    //right
    Helper(image,sr,sc+1,color,visited,orgCol);

    //up
    Helper(image,sr-1,sc,color,visited,orgCol);

    //down
        Helper(image,sr+1,sc,color,visited,orgCol);


  }

    public static int[][] floodFillAlgo(int image[][], int sr, int sc, int color) {
        boolean visited[][] = new boolean[image.length][image[0].length];

        Helper(image, sr, sc, color, visited, image[sr][sc]);
        return image;
    }

    public static void main(String[] args) {

        int m=3;
        int n=3;
       int image[][]=new int[m][n];
       Scanner sc= new Scanner(System.in);

        System.out.println("Enter 3x3 matrix elements:");
       for(int i=0; i<image.length; i++){
        for(int j=0; j<image[0].length; j++){
             image[i][j]= sc.nextInt();
        }
        System.out.println();
       }

       floodFillAlgo(image, 1,1, 2);

        System.out.println("Flood filled image:");
       for(int i=0; i<image.length; i++){
        for(int j=0; j<image[0].length; j++){
             System.out.print( image[i][j]+ " ");
        }
        System.out.println();
       }
    }
}
