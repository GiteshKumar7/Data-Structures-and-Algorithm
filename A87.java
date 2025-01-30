
// removing the duplicate from array
// using two pointer pattern
import java.util.Arrays;

public class A87 {
    public static int[] removeDuplicate(int arr[]) {
        if (arr.length == 0) {
            return arr;// return null array
        }

        int Count = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[Count]) {// two pointer approach
                 Count++;
                arr[Count] = arr[i];// atke non duplicate into count
            }
        }
        return Arrays.copyOf(arr, Count + 1);

    }

    public static void main(String args[]) {
        int arr[] = { 2, 3, 2, 4, 5, 4 }; // to make sorted using arrays.sort(arrayName)
        Arrays.sort(arr);//2 2 3 4 4 5

        int arr1[] = removeDuplicate(arr);
        System.out.println(Arrays.toString(arr1));
    }

}
