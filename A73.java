// finding second min and second max;
// after sorting the array with the help of array,sort(arrayname);

import java.util.*;
public class A73 {
   
 
    public static void secondMinAndMax(int arr[], int n ){

     if(n <2){
        System.out.println("array does not have enough elements ");
        return ;
     }

     Arrays.sort(arr);
     for(int i =0 ; i<n ; i++){
     System.out.print(arr[i]+ " ");
     }

     System.out.println(" ");
    

        int secondMin = -1;
        int secondMax = -1;

        for(int i = 0 ; i<n ; i++){
          if(arr[i]!=arr[0]){
                secondMin= arr[i];
                break;
          }
        }

       for(int i =n-2; i>=0  ; i--){
        if(arr[i]!=arr[n-1]){
            secondMax=arr[i];
            break;
        }
       }

        System.out.println(" second min is " + secondMin);
        System.out.println(" second max is " + secondMax);
}

        public static void main(String args[]){
    
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array : ");
            int n = sc.nextInt();
        
            int arr[] =  new  int[n];
            System.out.println("enter an element till n :");
             
            for(int i =0 ; i<n; i++){
                arr[i]= sc.nextInt();
            }
  
            secondMinAndMax(arr,n );



    }
    
}
