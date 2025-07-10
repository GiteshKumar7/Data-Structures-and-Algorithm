//https://www.geeksforgeeks.org/problems/knapsack-with-duplicate-items4201/1
// unnbounded Knapsack 
// Tc --> O(n*W)

public class E39 {
    public static void print(int dp[][]){
    for(int i=0;i<dp.length; i++){
        for(int j=0; j<dp[0].length; j++){
            System.out.print(dp[i][j]+ " ");
        }
        System.out.println();
    }    

    }

    public static int unboundedKnapsack(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        // Initialization for col
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 0;
        }

        // Initialization for row
        for (int j = 0; j < W + 1; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < W + 1; j++) {
                if (wt[i-1] <= j) { // valid --> (include) or (exclude)
                    dp[i][j] = Math.max(val[i-1] + dp[i][j-wt[i-1]], dp[i-1][j]);
                } else { // invalid
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        print(dp);
        return dp[n][W];

    }

    public static void main(String[] args) {
        int val[] = { 15, 14, 10, 40, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };

        int W = 7;
        System.out.println("Unnbounded Knapsack Max profit  :" + unboundedKnapsack(val, wt, W));
    }
}
