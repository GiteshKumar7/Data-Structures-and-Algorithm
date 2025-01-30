// Deque (Double ended queue) -> interface 

import java.util.*;
public class C71 {
    public static void main(String[] args) {

        Deque<Integer> d = new LinkedList<>();

        d.addFirst(1);
        d.addFirst(2);
        d.addFirst(3);
        d.addLast(5);
        d.addFirst(0);

        System.out.println(d);
        System.out.println("The first element : " + d.getFirst());
        System.out.println("The last element :" + d.getLast());
        System.out.println(d.getLast());
        System.out.println(d.removeLast());

    }

}
