//https://leetcode.com/problems/kth-largest-element-in-a-stream/description/
// LC : 703. Kth Largest Element in a Stream

// Input:
// ["KthLargest", "add", "add", "add", "add", "add"]
// [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]

// Output: [null, 4, 5, 5, 8, 8]


import java.util.PriorityQueue;
public class D57 {
    private PriorityQueue<Integer> pq;
    private int k;

    public D57(int k, int[] nums) {
        this.k = k;
        pq = new PriorityQueue<>(); // Min-heap to store k largest elements

        for (int num : nums) {
            add(num); // Add elements to maintain the heap
        }
    }

    public int add(int val) {
        if(pq.size() < k || pq.peek() < val){
          pq.add(val); // Add new value to the heap
        
        if (pq.size() > k) {
            pq.poll(); // Remove the smallest element if size exceeds k
        }
    }
        return pq.peek(); // Kth largest element (smallest in min-heap)
    }

    public static void main(String[] args) {
        int k=3;
        int arr[]= {4,5,8,2};
        D57 kthLargest = new D57(3, arr);


        System.out.print(kthLargest.add(3)+ " ");  // Output: 4
        System.out.print(kthLargest.add(5)+ " ");  // Output: 5
        System.out.print(kthLargest.add(10)+ " "); // Output: 5
        System.out.print(kthLargest.add(9)+ " ");  // Output: 8
        System.out.print(kthLargest.add(4)+ " ");  // Output: 8
    }
}
