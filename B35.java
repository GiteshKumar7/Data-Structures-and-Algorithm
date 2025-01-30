//Fast Exponentiation (a to the power of n)

public class B35 {
    public static int fastExponentiation(int a, int n) {

        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {// lsb
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;

    }

    public static void main(String args[]) {

        System.out.println(fastExponentiation(5, 3));
        System.out.println(fastExponentiation(3, 5));

    }

}
