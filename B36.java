// xor of same number is always zero 
public class B36 {

    // fuction for checking the value of x*x;
  public static boolean isvalue(int n){
     return (n^n)==0;
   } 


   // function for swappping two number using  without third variable
   public static void swapping(int x, int y){
     x=x^y;
     y=x^y;
     x=x^y;
    System.out.println(x);
    System.out.println(y);


   }

    public static void main(String args[]){
        // fuction for checking the value of x*x;
     System.out.println(isvalue(8));


     // function for swappping two number using  without third variable
        swapping(2,3 );



        
    }
    
}
