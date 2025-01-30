// Queue implementation using the java collection framework
// using LinkedList  -> 0(1) for all operation
import java.util.*;
public class C63 {

   
   public static void main(String[] args) {
    // LinnkedList or ArrayDeque  for queue interface 
    Queue<Integer> q= new LinkedList<>();
    q.add(1);
    q.add(2);
    q.add(3);
    while(!q.isEmpty()){
        System.out.println(q.peek());
        q.remove();
    }

   }    
}
