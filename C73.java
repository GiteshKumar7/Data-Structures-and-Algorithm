//Implement stack using the deque

import java.util.*;
public class C73 {
    public static class stack{
     
        // using the deque(Double ended queue)
        Deque<Integer> d= new LinkedList<>();

        public  void push(int data){// adding into the deque
           d.addLast(data);
        }

        public int pop(){
            return d.removeLast();
        }

        public int peek(){
            return d.getLast();
        }
    }
    

    public static void main(String aargs[]) {

       Stack s= new Stack();
       s.push(1);
       s.push(2);
       s.push(3);
       System.out.println(s);

       System.out.println("peek " +  s.peek());
       System.out.println(s.pop());
       System.out.println(s.pop());
       System.out.println(s.pop());

    }

}
