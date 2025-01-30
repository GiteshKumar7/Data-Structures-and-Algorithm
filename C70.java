//Queue Reversal

import java.util.LinkedList;
import java.util.*;
public class C70 {
    
  public static void QueueReversal(Queue<Integer> q){
    Stack<Integer> s= new Stack<>();
    
     // pushing into the stack
    while(!q.isEmpty()){
       s.push(q.remove());
    }

    //adding into the queue 
    while(!s.isEmpty()){
        q.add(s.pop());
    }
  }
    public static void main(String[] args) {
        
        Queue<Integer> q= new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
        QueueReversal(q);
        System.out.println(q);

    }
}
