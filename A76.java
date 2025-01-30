// finding largest  and smallest in array  
import java.util.*;

public class A76 {
  public static int  getlargest(int arr[]){
  
    int largest= Integer.MIN_VALUE;// -infinnity
    int smallest = Integer.MAX_VALUE;

    for(int i =0 ; i<arr.length; i++){
        if(arr[i]>largest){
            largest= arr[i];
            // System.out.println("the largest value is"+ largest);
            // return largest;
        }
        
        if(arr[i]< smallest){
            smallest= arr[i];

        }
        }
        System.out.println("the smallest value : "+ smallest);
         return largest;
  }
    public static void main(String args[]){
    int arr[]= {3 , 5 , 7 ,5 , 2 , 9 , 1 , 4 , 6 , 8};
    
        int p =getlargest(arr);
        System.out.println("the largest : " + p);
    }
}
