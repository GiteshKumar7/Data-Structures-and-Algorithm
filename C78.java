//https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1
// Max Sum Subarray of size K
// Given an array of integers arr[]  and a number k. Return the maximum sum of a subarray of size k.
// Note: A subarray is a contiguous part of any given array.

// Input: arr[] = [100, 200, 300, 400] , k = 2
// Output: 700
// Explanation: arr3  + arr4 = 700, which is maximum.


public class C78 {
    // Function to find the maximum sum of a subarray of size k
    public  static int maximumSumSubarray(int[] arr, int k) {
        // Edge case: if k is greater than the array size, return 0
        if (arr.length < k) {
            return 0;
        }
        
        // Calculate the sum of the first 'k' elements
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // Initialize the max sum as the first window sum
        int maxSum = windowSum;

        // Slide the window across the array
        for (int i = k; i < arr.length; i++) {
            // Update the window sum: add the next element and remove the first element
            windowSum += arr[i] - arr[i - k];
            // Update max sum if the current window sum is greater
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
  }

public static void main(String[] args) {
    int arr[]= {100,200,300,400};
    int k =2;

    int arr1=maximumSumSubarray(arr, k);
    System.out.println(" Maximum sum of subarray of size "+k+" is "+arr1);

  }
}
