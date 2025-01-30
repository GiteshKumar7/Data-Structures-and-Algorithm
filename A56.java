//function overlaoding using no of parameter
import java.util.*;

public class A56 {

    // addition of two number
    public static int sun(int a, int b) {
        return a + b;
    }

    // addition of three number
    public static int sun(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String args[]) {

        int x = sun(22, 3, 3);// having three parameter with same function name 
        int y = sun(2, 4);// having two parameter
        
        System.out.println(x);
        System.out.println(y);

    }

}
