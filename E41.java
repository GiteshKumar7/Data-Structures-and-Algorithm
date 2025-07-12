//https://leetcode.com/problems/coin-change/description/
//https://www.geeksforgeeks.org/problems/number-of-coins1824/1
//Coin Change (Minimum Coins)

public class E41 {
    public static int coinChange(int[] coins, int amount) {
        int n= coins.length;
        int dp[][]= new int[n+1][amount+1];

        for(int i=0; i< n+1; i++){
            dp[i][0]=0;  // amount zero rahatai tab 0
        }

        for(int j=0;j<amount+1; j++){
            dp[0][j]=Integer.MAX_VALUE-1; // amount rahatai no coins mean zero
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<amount+1; j++){
                if(coins[i-1]<=j){
                   dp[i][j]=Math.min( dp[i][j-coins[i-1]]+1,dp[i-1][j]);
                }else{
                     dp[i][j]=dp[i-1][j];
                }
            }
        }
       return  dp[n][amount] == Integer.MAX_VALUE - 1 ? -1 : dp[n][amount];
    }
    public static void main(String[] args) {
        int coins[]= {1,2,5};
        int amount=11;
        // Output --> Explanation: 11 = 5 + 5 + 1

        System.out.println(coinChange(coins, amount));
    }
}
