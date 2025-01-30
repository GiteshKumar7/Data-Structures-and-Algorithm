import java.util.*;

public class A50 {
    public static void add() {
        // int sum = a+b;
        // System.out.println(sum);// element of method can acessed through here only
        // not by outside
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A ");
        int a = sc.nextInt();
        System.out.println("Enter B ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("the sum is "+sum);
        return  ;
    }

    public static void hello() {
        System.out.println("hello world ");
        System.out.println("hello Gitesh ");
        return;
    }

    public static void main(String args[]) {
       

        add(); // function call from main to function
        
        hello();// function call

    }

}
