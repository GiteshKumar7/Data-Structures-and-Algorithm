// set the ithe bit value
// using the Binary left(<<) shift and binary OR(|) operator 

import java.util.*;

public class B29 {

    public static int setIthBit(int n, int i) {
        int bitmask = 1<<i;
        return n | bitmask;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N :");
        int n = sc.nextInt();

        System.out.println("Enter a ith  I :");
        int i = sc.nextInt();

        System.out.println("");
        int s= setIthBit(n, i);
        System.out.println("the updated value is " + s);

    }

}
