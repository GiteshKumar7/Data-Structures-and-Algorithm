//https://www.geeksforgeeks.org/problems/kth-largest-element-in-a-stream2220/1

// Input:
// k = 4, n = 6
// arr[] = {1, 2, 3, 4, 5, 6}
// Output:
// -1 -1 -1 1 2 3


import java.util.*;
public class D58 {

    public static int[] KthLargest(int k, int arr[]){
      int n = arr.length;
     PriorityQueue<Integer> pq = new PriorityQueue<>();
      
     int[] result= new int[n];
      
     for(int i=0; i<n; i++){
         pq.add(arr[i]);
          
          if(pq.size()>k){
              pq.remove();
          }
          
          result[i]=(pq.size()  < k) ? -1 : pq.peek();
     }
     
     return result;

    }

    public static void main(String[] args) {
        int k =4; 
        int arr[]= {1,2,3,4,5,6,};


      int arr1[]= KthLargest(k,arr);
        for(int i =0; i<arr1.length; i++){
        System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    
}
