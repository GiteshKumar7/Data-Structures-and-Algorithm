//checking that a number occurs twice or not
// check ;
import java.util.*;
public class A88 { 

   public static boolean twiceArray(int arr[]){

     int arr1=0; 
     for(int i=1; i<arr.length; i++){
        if(arr[i]==arr[arr1+1]){
            arr1++;  
        }
        if(arr1>2){
          return false;
        }else{
          System.out.println(arr1 );
        }
      }
     return arr1==1;

   }
   public static void main(String args[]){
        int arr[]= {1,2,3,1,3};
         Arrays.sort(arr);
        boolean b= twiceArray(arr);
      System.out.println(b);
    }
    
}
