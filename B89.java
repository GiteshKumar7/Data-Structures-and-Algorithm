//Backtracking in Arrays
public class B89 {
    
     public static void changeArray(int arr[], int i, int val){
   
  // base case array
   if(i==arr.length){
     printArray(arr);
    return;
   }

 // recursion(kaam)
    arr[i]= val;
    changeArray(arr, i+1, val+1);
     arr[i]=arr[i]-2;

   }

   // just to print the array
public static void printArray(int arr[]){
    for( int i =0; i<arr.length; i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
}

    public static void main(String Args[]){
   int arr[]= new int[5];

   changeArray(arr,0,1);

   printArray(arr);





    }
}
