// count the set(1) bits in a number;

public class B34 {
    public static int countBit(int n) {
        int count = 0;

        while (n > 0) {
            // checking for the LSB in a number
            if ((n & 1) != 0) {
                count++;
            }
            // right shift of a Number
            n= n>>1;
        }
        return count;

    }

    public static void main(String args[]) {

     System.out.println(countBit(16));

     System.out.println(countBit(11));
     
     System.out.println(countBit(15));
     
     System.out.println(countBit(14));
    }

}
