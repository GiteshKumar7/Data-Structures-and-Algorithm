// finding the x power of x using optimizes function

public class B71 {
    public static int power(int x, int n) {
        // base case
        if (n == 0) {
            return 1;
        }

        // // one way of doing
        // if (n % 2 != 0) {
        // int halfpowerSquare = x * power(x, n / 2) * power(x, n / 2);
        // return halfpowerSquare;
        // } else {

        // int halfpowerSquare = power(x, n / 2) * power(x, n / 2);
        // return halfpowerSquare;
        // }


        // //  2 another way of doing
      // 2a method 
       int halfpowerSquare= power(x, n / 2);
       int halfpowerSquare1= halfpowerSquare * halfpowerSquare;

       // // 2b method
      //  int halfpowerSquare = power(x, n / 2) * power(x, n / 2); // for even n

        if (n % 2 != 0) {
            halfpowerSquare1 = x * halfpowerSquare1;
        }

        return halfpowerSquare1;
    }

    public static void main(String args[]) {
        int x = 2;
        int n = -2;// here is odd n
        // int n = 10; // here is even n
        int b = power(x, n);
        System.out.println(b);

    }
}
