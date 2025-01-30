// print the sum of the first n natural number using recursions

public class B61 {
    public static int natural(int n) {

        if (n == 1) {
            return 1;
        }

        int snm1 = natural(n - 1);
        int result = n + snm1;
        return result;

    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println(natural(n));

    }

}
