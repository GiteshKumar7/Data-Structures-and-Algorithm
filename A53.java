import java.util.*;
public class A53 {


public static int   multiply(int a , int b){
    System.out.println("the result is :" + a*b ); // right 
     return a *b;
    
}

    public static void main(String args[]){
 Scanner sc = new Scanner(System.in);
   System.out.println("Enter a ");
   int a = sc.nextInt();
   System.out.println("Enter b ");
   int b = sc.nextInt();


 int result= multiply(a,b);
 System.out.println("the result is :" + result );// right 

    }
    
}
