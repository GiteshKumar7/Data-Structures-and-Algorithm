// factorial of  a number given by th e user 
import java.util.*;
public class A42 {
    public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
int fact =1;
System.out.print("enter a number  :");
   int n = sc.nextInt();

   for(int i =1 ; i<=n ;i++){
     fact = fact * i;
   }
    System.out.println("the factorail of " +  n + "is "+ fact);

    }
    
}
