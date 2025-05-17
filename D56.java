//Gfg Max Sum Subarray of Size K 

 public class D56 {
      public static int maxSumSubarraySizeK(int arr[], int k){
          
        int sum =0;
        for(int i=0; i<k; i++){
          sum +=arr[i];
        }

        int maxSum =sum;

        // 1st method 
        // rest of the  window
        // for(int i =k; i<arr.length; i++){
        //     sum +=arr[i]-arr[i-k];
            

        //     maxSum= Math.max(sum, maxSum);
        // }

        // 2nd Method 
        int  startIndex=0;
        int endIndex=k;
        while(endIndex<arr.length){
            sum = sum - arr[startIndex] + arr[endIndex];
            
            maxSum= Math.max(sum, maxSum);

            startIndex++;
            endIndex++;
        }

        return maxSum;
      }


   public static void main(String[] args) {
     int arr[]= {100,200,300,400};
     int k=2;

     int maxSum= maxSumSubarraySizeK(arr, k);
     System.out.println("The maximum sum of subarray of size K " + maxSum);


   }    
}
