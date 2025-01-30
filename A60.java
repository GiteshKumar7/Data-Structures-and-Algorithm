//print all prime in range  
import java.util.*;
public class A60 {

   public static boolean  isPrimeOrNot(int n){
 
  boolean b = true ;
     if(n==2){
       return b;
      
     }
     for(int i=2; i<=Math.sqrt(n); i++){
     if(n%i==0){
        return false;
     }
     }
     return b;

   }

    public static void isprimeNumberRange(int n){
        for(int i = 2 ; i<=n; i++){
            if(isPrimeOrNot(i)){
                 System.out.print(i+ " ");// if prime 
            }
        }

    }



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter N value ");
        int n = sc.nextInt();
        isprimeNumberRange(n);
        
    }
    
}
