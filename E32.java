 //https://leetcode.com/problems/climbing-stairs/description/
//70. Climbing Stairs 

// use memoization DP for better time complexity than reccursion
// Tc == O(n) 

import java.util.*;
public class E32 {
    public static int countWays(int n, int dp[]){
        if(n==0){
             return 1;
        }  

        if(n< 0){
            return 0;
        }

        // not calculated 
        if(dp[n]!=-1){
            return dp[n];
        }

        dp[n]= countWays(n-1,dp) + countWays(n-2,dp);
        return dp[n];
    }
   
    public static void main(String[] args) {
    int n=5;
    int dp[]= new int[n+1];

    // filling into that array
    Arrays.fill(dp,-1);// iitilly with -1

    System.out.println("The climbing Stairs : " +countWays(n,dp));
   }    
}
 
