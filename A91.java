// buy and sell stocks 
//TC =O(n)

import java.util.*;

public class A91 {

    public static int BuyAndSellStocks(int prices[]) {

// tracking low buy prices initially with innfinity larger values and gradually decreases to minn buy prices
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0; 

        //prices[i]== selling price or today prices
        for (int i = 0; i < prices.length; i++) {
            if (buyprice < prices[i]) {
                int profit = prices[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = prices[i];
            }
          }
     return maxprofit;
}

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int stockprofit = BuyAndSellStocks(prices);
          System.out.println(stockprofit);
    }

}
