// using prefixsum of subarray 
// min and max 
// TCO(n2)
public class A85 {
    public static void prefixSumArray(int arr[]) {
        int currSum = 0;
        int ts = 0;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int prefix[] = new int[arr.length];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];// adding elemnts and putting in prefix sum
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            int correctedSum = 0;
            for (int j = i; j < arr.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                ts++;
                if (currSum > max) {
                    max = currSum;
                }
                if (currSum < min) {
                    min = currSum;
                }

            }

        }
        System.out.println("the total subarray is "+ ts);
        System.out.println("the min sum of subarray " +min);
        System.out.println("the max sum of subarray " +max);



    }

    public static void main(String args[]) {
        int arr[] = {-1,2,8,-6,9};
        prefixSumArray(arr);

    }

}
