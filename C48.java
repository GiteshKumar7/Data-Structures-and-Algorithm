//leetcode 287 Find the duplicate number
//https://leetcode.com/problems/find-the-duplicate-number/

import java.util.HashSet;

public class C48 {
   
    public static int duplicateNumber(int arr[], int n){

    HashSet<Integer> s= new HashSet<>();
      for( int i: arr){
        if(s.contains(i)){
            return i;
        }
        s.add(i);
      }
    return -1;

    }

    public static void main(String[] args) {
        int[] arr= {1,3,4,2,2};
        int n= arr.length;

        int dupNumber= duplicateNumber(arr,n);
        System.out.println(dupNumber);
    }

}
