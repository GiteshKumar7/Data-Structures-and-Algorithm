// checking the the number is odd or even
//using bitwise OR (|)

import java.util.*; 

public class B25 {
    public static void Oddeven(int n){
   int bitmask=1;

   if((n | bitmask ) > n){
     System.out.println("even");
   }else{
    System.out.println("odd number");
   }
        
    }

    public static void main(String args[]){
        Oddeven(3);
        Oddeven(3);

        Oddeven(4 );



    }
    
}
