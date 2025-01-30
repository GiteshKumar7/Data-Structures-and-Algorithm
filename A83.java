import java.util.*;

public class A83 {
    public static void printSubArray(int arr[]) {

        int ts = 0;
        System.out.println("All the subarray in the array possible :");
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + "  ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("the total subarray :" + ts);
    }

    public static void main(String args[]) {
        int[] arr = { 2, 4, 6, 8, 10 };
        printSubArray(arr);
    }

}
