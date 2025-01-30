// Given an integer array of size N, 
// you have to find all the occurrences (indices) of 
// a given element (Key) and print them. Use a recursive 
// function to solve this problem.
// Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
// Sample Output: 1 5 7 8 (indices)

public class B77 {
     public static int findOccurances(int arr[], int key, int index,int arr1[],int count ){
        
        if( index==arr.length){
            return count;
        }

        if(arr[index]==key){
            arr1[count]=index;
            System.out.println(arr1[count]);
            count++;
        }

        return findOccurances(arr, key, index+1, arr1, count);

     }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 6, 2, 7, 2, 2};  // Example array
        int key = 2;  // Element to search for
        int[] arr1= new int[arr.length];  
        
        int occurrences= findOccurances(arr, key, 0, arr1, 0);
  

       // traversal in arr1 having occurance of key wih their index
 for( int i=0; i<occurrences; i++){
    System.out.print(arr1[i]+ " ");
 }

    }
    
}
