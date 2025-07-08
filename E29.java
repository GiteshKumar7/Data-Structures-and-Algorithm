// Dynamic Programmming 
// time complexity = O(n) linear 
public class E29 {

    public static int fib(int n , int[] f){
      if(n==1 || n==0){
        return n;
      }

      
    // If already computed
       if(f[n] !=0){
        return f[n];
       }

    // Store and return the resul
       f[n]=fib(n-1, f)+ fib(n-2, f);
       return f[n];

    }
   
    public static void main(String[] args) {
      int n=6;
      
      // array creation for storing the fibonacci values
      int f[]= new int[n+1];// Memoization array



      System.out.println(fib(n,f));

    }
}
