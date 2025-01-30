import java.util.*;

class grand { // class classname
  public static int add(int a, int b) {
        return a + b;
   }
   
   public static void hello(){
    System.out.println("hello sir ");
    System.out.println("hello sd sir ");
    return ;
   }
}

public class A51 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    int a = sc.nextInt();
    System.out.println("Enter b number ");
    int b = sc.nextInt();

    grand obj = new grand();
    int am = obj.add(a, b);
    System.out.println("The sum of product :" + am);

      
    obj.hello();
  }

}
