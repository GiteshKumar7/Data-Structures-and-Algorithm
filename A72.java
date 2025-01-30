// finding min and max using call by value 
import java.util.*;

public class A72 {


    public static void main(String args[]) {

        // creating sacnner class
        Scanner sc = new Scanner(System.in);

        // taking size of an array
        System.out.println("Enter the size of the array ");
        int n = sc.nextInt();

        // declare of an array
        int arr[] = new int[n];

        // taking input of an a array
        System.out.println("Enter cvalues till n :");
        for (int i = 0; i < n; i++) {
            
            arr[i] = sc.nextInt();
        }

        int max =  arr[0];
        int min = arr[0];

        for(int i=0; i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            
            if(arr[i]<max){
                min=arr[i];
            }
        }
        System.out.println("the maximum is " + max );
        System.out.println(" the minimum is " + min);

    }

}
