//https://leetcode.com/problems/maximum-average-subarray-i/
//643. Maximum Average Subarray I

public class D54 {
    public static int findMaxAverage(int nums[], int k){
         
        int sum=0;
        // upto first k sliding window  
        for(int i =0; i<k; i++){
            sum +=nums[i];
        } 
   
        int maxSum=sum;
        int startIndex=0;
        int endIndex=k;

        // for upcming winndow
        while(endIndex< nums.length){

            sum -=nums[startIndex];
            startIndex++;

            sum +=nums[endIndex];
            endIndex++;

            maxSum= Math.max(maxSum , sum);
        }
        return  maxSum/k;


    }

    public static void main(String[] args) {
        int nums[]={1,12,-5,-6,50,3};
        int k =4;

        int result= findMaxAverage(nums,k);
        System.out.println("The maximum averrage of subarray of size " + k + " is " + result);


    }
    
}
