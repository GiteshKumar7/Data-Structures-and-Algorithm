// findinfg average of the number using the method and function
import java.util.*;
public class A63 {
    
    public static float  average(float a , float b, float c){
    return (a+b+c)/3;
    }

    public static  void main(String arg[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value ");
        float a= sc.nextFloat();
        System.out.println("enter b value ");
        float b= sc.nextFloat();
        System.out.println("enter c value ");
        float c= sc.nextFloat();

       int solution =(int) average(a, b, c);
  System.out.println("  the average of the  three number :"+ solution);

    }
    
}
