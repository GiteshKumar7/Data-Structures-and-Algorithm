// sum of digits of a number
//121 =sum of all number is 4
import java.util.*;
public class A67 {

    public static boolean sum(int n){
   int sum =0;
     for(int i =0 ;i<=n; i++){
      int lastdigits= n%10;// erwmainder
      sum = sum +lastdigits;
      n/=10;
     }
     System.out.println("the sum  of digits is "+ sum);
      return true;

  }

    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
     
    System.out.println("Enter a nuumber :");
    int n = sc.nextInt();
      sum(n);
    }

}
