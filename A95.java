// insertion sort in java
// 
import java.util.*;
public class A95 {

    public static void  insertionsort(int arr[]){

   for(int i=1; i<arr.length; i++){
    int curr =arr[i];// temporary memory
    int prev = i-1;//0
  
    while( prev >=0 && curr <arr[prev]){
        arr[prev+1] = arr[prev];
        prev--;
       }
       arr[prev+1]=curr;
}
   } 
    public static void main(String args[]){
      int arr[]= {4, 3, 1, 5,1};
      System.out.println(Arrays.toString(arr));
      insertionsort(arr);
      System.out.println(Arrays.toString(arr));

   }
    
}
