//https://leetcode.com/problems/climbing-stairs/description/
//70. Climbing Stairs 
// reccursion
// recursion Tc = O(2 power n);

import java.util.*;

public class E31 {
    public static int countWays(int n){
        if(n==0){
             return 1;
        }  

        if(n< 0){
            return 0;
        }

        return  countWays(n-1) + countWays(n-2);
        
    }
   
    public static void main(String[] args) {
    int n=5;
  
    System.out.println("The climbing Stairs : " +countWays(n));
   }    
}
