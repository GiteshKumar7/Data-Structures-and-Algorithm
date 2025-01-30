// wap to find the first occurances of an element in array using recursion
// using    class, method and  recursion 
class solution{

    public  static int  firstOcc( int arr[], int i,int key){
        // base case 
    if( i==arr.length-1){// checking if we have reached to end or not
        return -1 ;
    }

    if(arr[i]==key){// only  for the first i=0 initially
       return i;
    }
       return firstOcc(arr, i+1, key);// all remaining

  }

}

public class B67 {
      
  public static void main(String args[]){

       int arr[]={8,3,6,9,5,10,2,5,3};
       int key = 3;
      int result = solution.firstOcc(arr, 0,key);
       System.out.println(result);
  }  
}
