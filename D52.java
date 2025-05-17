//https://leetcode.com/problems/sliding-window-maximum/
//https://www.geeksforgeeks.org/problems/maximum-of-all-subarrays-of-size-k3101/1
// Sliding window Maximum 
// -> o(nlog K) adding and removing elements from heap(priority Queue )  data structure
//maximum of all subarray of size k

import java.util.*;

public class D52 {
    public static class pair implements Comparable<pair> {
        int idx;
        int val;

        public pair(int idx, int val) {
            this.idx = idx;
            this.val = val;
        }

        // sorting ont the basis of the value in desceiding value
        public int compareTo(pair p2) {
            return Integer.compare(p2.val , this.val);
        }
    }

    public static int[] maxSubArray(int arr[], int k) {

        PriorityQueue<pair> pq = new PriorityQueue<>();
        int n = arr.length;
        int[] ress = new int[n - k + 1];// for resutl

        // adding the 1st window
        for (int i = 0; i < k; i++) {
            pq.add(new pair(i, arr[i]));
        }

        ress[0] = pq.peek().val;

        for (int i = k; i < n; i++) {
            while (pq.size() > 0 && pq.peek().idx <= (i - k)) {
                pq.remove();// not among the current windiw
            }
            pq.add(new pair(i, arr[i]));
            ress[i - k + 1] = pq.peek().val;
        }

          // printinng the array  of maximum subarray of size k
        for(int i =0; i<ress.length; i++){
            System.out.print(ress[i] + " ");
        }

        return ress;
    }
    public static void main(String[] args) {
        int arr[] = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;

    int s[]=  maxSubArray(arr, k);
     System.out.println();

     for(int i=0; i< s.length;i++){
        System.out.print(s[i]+ " ");
     }
     System.out.println();

       
    }
}
