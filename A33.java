
// reverse of a number 
import java.util.*;

public class A33 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" enter a figures :");
        int n = sc.nextInt();

        int digits = 0;
        while (n > 1) {

            digits = n % 10;
            System.out.print(digits + " ");
            n = n / 10;

        }

    }

}
