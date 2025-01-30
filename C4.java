
// sorting an arraylist

import java.util.ArrayList;
import java.util.Collections;

import java.util.*;

public class C4 {
    public static void main(String args[]) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(111);
        list.add(22);
        list.add(333);
        list.add(321);
        list.add(2, 222);

        
        System.out.println(list);

         // ascending order
        Collections.sort(list);
        System.out.println(list);

       // Descending order
        Collections.sort(list,Collections.reverseOrder()); 
        System.out.println(list);

      // comparator-> function logic
    }
  
}
