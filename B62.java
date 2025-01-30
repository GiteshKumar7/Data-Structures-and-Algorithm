// fibonacci series of Nth number  using recursion


public class B62 {
      public static int fib(int n){
        // if( n==0){
        //     return 0;
        // }
        // if(  n==1){
        //     return 1;
        // }

        if(n==0 ||n==1){
            return n;
        }

        int fibnm1= fib(n-1);// bib(n-1)
        int fibnm2=fib(n-2); //fib(n-2)
        int result = fibnm1+ fibnm2;
        return  result;

      }


    public static void main(String args[]){

    int n = 8;
    System.out.println(fib(n));

    }

}
