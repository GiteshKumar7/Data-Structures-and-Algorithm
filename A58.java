// check whether a number is prim or not ;
import java.util.*;

public class A58 {
    public static boolean isPrimeOrNot(int n) {

        if (n == 1) {
            return true;
        }

        if (n == 2) {
            return true;
        }
        // boolean isprime = true;
        for (int i = 2; i <= n-1; i++) {
            if (n % i == 0) {
                // isprime= false;
                System.out.println("Not prime number :" + n);

                // break;
                return false;
                // return isprime;
            }
        }

        // return isprime;
        return true;// this is ompulsory
    }

    public static void main(String args[]) {

        // System.out.println(isPrimeOrNot(3));

        Scanner sc = new Scanner(System.in);
        System.out.println("enter N value ");
        int n = sc.nextInt();

        boolean m = isPrimeOrNot(n);
        System.out.println(m);

    }

}
