//https://www.geeksforgeeks.org/problems/0-1-knapsack-problem0945/1
// 0 1 Knapsack problem 
// using memoization (bottom up approach)

import java.util.*;
public class E36 { 
    public static int knapsack(int val[], int wt[], int W, int n, int[][] dp) {
       
        if (n == 0 || W == 0) {
            return 0;
        }

        // 2-D array for storing and tracking 
        if(dp[n][W]!=-1){
            return dp[n][W];
        }

        if (wt[n - 1] <= W) {
            // (include)
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1,dp);

            // Exclude
            int ans2 = knapsack(val, wt, W, n - 1,dp);

            dp[n][W]= Math.max(ans1, ans2);
            // return dp[n][W];
        } else {
            dp[n][W] =knapsack(val, wt, W, n - 1,dp);
            // return dp[n][W];
        }
        return dp[n][W];
    }

    public static void main(String[] args) {
        int W = 7;
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };

        int dp[][] = new int[val.length+1][W + 1];

        for (int i = 0; i <dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println("0 1 Knapsack max profit : " + knapsack(val, wt, W, val.length, dp));

    }
}
