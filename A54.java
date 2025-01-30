/// factorail of anumber using function and 
// call by reference 
import java.util.*;

public class A54 {

    public static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("the factorail is :" +fact);
     return ;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N:");
        int n = sc.nextInt();

       // int facto =
       factorial(n);
       // System.out.println("the factorail is  :" + facto);


    }

}
