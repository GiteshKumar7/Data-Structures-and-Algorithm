//max subarray sum using kadanes algorithm
// kadanes algorith for both positive and negative numbers
// TC==O(n)
import java.util.*;
public class A86 {
   
    public static int kadanes(int arr[]){
        int maxSubarray= Integer.MIN_VALUE;
        int currSum=0;// currentsum

        for(int i=0; i<arr.length; i++){
             currSum=currSum+arr[i];
             if(currSum<0){ // beter to get 0 than -ve number 
                currSum=0;
             }
             maxSubarray =Math.max(currSum,maxSubarray);
        
        }
    return maxSubarray;
    }

    public static void main(String args[]){
    int arr[]={-2,-3,4,-1,-2,1,5,-3};
     int  maxSubarraySum = kadanes(arr);
     System.out.println("the maximum subarray sum :" +maxSubarraySum);



        
    }
    
}
