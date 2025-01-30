// some basic operation of function and methods on MAth functions
import java.util.*;
public class A66 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int a = sc.nextInt();
        System.out.println("Enter b number :");
        int b = sc.nextInt();
        System.out.println("Enter c number :");
        int c = sc.nextInt();

        /// to get power of one over anothe
        int  n =(int ) Math.pow(Math.pow(a,b),c);
        System.out.println("A power to B is " + n);
        
        // to get minimum of among a, b and  c
        int  m =(int) Math.min(a,Math.min(b,c));
        System.out.println("the minimum of the two number " + a + " and " + b + " and "+ c + " is " + m);

       // to get maximum of among a, b, and c
        int p = (int) Math.max(a,Math.max(b,c));
        System.out.println("the maximum of the thwo number " + a + " and " + b + " and "+ c + " is " + p);

  // to get the square root of a number  
        int  x = (int  )Math.sqrt(a);
        System.out.println("the square root of " + a + " is " + x );
     
      
       // int y = (int )Math.avg(a,b,c);

       // to get the absolute values of a number free from negitvity either in doulbe , float , long data types
       int r=(int) Math.abs(a);
       System.out.println("the absolute value of " + a + " is " + r);

    }
    
}
