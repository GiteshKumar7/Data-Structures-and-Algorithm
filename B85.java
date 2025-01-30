// leetcode 36
// Search in rotated sorted array

public class B85 {

    public static int search( int arr[], int tar, int si , int ei){
    // basse case
    if( si>ei){
        return -1;
    }


   // mid 
   int mid = si+ (ei-si)/2;

   // check whether target lies on the mid  of the array
   if( arr[mid]==tar){
    return mid;
   }

   //  on line 1
   if(arr[si]<=arr[mid]){
       // left side of line
       ///case a: left side
       if(arr[si]<=tar && tar <=arr[mid]){
          return search(arr, tar, si, mid-1);
       }else{
        // case b: wwhole right side
        return search(arr, tar, mid+1, ei);
       }

   }else{
      // one line 2
      // case c: right side
      if( arr[mid]<=tar && tar <=arr[ei]){
        return search(arr, tar, mid+1, ei);
      }else{
        // case d : whole left
        return  search(arr, tar, si, mid-1);
      }

   }


    }



    public static void main( String args[]){
       int arr[]= {4,5,6,7,0,1,2};
       int target= 0;

       int tarIdx=search(arr,target,0,arr.length-1);
    System.out.println(tarIdx);


    }
    
}
