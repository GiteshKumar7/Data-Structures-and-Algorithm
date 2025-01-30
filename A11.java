import java.util.*;

public class A11 {
    public static void main(String[] args) {
        
        byte b= 4;
        char c= 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;



        //  int   d1 = (int )(d + f + i + s + c + b );// type casting of type promotion 
        //  System.out.println("the answer : "+ d1);
      

         double   d2 =  d + f + i + s + c + b ;// type promotion 
         System.out.println("the answer : "+ d2);
      



    }
    
}
