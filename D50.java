//https://www.geeksforgeeks.org/problems/minimum-cost-of-ropes-1587115620/1
//https://leetcode.com/problems/minimum-cost-to-connect-sticks/description/

import java.util.*;

public class D50 {
    public static int minCostOfConnect(int ropes[]) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // loadiing into the priority Queue
        for (int points : ropes) {
            pq.add(points);
        }

        int cost=0;
        while (pq.size() > 1) {
            int q = pq.remove();
            int w = pq.remove();
            cost += q + w;
            pq.add(q + w);
        }
        return cost;

    }

    public static void main(String[] args) {
        int ropes[] = { 2, 3, 3, 4, 6 };

        int result = minCostOfConnect(ropes);
        System.out.println("The minimum cost of connection of the  ropes : " + result);
    }
}
