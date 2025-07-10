// tabulation (  top Down )
// 0-1 Knapsack problem

public class E37 {
   public static void print(int dp[][]){
    for(int i=0; i< dp.length; i++){
        for(int j=0; j<dp[0].length; j++){
            System.out.print(dp[i][j]+ " ");
        }
        System.out.println();
    }
   }

    public static int knapsackTab(int val[], int wt[], int W) {

        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        // // fixing the value zero at index col
        // for (int i = 0; i < dp.length; i++) {
        //     dp[i][0] = 0;
        // }
        // // fixing the value zero at index row
        // for (int j = 0; j < dp[0].length; j++) {
        //     dp[0][j] = 0;
        // }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j<dp[0].length; j++) {
                int v = val[i - 1]; // ith item val 
                int w = wt[i - 1]; // ite item wt

                if (w <= j) {
                    // valid case
                    int incProfit = v + dp[i - 1][j - w];
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } else {
                    int excProfit = dp[i - 1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        print(dp);
        return dp[n][W];

    }

    public static void main(String[] args) {
        int W = 7;
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };

    
     
        System.out.println("0 1 Knapsack max profit : " + knapsackTab(val, wt, W));

    }
}
