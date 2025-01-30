import java.util.*;

public class A29 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter A values :");
        int a = sc.nextInt();
        System.out.println("enter B values :");
        int b = sc.nextInt();

        System.out.println("enter symbols");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case '+':
                a = a + b;
                System.out.println( "the addition :"+a);
                break;

            case '-':
                a = a - b;
                System.out.println("the subtract :"+  a );
                break;

            case '*':
                a = a * b;
                System.out.println("the mmulti :"+a);
                break;

            case '/':
                a = a / b;
                System.out.println("the division :"+ a);
                break;

            default:
                a = a % b;
                System.out.println( "the modulo :" +a);

        }

    }

}
