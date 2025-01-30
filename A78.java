// recursive binary search code and explanation 

public class A78 {
    public static int recursiveBinarySearch(int arr[], int low, int high, int key) {
        int mid = (low + high) / 2;

        while (low <= high) {

             if (arr[mid] == key) {
                return mid;
            }

            if (arr[mid] > key) {
                return recursiveBinarySearch(arr, low, mid - 1, key);
            } else {
                return recursiveBinarySearch(arr, low + 1, high, key);

            }

        }
        return -1; // not found then

    }

    public static void main(String args[]) {
        int arr[] = { 1, 3, 5, 7, 9, 11, 13, 15 };
        int n = arr.length;

        int key = 5;
        int low = 0;
        int high = arr.length - 1;

        int value = recursiveBinarySearch(arr, low, high, key);

        if (value == -1) {
            System.out.println("Element is not found in array ");
        } else {
            System.out.println("element is found at index : " + value);
        }

    }
}
