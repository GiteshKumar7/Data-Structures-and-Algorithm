// first repeating number

import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class C67 {
   public static int repeatingNum(int arr[]){

    //Set<Integer> s = new HashSet<>();
      HashMap<Integer,Integer> s = new HashMap<>();


    for(int i=0; i<arr.length; i++){
        if(s.containsKey(arr[i])){
        return s.get(i)+1;
        }
        s.put(arr[i],i);
    }
    return -1;

   }


    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 4, 3, 5, 6};
        int  s= repeatingNum(arr);
        System.out.println(s);
    }
    
}
