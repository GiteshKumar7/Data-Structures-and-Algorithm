// TreeSet
// sorted in ascending order
// NULL values are not allowed

import java.util.*;
import java.util.LinkedHashSet;

public class D72 {

    public static void main(String[] args) {
        // in any order is the optput alnog with NULL values
        HashSet<String> cities = new HashSet<>(); // collections
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add(" ");
        cities.add("Bengluru");
        System.out.println(cities);

        // the way inserted the way outputted
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add(" ");
        lhs.add("Noida");
        lhs.add("Bengluru");
        System.out.println(lhs);

        // in sorting ascending order
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Noida");
        ts.add("Bengluru");
        System.out.println(ts);

    }
}
