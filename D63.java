// iterationn on hashMap
import java.util.*;

public class D63 {
    public static void main(String[] args) {
        
        HashMap<String, Integer> hm= new HashMap<>();
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);

        // iterate
        Set<String> keys= hm.keySet();
        System.out.println(keys); // give all the key unordered fashion

        System.out.println( hm.entrySet());
                 // OR 
 
         //   for(String k:  keys){
         // System.out.println("key =" + k + "," + "Value ="+ hm.get(k));
         //   }

    }
}
