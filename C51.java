//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

// Next Greater Element using the stack
import java.util.*;

public class C51 {
 public static int[] nextGreater(int arr[]){

    Stack<Integer> s= new Stack<>();
     int n = arr.length;

  int w[]= new int[arr.length];

   //for(int i= n-1; i>=0; i--){
   for(int i= 0; i<=n-1; i++ ){
       while(!s.isEmpty() && arr[s.peek()] <=arr[i]){
        s.pop();
       }
   
       if(s.isEmpty()){
        w[i]=-1;
       }else{
          w[i]=arr[s.peek()]; 
       }
       s.push(i);
   }
    return w;
 }

 // print array of ext greater element
 public static void print(int[] arr){
    for( int i=0; i< arr.length; i++){
        System.out.print(arr[i] + " ");
    }
    System.out.println();
 }
 

    public static void main(String[] args) {
        
  int arr[]= {6,8,0,1,3};

 print(arr);
  int greater[]= nextGreater(arr);    
   print(greater);

    }
}
