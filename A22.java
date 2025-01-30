// practice Questions 
import java.util.*;

public class A22 {
    public static void main(String a[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a  year :");
        int year = sc.nextInt();

        if ((year % 4 == 0) && (((year % 400 == 0) && (year % 100 == 0)))) {
            System.out.println("Leap year is : " + year);
        } else {
            System.out.println(" not a leap year" + year);
        }


    
     } 
  }