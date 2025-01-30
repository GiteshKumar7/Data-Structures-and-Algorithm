// finding the od or even using bitwise and (&)  operator 
import java.util.*;
public class B26 {
    public static void oddeven(int n){
       
        int bitmask=1;
         if((n & bitmask )==0){
            System.out.println(n +" is is a even number");
         }else{
            System.out.println(n +" is a odd number");
         }
    }

    public static void main(String args[]){
      oddeven(3);
      oddeven(4);
      oddeven(3);
      oddeven(8);
    }
    
}
