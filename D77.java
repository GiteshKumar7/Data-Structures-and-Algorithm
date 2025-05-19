// subarray sum equal to k
// Tc->o(1)

import java.util.*;
public class D77 {
    public static int SubArraySumEqualToK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int count = 0;

        map.put(0, 1);

        for (int j = 0; j < arr.length; j++) {
            prefixSum += arr[j];// sum[j]

            if (map.containsKey(prefixSum - k)) {
                count+=map.get(prefixSum-k);
            }
          map.put(prefixSum,map.getOrDefault(prefixSum, 0)+1);
        }
        return count;

    }

    public static void main(String[] args) {

        int arr[] = { 2, 1, 3 };
        int k = 3;

        int sum = SubArraySumEqualToK(arr,k);
        System.out.println(sum);
    }

}
