//Implement stack using the deque

import java.util.*;

public class C72 {
    public static void stackUsingDeque(Deque<Integer> d){
        while (!d.isEmpty()) {
            System.out.print(d.removeLast() + " ");
         }
         System.out.println();
    }

    public static void main(String aargs[]) {

        Deque<Integer> d = new LinkedList<>();
        d.addFirst(3);
        d.addFirst(2);
        d.addFirst(1);

        System.out.println(d);

        // while (!d.isEmpty()) {
        //    System.out.print(d.removeLast() + " ");
        // }
        // System.out.println();
        stackUsingDeque(d);
    }

}
