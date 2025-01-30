// check a  number is prime or not 
// prime or composite 
import java.util.*;

public class A39 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("2 is prime number");
        } else {
            boolean isprime = true;

            for(int i =2 ; i<Math.sqrt(n); i++){
            // for (int i = 2; i < n; i++) {
                if (n % i == 0) { // i is not equal to   1 and n
                    isprime = false;
                    System.out.println("composite number");
                }
            }

            if (isprime == true) {
                System.out.println("n is prime . ");
            } else {
                System.out.println("n is not prime.");
            }

        }

    }

}
