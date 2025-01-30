//https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
//connect N Ropes with minimum cost
// suing the priority cost

import java.util.*;

public class C76 {
    public static int minimumCost(int arr[]) {

        PriorityQueue<Integer> p = new PriorityQueue<>();

        // adding the array elements int o the prority queue
        for (int i = 0; i < arr.length; i++) {
            p.add(arr[i]);
        }

        int ans = 0;
        while (p.size()>1) {
            int n1 = p.poll();
            int n2 = p.poll();
            int sum = n1 + n2;

            ans += sum;
            p.add(sum);
        }
        return ans;

    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 6 };
        int s = minimumCost(arr);
        System.out.println("The minimum cost of the ropes :"+ s);
    }

}
