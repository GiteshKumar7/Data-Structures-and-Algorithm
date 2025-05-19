// Count distinct Elements ->(n)
// tc -> liinear time

import java.util.*;
public class D73 {
    public static int countDistinctElements(int num[]){
        HashSet<Integer> set= new HashSet<>();
       
        for( int i=0; i< num.length; i++){
            set.add(num[i]);
        }

        System.out.println(set);
        return set.size();

    }

    public static void main(String[] args) {
        int num[]= {4,3,2,5,6,7,4,3,2,1};

         int arr = countDistinctElements(num);
         System.out.println(arr);
        
       
    }
}
