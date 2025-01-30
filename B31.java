//update the ith bits
public class B31 {
    public static int setIthBit(int n, int i) {
        int bitmask = 1 << i;
        return n | bitmask;

    }

    public static int clearIthbits(int n, int i) {

        int maskbit = ~(1 << i);
        return n & maskbit;

    }

    public static int updateithbits(int n, int i, int newbit) {
        // if (newbit == 0) {
        //     return clearIthbits(n, i);
        // } else {
        //     return setIthBit(n, i);
        // }

        n=clearIthbits(n, i);
        int bitmask=newbit<<i;
        return n|bitmask;




    }

    public static void main(String args[]) {
        System.out.println(updateithbits(10, 3, 0));

    }

}
