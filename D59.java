//https://leetcode.com/problems/minimum-amount-of-time-to-fill-cups/description/
//Minimum time to fulfil all orders


import java.util.*;
public class D59 {

    public static int minAmountofTime(int arr[]){
      // Max heap implementation
        PriorityQueue<Integer> pq= new PriorityQueue<Integer>((a,b)->(b-a));


        // putting into the heap
        for(int i: arr){
            pq.add(i);// max heap fashion
        }

        int minSec=0;

        while(!pq.isEmpty()){
            int first=pq.remove();
            int second=pq.remove();

            if(first<=0 && second<=0){
                break;
            }

            first--;
            second--;
            pq.add(first);
            pq.add(second);
            minSec++;
        }
        return minSec;

    }

    public static void main(String[] args) {
        int arr[]= {5,4,1};
        
        int mintime= minAmountofTime(arr);
        System.out.println("The min time to fill up the cups : " + mintime);
    }
    
}
