// call by reference and call by value 
import java.util.*;
public class A52 {

    public static void swap(int a , int b){
        int temp;
       temp=a;
       a=b;
       b=temp;
       System.out.println("after swapping a :" +a);
       System.out.println("after swapping b :" +b);
       
    return;

    }


    public static void main(String arrgs[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter a number ");
   int a = sc.nextInt();
   System.out.println("Enter another number ");
   int b = sc.nextInt();

   System.out.println("before swapping a :" +a);
   System.out.println("before swapping b :" +b);
   
       swap(a,b);
      
       

    }
    
}
