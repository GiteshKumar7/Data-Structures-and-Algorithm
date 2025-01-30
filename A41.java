// write a program in java to take a set of integers 
//and print sum of odd and even digit separetley 
import java.util.*;

public class A41 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

      
        int evensum = 0;
        int oddsum = 0;
      
        System.out.print("enter  a set of integer( enter -1 to stop ): ");

        while (true) {
          
            int n = sc.nextInt();
            if (n == -1) {
                break;
            }

            if (n % 2 == 0) {
                evensum += n;
            } else {
                oddsum += n;
            }

        }
        System.out.println("the even sum :" + evensum);
        System.out.println("the odd sum :" + oddsum);

    }

}
