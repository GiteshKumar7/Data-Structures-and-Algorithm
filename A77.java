// code for binary search 
// Iterative binary  search  function to find an element in a sorted array

public class A77 {

    public static int binarySearch(int arr[], int k) {
        int mid = 0;
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) { // running till low equal to high
            mid = (low + high) / 2; // alway return mid of low and high

            if (arr[mid] == k) { // array of mid equal to key value
                return mid; // return mid kar
            }

            if (arr[mid] > k) { // agar arraof mid barka hai key value seh
                high = mid - 1; // tab higj ko mid -1 set kar
            } else {
                low = mid + 1; // na ta low k low = mid + 1 set kar
            }

        }
        return -1; // agar lement ani hau tab -1 return kar int
    }

    public static void main(String args[]) {

        int arr[] = { 1, 3, 5, 6, 7, 8, 9, 10 };
        int n = arr.length;
        int k = 8;
        int result = binarySearch(arr, k);
        if (result == -1) {
            System.out.println("element is not found ");
        } else {
            System.out.println("ellement is found at index : " + result);
        }

    }

}
