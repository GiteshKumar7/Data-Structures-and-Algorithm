// checking binary search using recursion 

 class solution{
    public static int binarySearch(int arr[], int low, int high, int key) {
        // base case : element not found
        if (low > high) {
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == key) {
            return mid;
        }
        // for left half
        if (arr[mid] > key) {
            return binarySearch(arr, low, mid - 1, key);
        }
        // for right half
        else {
            return binarySearch(arr, mid + 1, high, key);

        }

    }

 }

public class B66 {

   
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,6};
        int index = solution.binarySearch(arr, 0, arr.length - 1, 3);
        System.out.println(index);//index 2
    }

}
