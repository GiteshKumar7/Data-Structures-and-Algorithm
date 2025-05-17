//// https://leetcode.com/problems/maximum-subarray/
//Maximum Sub-Array Sum (LeetCode 53(Medium level  qtns  )) 
// Kadane's Algorithm 


public class D53 {
    
    public static int SubArraySum(int nums[]){
        // Initialize the maximum sum and the current sum to the first element of the array
        int maxSum=nums[0];

        int currSum= nums[0];

        for(int i =1; i<nums.length; i++){
            // Update the current sum to be the maximum of the current number and the sum of the current
            currSum= Math.max(nums[i],nums[i] +currSum);

            // updating thee final maxsum
            maxSum= Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    
    public static void main(String[] args) {
    int nums[]={-2,-5,6,-2,-3,1,5,-6};

    int maxSum= SubArraySum(nums);
    System.out.println("The maximum subarray sum : " + maxSum);

    
   } 
}
