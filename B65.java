
// check for a number is present in or not using binary seaaarch in sorted array only 

// using method and function    
    public class B65 {

        public static int firstOccur(int arr[], int key) {
    
            int l=0 ;
             int h =arr.length-1;
                      // base casse
                   while(h>=l) {
         
                     int mid =( l + h )/ 2;
         
                     if (arr[mid] == key) {
                         return 1;
                                                      
                     } else if (arr[mid] > key) {
                         h = mid-1;
         
                     } else {
                         l = mid+1;
                     }
         
                    
                 }
                
                 return -1;
             }
       
        public static void main(String args[]) {
    
            int arr[] = {1, 2, 3, 4, 6};// only possible in sorted array
            int key =6;
            int m =firstOccur(arr, key);// calling using class name 
              System.out.println(m);
        }
    
    }