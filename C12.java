//leetcode 896 -> Monotonic incresing and monotonic decresing 

public class C12 {

    public static boolean isMonotonic(int arr[]) {
   

        boolean isIncreasing = true;
        boolean isDecreaing = true;

        if(arr.length==1){
            return true;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isIncreasing = false;
            } else if (arr[i] < arr[i + 1]) {
                isDecreaing = false;
            }
        }

        return isIncreasing || isDecreaing;

    }

    public static void main(String args[]) {
        // monotonic increaing -> { 1,2,3,3,4}
        // Monotonic Decraing -> {4,3,3,2,1}

        int arr[] = { 1, 2, 3, 3, 4 };

        System.out.println(isMonotonic(arr));

    }
}
