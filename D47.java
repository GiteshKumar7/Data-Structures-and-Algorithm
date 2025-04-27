//https://leetcode.com/problems/k-closest-points-to-origin/description/
//https://www.geeksforgeeks.org/problems/product-array-puzzle4634/1

// using the max Heap 

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class D47 {
    public int[][] kclosest(int points[][], int k) {
        if (points== null) {
            return null;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {
            public int compare(int[] p1, int[] p2) {
                return (p2[0] * p2[0] + p2[1] * p2[1]) - (p1[0] * p1[0] + p1[1] * p1[1]);
              // return (p1[0] * p1[0] + p1[1] * p1[1]) - (p2[0] * p2[0] + p2[1] * p2[1]); 
            }
        });

        for (int i = 0; i < points.length; i++) {
            pq.add(points[i]);
            if (pq.size() > k) {
                pq.remove();
            }
        }

        int[][] result = new int[k][2];
        int i = 0;
        while (!pq.isEmpty()) {
            result[i] = pq.remove();
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
    
        D47 obj = new D47();
        int[][] points= {{3,3},{5,-1},{-2,4}};
        int k=2;

        int[][] closestPoints=obj.kclosest(points, k);
        System.out.println("The " +k + " Closest ponits to origin are :");
        for(int[] point : closestPoints){
            System.out.println(Arrays.toString(point));
        }
    }
}
