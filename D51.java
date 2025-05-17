//1337. The K Weakest Rows in a Matrix
//https://leetcode.com/problems/the-k-weakest-rows-in-a-matrix/description/


import java.util.*;
public class D51 {

    public static class Row implements Comparable<Row>{ // comparable interface for sorting 
       int solider;
       int idx;
       public Row(int solider , int idx){
        this.solider= solider;
        this.idx= idx;
       } 

       @Override 
       public int compareTo(Row r2){
          if(this.solider ==r2.solider){ // solider count is same
            return this.idx-r2.idx; // commparion on the basis of index
          }else{                         // for sorting by solider count
            return this.solider-r2.solider;  // comparison on he basis of row 
          }
       }
    }

       // finig the k weakest solider
       public static int[] kWeakestRows(int[][] army, int k) {
       
        PriorityQueue<Row> pq= new PriorityQueue<>();

        //putting into the priority Queue on the basis of solider cound and index
             for(int i=0;i<army.length; i++){
               int count=0;
               for(int j=0; j<army[0].length; j++){
                   count += army[i][j]==1 ? 1 : 0;
               }
               pq.add(new Row(count,i));
             }


             int[] result= new int[k];
             for(int i=0; i<k ; i++){
                result[i]=  pq.remove().idx;
                 }

                 return result;
       }

     
    public static void main(String[] args) {
        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};

        int k=2;

     
    //   D51 obj = new D51();
    //   System.out.println(Arrays.toString(kWeakestRows(army, k)));

      int[] weakestRows = kWeakestRows(army, k);
      System.out.println("The " + k + " weakest rows are: " + Arrays.toString(weakestRows));

    }
}
