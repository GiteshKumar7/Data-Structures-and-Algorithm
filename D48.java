////https://www.geeksforgeeks.org/problems/product-array-puzzle4634/1

import java.util.*;

public class D48 {
   public static ArrayList<ArrayList<Integer>> kClosestPoint(ArrayList<ArrayList<Integer>> points, int K){
      
      PriorityQueue<ArrayList<Integer>> pq= new PriorityQueue<>((p1,p2)->{
        int dist1= p1.get(0)*p1.get(0) + p1.get(1)*p1.get(1);
        int dist2= p2.get(0)*p2.get(0)+ p2.get(1)*p2.get(1);
        return dist2- dist1;
      });

      // Insertin points into the PriorityQueue
      for(ArrayList<Integer> pts: points){
        pq.add(pts);
        if(pq.size()>K){
            pq.remove(); // remove the farthest
        }
      }

      // store result 
      ArrayList<ArrayList<Integer>> result= new ArrayList<>();
      while(!pq.isEmpty()){
        result.add(pq.remove());
      }

      // sorting by x-cordinates and by y-cordinates
    //   result.sort((p1,p2)-> {
    //     if(p1.get(0).equals(p2.get(0))){
    //      return p1.get(1)-p2.get(1);
    //     }
    //     return p1.get(0)-p2.get(0);
    //   });
      return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> points = new ArrayList<>();
        points.add(new ArrayList<>(Arrays.asList(3,3)));
        points.add(new ArrayList<>(Arrays.asList(5, -1))); 
        points.add(new ArrayList<>(Arrays.asList(-2, 4)));


        int k=2;

        ArrayList<ArrayList<Integer>> closestpoint= kClosestPoint(points, k);
        for(ArrayList<Integer> point: closestpoint){
            System.out.println(point);
        }
    }
}
