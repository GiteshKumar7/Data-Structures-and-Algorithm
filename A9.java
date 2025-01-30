//  practicing question of apna college 
// area of circle 
import java.util.*;

class solution {
    public int area(int side) {

        return side * side;

    }
}

public class A9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter Side:");
        int side = sc.nextInt();

        solution obj = new solution();
        int ans = obj.area(side);
        System.out.println( "the area of circle :"+ans);

    }

}
