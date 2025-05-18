// impelemetation of the TreeMap

import java.util.TreeMap;
import java.util.HashMap;
public class D66 {
   
    public static void main(String[] args) {
        

        // in alphabetical order
        TreeMap<String, Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("Nepal", 5);
        tm.put("US",50);
        tm.put("Indonesia",11);

        //  inn any order
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("Nepal", 5);
        hm.put("US",50);
        hm.put("Indonesia",11);

        System.out.println(tm);
        System.out.println(hm);

    }


}
