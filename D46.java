// Nearby cars using the min Heap (Priority queues)

import java.util.PriorityQueue;

public class D46 {
     
   public static class Point implements Comparable<Point>{
    int x;
    int y;
    int dist;
    int idx;
    public Point(int x , int y, int dist, int idx){
        this.x=x;
        this.y= y;
        this.dist= dist;
        this.idx= idx;
    }

     @Override
     public int compareTo(Point p2){
        return this.dist- p2.dist;// ascending order
     }
   }


    public static void main(String[] args) {
       int pts[][]= {{3,3},{5,-1},{-2,4}};
       int k=2;

       // priority queue implementation
       PriorityQueue<Point> pq= new PriorityQueue<>();

       // add all points to the priority queue
       for(int i=0; i< pts.length; i++){
        int dist = pts[i][0]*pts[i][0] +pts[i][1]*pts[i][1];
        pq.add(new Point(pts[i][0] ,pts[i][1], dist, i));
       }
        
      // nearest K cars
      for (int i=0; i<k; i++ ){
        System.out.println("C :" + pq.remove().idx);
      }

    }
}
