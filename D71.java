// LinkeHashSet
// same operation --> add(), remove(), size(),cleear()

import java.util.*;
public class D71 {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>(); // collections
       cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengluru");
         System.out.println(cities);


        LinkedHashSet<String> lhs= new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengluru");

        System.out.println(lhs);

        // LinkedHashMap operation
        lhs.remove("Noida");
        System.out.println(lhs);


        // iterator in the LinkedHashMap
        Iterator it = lhs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
