// binary coeffiecents
import java.util.*;

public class A55 {

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;

    }
    public static void BinCoff(int n, int r) {

        int a = factorial(n);
        int b = factorial(r);
        int c = factorial(n - r);

        int coeff = a / (b * c);

        System.out.println("the coefficent " + n + " and " + r + " is :" + coeff);
        return ;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N:");
        int n = sc.nextInt();
        System.out.println("enter  r:");
        int r = sc.nextInt();

        //int s = 
        BinCoff(n, r);
      //  System.out.println("the coeff :" + s);

    }

}
