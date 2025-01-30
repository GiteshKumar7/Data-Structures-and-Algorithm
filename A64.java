// cheeck  evenNum statement 
import java.util.*;

public class A64 {
    public static int evenNum(int n) {
        if (n == 2) {
            System.out.println("even " + n);
            return 1;
        }

        for (int i = 2; i <= n; i++){
            if (n%2==0) {
                System.out.println("even1 " + n);
                return 1;
            }
        }
        return -1;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a value : ");
        int n = sc.nextInt();
        int ne = evenNum(n);
        System.out.println(ne);
    }

}
