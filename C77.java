//https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/0
//reversing the first K elements of A Queue

import java.util.LinkedList;
import java.util.*;
public class C77 {

    public static  Queue<Integer> revrsingfirstKelements(Queue<Integer>  q, int k){
       int n =q.size();
     Stack<Integer> s= new Stack<>();
        for(int i =0; i<5; i++){
            s.push(q.remove());
        }

        while(!s.isEmpty()){ 
           q.add(s.pop());
            //  q.add(q.remove());
        }

        for(int i=0 ; i<n-k; i++){
            q.add(q.remove());
        }

        return q;
    }
    
    public static void main(String[] args) {
        
        Queue<Integer>  q= new LinkedList<>();
       q.add(10);
       q.add(20);
       q.add(30);
       q.add(40);
       q.add(50);
       q.add(60);
       q.add(70);
       q.add(80);
       q.add(90);
       q.add(100);

       int k=5;
   
       System.out.println("The reverse of the first k elements before :"+q);
        revrsingfirstKelements(q, k);
        System.out.println("The reverse of the first k elements after :"+q);

    //    for(int m: arr){
    //     System.out.println(k);
    //    }


    }
}
