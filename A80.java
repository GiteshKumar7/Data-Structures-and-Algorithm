// Reverse of a array using swapping of an elements 
import java.util.*;
public class A80 {
     public static void reversedArray(int arr[] ){
    
        int low =  0;
        int high = arr.length -1;

        while(low<high){
              //
            int temp =0;
             temp= arr[low];
            arr[low]= arr[high];
            arr[high]= temp;
            
            low++;
            high--;
        }
     }

  public static void main(String args[]){
   
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the size of an array ");
    int n =sc.nextInt();
    int arr[] = new int[n];
   
    System.out.println("enter the elements of an array");
    for(int i=0; i<arr.length; i++){
      arr[i]= sc.nextInt(); // takig sorted  input from users
    }

    System.out.println("original array : "  + Arrays.toString(arr));

    reversedArray(arr);
    System.out.println();

     System.out.println("Reversed array : " + Arrays.toString(arr));
     //// doing this also great 
    //  for(int i =0 ; i<arr.length; i++){
    //     System.out.print("the reversed of an array  :" + arr[i] + " ");
    //  }


  }
    
}
