//https://leetcode.com/problems/majority-element/description/

//169->  Majority element 
// cc ->O(n)  

import java.util.*;
public class D67 {
    
    public static int  majorityElement(int arr[]){
        HashMap<Integer, Integer> hm = new HashMap<>();

     for(int i =0; i<arr.length; i++){
        // if(hm.containsKey(arr[i])){
        //     hm.put(arr[i],hm.get(arr[i])+1);
        // }else{
        //     hm.put(arr[i],1);
        // }
          
        // Or 

        hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
     }

     int res= -1;;
     // used for traversing in the collection of objects
       for(Integer key: hm.keySet()){
          if(hm.get(key)> arr.length/3){
             res= key;
          }
       }
     
       return res;// return the found majority element or -1 if none found

    }
     public static void main(String[] args) {
        int arr[]= {1,3,2,5,1,3,1,5,1};

        int value = majorityElement(arr);
      System.out.println("Majority Element (more than n/3 times): " + value);

    }
    
}
