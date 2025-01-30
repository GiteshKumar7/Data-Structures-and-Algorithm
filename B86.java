//Apply Mergesort to sort an arrayofStrings.
//(Assumethatallthecharacters in all the Strings are in lowercase). (EASY

public class B86 {
  // merge function to merge right and left
  public static String[] merge(String[] left, String[] right) {

    String[] merged = new String[right.length + left.length];

    int i = 0;
    int j = 0;
    int k = 0;

    // compare and merege from both arrays
    while (i < left.length && j < right.length) {
      if ((left[i].compareTo(right[j])) <= 0) {
        merged[k++] = left[i++];
      } else {
        merged[k++] = right[j++];
      }
    }
      // copying reming elements
    while (i < left.length) {
      merged[k++] = left[i++];
    }

    while (j < right.length) {
      merged[k++] = right[j++];
    }

    return merged;
  }

  public static String[] mergeSort(String arr[]) {
    // base case
    if (arr.length <= 1) { // word conatins 1 elements
      return arr;
    }
    // spliting into two parts or halves
    int mid = arr.length / 2;
    String[] left = new String[mid];
    String[] right = new String[arr.length - mid];

    System.arraycopy(arr, 0, left, 0, mid);
    System.arraycopy(arr, mid, right, 0, arr.length - mid);
    
    // Recursively sort each half
    left = mergeSort(left);
    right = mergeSort(right);

    return merge(left, right);

  }

  public static void main(String[] args) {
    String[] arr = { "sun", "earth", "mars", "mercury" };
    System.out.println("printing before the merge sort :");
    
    for (String s : arr) {
      System.out.print( s + " ");
    }  
    System.out.println("\n");

    String[] sorted = mergeSort(arr);

    System.out.println("printing after the merge sort :");
    for (String s : sorted) {
      System.out.print( s + " ");
    }

  }

}
