// optimised code for isprime or not 
import java.util.*;

public class A59 {

    // public static int isprimeOrNot(int n) {
    // int arr = 1;

    // for (int i = 2; i < n - 1; i++) {
    // if (n % i == 0) {
    // return -1;
    // }

    // }
    // return arr;

    // }

    public static boolean isPrimeOrNot(int n) {
        boolean flag = true;

        if(n==2){
        return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = false;
                System.out.println("Not prime ");
                break;
            }
        }
        return flag;

    }


   

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter N value ");
        int n = sc.nextInt();

        // int m = isPrimeOrNot(3);// int return type only
        // System.out.println(m);

        boolean b = isPrimeOrNot(n);// return type is boolean 
        System.out.println(b);// boolean data types is needed 
    
         
        isprimeNumberRange(n);
    }

}
