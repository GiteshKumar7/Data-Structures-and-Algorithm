//https://leetcode.com/problems/maximum-average-subarray-i/
//643. Maximum Average Subarray I
//GFG 
//https://www.geeksforgeeks.org/problems/maximum-average-subarray5859/1
 


// return the starting index of the subarray with the maximum average
public class D55 {
  
        public static int findMaxAverageSubarray(int[] arr, int k) {
            int n = arr.length;
            if (n < k) return -1; // Edge case: if array size is less than k
    
            int maxSum = 0, windowSum = 0, maxIndex = 0;
    
            // Compute sum of the first k elements
            for (int i = 0; i < k; i++) {
                windowSum += arr[i];
            }
            maxSum = windowSum;
    
            // Sliding window technique
            for (int i = k; i < n; i++) {
                windowSum += arr[i] - arr[i - k]; // Remove leftmost, add new element
                
                if (windowSum > maxSum) {
                    maxSum = windowSum;
                    maxIndex = i - k + 1; // Store starting index
                }
            }
            return maxIndex; // Return starting index of max average subarray
        }
    
        public static void main(String[] args) {
            int[] arr = {1, 12, -5, -6, 50, 3};
            int k = 4;
            int index = findMaxAverageSubarray(arr, k);
            
            // Printing the subarray
            for (int i = index; i < index + k; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }  

