// clear range of the ith bits from i to j;

public class B32 {

    public static int clearItBitsinRange(int n , int i  , int j){
   
        int a = (~0)<<(j+1);
        int b= (1<<i)-1;
        int bitmask= a|b;
        return n & bitmask;

    }
    public static void main(String args[]){
   
        System.out.println(clearItBitsinRange(10, 2, 4));

    }
    
}
