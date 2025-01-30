// linear search code using function and method
// for inter data types 
import java.util.*;

public class A74 {

    public static int linearSearch(int arr[], int n, int k) {
        // int k = 22;
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                System.out.println("value find at index :" + arr[i]);
                // break;
                return i;
            } 
        }

       return -1;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array  :");
        int n = sc.nextInt();

        int arr[] = new int[n];
        System.out.println("enter all elemnet of n:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = 22;

        int result  = linearSearch(arr, n, k);

        if(result ==-1){
            System.out.println("value not found");
        }else{
            System.out.println("hello : " + result);
        }
      

    }

}
