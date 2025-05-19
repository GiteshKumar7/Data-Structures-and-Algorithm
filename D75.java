// Find Itinerary from Tickets ->O(n)
// "chennai" -> "bengluru"
//  "Mumbai" ->"Delhi"
//  "Goa" ->"Chennai"
//  "Delhi"->"Goa"

import java.util.*;

public class D75 { 
    public static String getFirstPoint( HashMap<String, String> tickets){
    HashMap<String, String> revhas= new HashMap<>();

    // reversing the key into vlaue and value into key
    for(String key: tickets.keySet()){
        revhas.put(tickets.get(key),key);
    }

    for(String key: tickets.keySet()){
        if(!revhas.containsKey(key)){
            return key; // strting point
        }
    }

    return null;

    }

    public static void main(String[] args) {
        HashMap<String, String> tickets=new HashMap<>();
         tickets.put("Chennai", "Bengluru");
         tickets.put("Mumbai","Delhi");
         tickets.put("Goa","Chennai");
         tickets.put("Delhi","Goa");

       String start= getFirstPoint(tickets);
       System.out.print(start);


       for(String key: tickets.keySet()){
        System.out.print(" -> " + tickets.get(start));
        start=tickets.get(start);// next start
       }

       System.out.println();
    }
}
