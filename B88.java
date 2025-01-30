// Recursive algrithms

public class B88 {

   public static int power( int a , int n){

      if( n==0){
         return 1;
      }

      return a * power(a, n-1);
   }
   
   public static void main(String args[]){

        int x=power(3,2 );
        System.out.println(x);

   }    
}
