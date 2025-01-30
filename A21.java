// practice questions 4 
import java.util.*;

public class A21 {

    public static void main(String A[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  first number ");
        int a = sc.nextInt();
        System.out.println("enter a second number ");
        int b = sc.nextInt();

          boolean  bool = (a>b ) ? true :  false ;
          System.out.println( " hello boolean "+  bool);

        int x = (a > b) ? a : b;
        System.out.println(x);

    }
}
