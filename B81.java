// merge sort  
// for postive and negative

public class B81 {
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2;// midindex of an array
        mergeSort(arr, si, mid); // left part divide
        mergeSort(arr, mid + 1, ei);// right part divide

        merge(arr, si, mid, ei);// to merger left and right

    }

    public static void merge(int arr[], int si, int mid, int ei) {

        int temp[] = new int[ei - si + 1];
        int i = si; // iterator for left
        int j = mid + 1;// iterator for right
        int k = 0; // iterartor for temp array

        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];

                i++;
            } else {
                temp[k] = arr[j];
            
                j++;
            }
            k++;
        }

        // in casse of leftover elements in left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;k++;
        }

        // in case of leftover elements in right part
        while (j <= ei) {
            temp[k] = arr[j];
            j++; k++;
        }

        for (k = 0; k < temp.length; k++) {
            arr[si + k] = temp[k];

        }

    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, -2, 8 };
        System.out.println("Original array");
        printArr(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("sorted array");
        printArr(arr);

    }
}
