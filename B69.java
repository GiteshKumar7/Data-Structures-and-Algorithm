//finding the last occurances of an elemennts in array   

public class B69 {

   public static int lastOccurances(int arr[], int key ,int i){
    
    if(i == arr.length) { // Base case: end of the array
      return -1; // If we reach the end, return -1 (key not found)
  }


  int isFound = lastOccurances(arr, key, i + 1); // Recursive call for the next element
  
  if(  arr[i]==key  && isFound==-1){
    return i;
}

  return isFound;

   }

    public static void main(String args[]){
     int arr[]= {8,3,6,9,5,10,2,5,3};
     int key =5;
      int last =  lastOccurances(arr, key,0);
    System.out.println(last);
    }
    
}
