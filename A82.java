// finding ne coppy of thw array 
// ading two arrray into new array 
import java.util.*;
public class A82 {
    public static int[]  ConcatArray(int arr1[], int arr2[], int  m, int n){
       
     int[] arr3= new int[n+m];
    //copy elements from arr1 to arr3
     System.arraycopy(arr1,0,arr3,0,n);

     // copy elements from arr2 to arr3
     System.arraycopy(arr2,0,arr3,n,m);
    
     return arr3;
    }


    public static void main(String args[]){
     int arr1[] = {1, 3, 5, 7};
     int arr2[]= {2, 4, 6, 8};

     
     int n = arr1.length;
     int m = arr2.length;  
     
     System.out.println("The Array 1 : " + Arrays.toString(arr1));
     System.out.println("The Array 2 : " + Arrays.toString(arr2));

     int[] concatedArray=  ConcatArray(arr1, arr2, m, n);
    System.out.println("the concatinated array :"+ Arrays.toString(concatedArray));



    }
    
}
