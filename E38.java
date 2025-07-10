//https://www.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1?utm_source=chatgpt.com
// Target Sum Subset
public class E38 { 
     public static void print(boolean dp[][]){

        for(int i =0; i< dp.length; i++){
            for(int j=0; j < dp[0].length; j++){
             System.out.print(dp[i][j]+ " ");
            }
            System.out.println();
        }

    
   }

    public static boolean targetSumSubset(int arr[], int sum) {
        int n = arr.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];

        // Initialization
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = true; // sum = 0 is always possible
        }

        // DP transition 
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = arr[i - 1];

                if (v <= j  && dp[i-1][j-v]==true) {
                    // Include or exclude
                    dp[i][j] = true;
                } else if( dp[i - 1][j]==true) {
                    // Cannot include, only exclude
                    dp[i][j] =true;
                }
            }
        }

         print(dp);
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int arr[] = {4, 2, 7, 1, 3};
        int sum = 10;

        System.out.println(targetSumSubset(arr, sum));  // Output: true
    }
}
