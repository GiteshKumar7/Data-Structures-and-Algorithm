// Iteration(loop type) in hashset

import java.util.*;
public class D70 {

    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>(); // collections

        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengluru");

        // // 1. Method : Iterator
        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        // System.out.println(it.next()) ;
        // }

        // // 2. Method for loop : enhanced or adavanced for each loop
        for (String city : cities) {
            System.out.println(city);
        }

    }
}
