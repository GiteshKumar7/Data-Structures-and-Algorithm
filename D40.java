// heaps or priority queues

import java.util.*;
public class D40 {

    public static void main(String[] args) {
     
       // PriorityQueue<Integer> pq= new PriorityQueue<>();// In ascending fashions
        PriorityQueue<Integer> pq= new PriorityQueue<>(Comparator.reverseOrder());//in descending fashions

        pq.add(5);// 0(logn)
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(6);

        // print in the order of the priority queue fashions 
        while(!pq.isEmpty()){
            System.out.print(pq.peek()+ " ");//0(1)
            pq.poll();// 0(logn)
        }


    }
}
