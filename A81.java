// finding the pair in an array 

import java.util.*;
public class A81 {

    public static void pairArray(int arr[]) {
        int tp=0;
        System.out.println("All the pair element of an array : ");
     
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + curr + "," + arr[j] + ")");
                tp++;
            }
            System.out.println();

        }
        System.out.println("the total pair  is "+ tp);

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of  any array ");
        int n = sc.nextInt();

        int arr[] = new int[n];// arrray declareration

        System.out.println("enetr all elements of an array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("the original array : " + Arrays.toString(arr));

        pairArray(arr);

    }

}
