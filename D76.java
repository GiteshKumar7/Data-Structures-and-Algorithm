// largest subarray with sub zero
//Tc -> O(n)

import java.util.*;

public class D76 {

    public static void main(String[] args) {
        int arr[] = { 15, -2, 2, -8, 1, 7, 10, 23 };
        HashMap<Integer, Integer> map = new HashMap<>();

        // (sum, idx) -> pairs

        int sum = 0;
        int length = 0;

        for (int j = 0; j < arr.length; j++) {
            sum += arr[j];
            if (map.containsKey(sum)) {
                length = Math.max(length, j - map.get(sum));// j-i
            } else {
                map.put(sum, j);
            }

        }
        System.out.println("Largest subarray with sum zero :" + length);

    }

}
