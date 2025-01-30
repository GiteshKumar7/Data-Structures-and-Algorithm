//  Multiplication table of N givene bu user

import java.util.*;

public class A43 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println( n +" x " + i + "  =  "+ i * n );
        }

    }

}
