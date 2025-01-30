// Reverse of an array using two different array 
import java.util.*;
public class A79 {
     public static int   reverseArray(int arr[], int high, int arr1[]){
         
          for(int i=0; i<arr.length; i++ ){
            arr1[i]= arr[high];
            high--;
            System.out.print(arr1[i]+ " ");
        

          }
     return 1 ;
    }

    public static void main(String args[]){
        int arr[]=  {1, 3, 5, 7, 9, 11, 13, 15};

        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
       }
       System.out.println();

        int n =arr.length;

        int arr1[]= new int[n];

        int high= arr.length-1;

      int m = reverseArray(arr, high , arr1);
       System.out.println("the array is   reversed ");

    }
    
}
