//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

// Next Greater Element using the arrayList

import java.util.*;
public class C49 {
    public static ArrayList<Integer>  NextGreaterElement(int arr[], int n){
    
 ArrayList<Integer> result= new ArrayList<>();
        for(int i =0; i<n; i++){
            int j=i+1;
            while(j<n){
                if(arr[j]>arr[i]){
                result.add(arr[j]);
                    break;
                }  else
                 j++;
             }
             if(j==n)
             result.add(-1);
          }
          return result;    
    }

 public static void print(int arr[], int n){
    for(int i=0; i<n; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
    }


    public static void printList(ArrayList<Integer> nextGreater){
       for(int list:nextGreater )  {
      System.out.print(list +" ");
    }
   System.out.println();
}
    public static void main(String[] args) {
        
    int arr[]= {6,8,0,1,3};
    int n= arr.length;

      

  print(arr, n);
    ArrayList<Integer> nextGreater=NextGreaterElement(arr,n);
    printList(nextGreater);

    }
}
