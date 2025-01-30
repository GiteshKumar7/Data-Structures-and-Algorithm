// to check a number is palindrome or not 
import java.util.*;

public class A65 {
    public static boolean ispalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int lastdigits = n % 10;// reaminder of number
            reversed = reversed * 10 + lastdigits;// inorder to get reverse of anumber
            n /= 10;

        }
       
       
        System.out.println("revversed value is " + reversed);
        //  if(n==reversed){
        //     return true;
        //  }else{
        //     return false;
        //  }
        return original==reversed ;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        if (ispalindrome(n)) {
            System.out.println(n + " is a palinedrone number ");
        } else {
            System.out.println(n + " Not a plaine rone number ");
        }
    }

}
