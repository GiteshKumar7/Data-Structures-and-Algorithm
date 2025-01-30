// finding the  2 power of the number

public class B70 {
    public static int power(int x, int n) {

        // base case
        if (n == 0) {
            return 1;
        }

        // recurssive casse
        // int q = power(x,n-1);
        // int power1 = x * power(x,n-1);

        return x * power(x, n - 1);

    }

    public static void main(String args[]) {
        int n = 10;
        int x = 2;
        System.out.println(power(2, 10));

    }
}
