//Recursions
// print numbers from n to 1
public class B58 {
   public static void printDec(int n){
      if( n==1){// base case
        System.out.println(n);
        return ;
      }
   
      System.out.print(n+ " ");
      printDec(n-2); // function calling itself for n-1

   }

    public static void main(String[] args) {
        int n=10;
        printDec(n);


    }
    
}
