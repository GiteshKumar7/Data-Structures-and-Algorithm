//https://leetcode.com/problems/minimum-operations-to-halve-array-sum/description/

import java.util.*;
public class D61 {
   public static int minOperationsToHalveArray(int arr[]){
      
    // Sort the array in descending  order
    PriorityQueue<Integer> pq= new PriorityQueue<>((a,b)->(b-a));

    int sum=0;
    for(int i =0;i<arr.length; i++){
        pq.add(arr[i]);
        sum+=arr[i];
    }

    int target=sum/2;
    int count=0;

    while(target<sum){
        count++;
        int max= pq.remove();
        sum-=max;
        max=max/2;
        sum+=max;
        pq.add(max);
    }
    return count;

   }


    public static void main(String[] args) {
        D61  d = new D61();
        int[] arr= {3,8,10};
       System.out.println(d.minOperationsToHalveArray(arr));

       int[] nums2 = {3, 8, 20};
       System.out.println(d.minOperationsToHalveArray(nums2)); // Output: 3
    
       int minimumOperations= minOperationsToHalveArray(arr);
        System.out.println("Minimum Operations to Halve Array Sum : " + minimumOperations) ;//

    }
}
