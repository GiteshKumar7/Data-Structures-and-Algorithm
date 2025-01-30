//https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

// Next Greater Element using the array

public class C50 {
  public static int[] NextGreaterElement(int arr[], int n ){

    for( int i=0; i<n;i++){
        int j = i+1;
        while(j<n){
           if(arr[j]>arr[i]){
            arr[i]=arr[j];
            break;
           } 
           j++;
        }
        if(j==n){
            arr[i]=-1;
        }
       
    }
    return arr;
  }


  public static void Print(int arr[], int n){
    for( int i=0; i<n; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }

    public static void main(String[] args) {
           
    int arr[]= {6,8,0,1,3};
    int n= arr.length;

    Print(arr, n);
    int[] NextGreater= NextGreaterElement(arr, n); 
    Print(NextGreater,n);

    }
    
}
