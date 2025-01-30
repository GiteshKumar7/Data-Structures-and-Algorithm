// check  if a number is power or 2 or not;

public class B33 {

    public static boolean powerOfTwo(int n) {

        // checking a num and num-1 is equal to 0 then n is power of 2
        if ((n & (n - 1)) == 0) {
            return true;
        }
        return false;

    }

    public static void main(String args[]) {

        System.out.println(powerOfTwo(15));

    }

}
