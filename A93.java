// code for bubble sort in java
//TC =O(n2);

import java.util.Arrays;

public class A93 {
     // function call for the bubble sort 
    public static void bubblesort(int arr[]) {
        int swap =0;
        for (int i = 0; i <arr.length - 1; i++) {
          
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
        // swap if found greater at j position than j+1
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
          
        }
       System.out.println("the number of the swap needed " +swap);
 }

    public static void show(int arr[]) {
        int n = arr.length;
     //   for (int i = n-1; i>=0; i--) {
        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]  +" ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int arr[] = { 1,7,3,4,5 };
        System.out.println(Arrays.toString(arr));

        bubblesort(arr);
        show(arr);
        System.out.println(Arrays.toString(arr));

    }

}
