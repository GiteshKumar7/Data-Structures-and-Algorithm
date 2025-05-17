// Hashmap  operations 

import java.util.*;
public class D62 {
    
    public static void main(String[] args) {
        // create the hashmap 
        HashMap<String, Integer> hm= new HashMap<>();

        // insert -(1)
        hm.put("India", 120);
        hm.put("china", 150);
        hm.put("Nepal", 3);
      
        System.out.println(hm.size());// 3
        hm.clear();// clear all the key and values
        System.out.println(hm.isEmpty());// now true otherwise false
       
    
    //     System.out.println(hm);

    //     // get function -(1)
    //    int population=  hm.get("India");
    //    System.out.println(population);// 120

    //    System.out.println(hm.get("indeonesia")); // Null 


    //    // containKey _(1)
    //    System.out.println(hm.containsKey("India"));// true
    //    System.out.println(hm.containsKey("indonesia"));// false


    //    // remove- 0(1)  delete key and value
    //    System.out.println(hm.remove("china")); // provide its key value
    //    System.out.println(hm.remove("egypt"));// null

    //    System.out.println(hm);

    }
}
