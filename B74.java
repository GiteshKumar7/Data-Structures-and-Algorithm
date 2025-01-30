// Friends pairing problem 
// choice -> single or  paired   
//  result (int) = different ways

public class B74 {
        public static int friendsPairing( int n){
        
            // Base case 
            if(n==1 || n==2){
                return n;
            }
   
            int single= friendsPairing(n-1);// to get the single remianing n-1

            int paired = (n-1) * friendsPairing(n-2);
          
          
            int totways= single + paired;
            return totways;
        }


    public static void main(String[] args) {
    
        System.out.println(friendsPairing(3));
   }    
}
