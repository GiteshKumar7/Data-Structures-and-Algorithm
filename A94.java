
// selection sort code 
//TC= O(n2)
// two pointer
import java.util.*;

public class A94 {

    public static void selectionsort(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minpos = i;// minimum position is assumbed at i
            for (int j = i + 1; j < n; j++) {
                if (arr[minpos] < arr[j]) {// > for asc and < for desc
                    minpos = j;// element at j is smaller than element at minpos
                }

            }
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }

    }


    public static void show(int arr[]){
        for(int i=0 ; i<arr.length; i++){
        System.out.print(arr[i] + " ");
        } 
        System.out.println();
    }

    public static void main(String args[]) {
        int arr[] = { 3, 4, 1, 2, 5 };
        System.out.println(Arrays.toString(arr));
        selectionsort(arr);
        show(arr);
        System.out.println(Arrays.toString(arr));

    }

}
