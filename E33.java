// Variation in climbinng stairs having climb either 1,2 or 3 stairs

import java.util.Arrays;

public class E33 {
      public static int countWays(int n, int dp[]){
         if(n==0){
            return 1;
         }

         if(n<0){
            return 0;
         }

         if(dp[n]!=-1){
            return dp[n];
         }

         dp[n]=countWays(n-1, dp)+ countWays(n-2, dp)+ countWays(n-3, dp);

         return dp[n];

      }  

    public static void main(String[] args) {
        int n=1;
        int[] dp=  new int[n+1];

        Arrays.fill(dp,-1);/// already filled with -1

        System.out.println("Climbing stairs :" + countWays(n,dp));

    }
}
