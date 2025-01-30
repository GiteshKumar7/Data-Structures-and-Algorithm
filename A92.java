// array having duplicate return true 
// array not havving suplicate return false
//TC=O(n)
// using Two pointer method

import java.util.*;
public class A92 {
    public static boolean containsDuplicate(int arr[]){
        
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
      return false;

    }

   

    public static void main(String args[]){
int arr[]= { 1, 2, 3, 1};
      boolean  bool = containsDuplicate(arr);
     System.out.println(bool);

    }
}
