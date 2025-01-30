// pair Sum first
// Brute force approach ->0(n2)

import java.util.*;
import java.util.ArrayList;
public class C9 {
    public static boolean pairSum1(ArrayList<Integer> list, int target){

     for( int i=0; i<list.size(); i++){
        for( int j=i+1; i<list.size(); j++){
           if((list.get(i)+ list.get(j))==target){
            return true;
            }
            // else{
            //     return false;
            // }
          }
       }
   return false;
    }

    public static void main(String args[]){
    
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target =50;

        System.out.println(pairSum1(list,target));

    }
}
