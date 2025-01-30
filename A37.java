//keep enterrinng the element till the user enter the multiple of 10
import java.util.*;

public class A37 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
      
        do {
            System.out.print("Enter a Number ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                break;
            }
            System.out.println("the value :" + n);

        } while (true);

    }

}
