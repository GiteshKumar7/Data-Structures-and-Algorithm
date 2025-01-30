// Modified Bubble sort

public class B87 {
    // just here to print the array
   public static void printArray(int arr[]){
    for( int i=0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
       }
       System.out.println();
    }

    public static void bubbleSort(int arr[]){
        
        for( int i =0 ; i<arr.length-1; i++){
            boolean isSwap= false;
            for( int j =0 ; j<arr.length-1-i ; j++){
               if(arr[j]>arr[j+1]){
                // swap
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                isSwap =true;// tracker whether swaapping is possible or not
               }
               }
               if(isSwap==false){
                System.out.println("hello");
                break;
              }

        }

    }
    public static void main(String args[]){
    int arr[] ={1,2,3,4,5,6};
    System.out.println("original array :");
      printArray(arr);

       bubbleSort(arr);
       System.out.println("sorted  array :");

       printArray(arr);
       for( int s: arr){
        System.out.print(s+" ");
       }

       System.out.println();
      

    }
}
