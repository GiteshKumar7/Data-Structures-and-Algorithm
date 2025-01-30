
// print sum of first n natural numbers 
import java.util.*;

public class A32 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter  n values :");
        int n = sc.nextInt();

        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
       }
        System.out.println(sum);

    }

}
