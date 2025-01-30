
// inbult sort techinques in java
// inbult 
import java.util.*;

public class A96 {

    public static void show(Integer arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Integer arr[] = { 5, 4, 3, 1, 2 };
        // Arrays.sort(arr); // inbuilt sort
        // sorting possible from index from 0 to 2 butaa ends at 3
        // Arrays.sort(arr,0,3);

        // for collection we need to change int into Integer
        // reverse order sorting
        // object type data types == Integer
        // prmitive data type === int
         Arrays.sort(arr,Collections.reverseOrder());
      //   Arrays.sort(arr, 0, 3, Collections.reverseOrder());
        show(arr);

    }
}
