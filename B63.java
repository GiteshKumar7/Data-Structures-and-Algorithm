//check if a Given number is sorted or not usning recursion
// 1 2 3 4 5

public class B63 {

     public static boolean isSorted( int arr[], int i){
        // base case
        if( i ==arr.length-1){ // base case if it run from i to arr.length-1 that mean its a sorted arraay
            return true;
           }
      
        if( arr[i]>arr[i+1]){
            return false;
           }
      
       return isSorted(arr, i+1);

     }

    public static void main(String[] args) {
        int arr[]= { 1,2,3,4,5};
        System.out.println(isSorted(arr, 0));
    }
    
}
