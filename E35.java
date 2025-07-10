// 0-1 knapsack problems Dp
// here using recursion for small value of n

public class E35 {
    public static int knapsack(int val[], int wt[], int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }

        if (wt[n - 1] <= W) {
            // (include)
            int ans1 = val[n - 1] + knapsack(val, wt, W - wt[n - 1], n - 1);

            // Exclude
            int ans2 = knapsack(val, wt, W, n - 1);

            return Math.max(ans1, ans2);
         } else {
            return knapsack(val, wt, W, n - 1);

        }

    }


    public static void main(String[] args) {
        int W = 7;
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };

        System.out.println("0 1 Knapsack max profit : " + knapsack(val, wt, W, val.length));

    }
}
