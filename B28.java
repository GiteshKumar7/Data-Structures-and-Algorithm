
//  Get the ith bit of the number in Bit manipulation
// using the binary shift(<<) and binary AND(&) operator
import java.util.*;

public class B28 {

    public static int getithbit(int n, int i) {

        int bitmask = 1 << i;

        if((n & bitmask) == 0){
            return 0;
        } else {
            return 1;
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N :");
        int n = sc.nextInt();

        System.out.println("Enter a ith  I :");
        int i = sc.nextInt();

        System.out.println("");
        int s= getithbit(n, i);
        System.out.println(s);

    }

}
