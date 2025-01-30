// Quick sort for negative and  positive

public class B82 {
    // printing the shortest array
    public static void printArr( int arr[]){
      for( int i =0 ; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
      }
      System.out.println();
    }

     // partioning of an array 
      public static void quickSort(int arr[], int si, int ei){
           if( si>=ei){
            return ;
           }
       // partion the array and get the pivot index
           int pIdx =  partition(arr,si,ei);

           // recursively sort the left and right halves
           quickSort(arr,si, pIdx-1);
           quickSort(arr, pIdx+1, ei);

      }

      // partition of aan array
     public static int partition(int arr[], int si, int ei){
      
        int i = si-1;
        int pivot = arr[ei];
    
        for( int j =si ; j<=ei; j++){
            // for all elemnts except  last one ei
            if( arr[j]<pivot){
                i++;
                int temp = arr[j];
                arr[j]=arr[i];
                arr[i]= temp;
            }
         }
         // for getiing the pivot on the corect psotion
         i++;
         int temp = arr[ei];
         arr[ei]=arr[i];
         arr[i]= temp;
         return i; //  pivot index

      }
    public static void main(String args[]){
     int arr[]= {6,3,9,8,2,5};// for both -ve abd +ve
     System.out.println("Original array ");
     printArr(arr);

  quickSort(arr, 0, arr.length-1);
  System.out.println("Sorted array");
  printArr(arr);

    }
    
}
