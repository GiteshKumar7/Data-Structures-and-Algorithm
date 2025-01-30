
// convert binary to deccimal code
import java.util.*;

public class A61 {

     public static void BinToDec(int binNum) {
          int pow = 0;
          int dec = 0;

          while (binNum >0) {
               int lastdigit = binNum % 10;
               binNum = binNum / 10;
               dec = dec + ((int) Math.pow(2, pow)) * lastdigit;

               pow++;
          }
          System.out.println("the bin values " + binNum + " is converted to " + dec);

     }


     public static void main(String args[]) {

          Scanner sc = new Scanner(System.in);
          System.out.println("enter a N :");
          int binNum = sc.nextInt();

          BinToDec(binNum);

     }

}
