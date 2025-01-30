import java.util.*;

class solution {
    public float total(float a, float b, float c) {

        float m = a + b + c;

        return (((18 * m) / 100) + m);

    }
}

public class A10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter pencil cost :");
        float a = sc.nextFloat();
        System.out.print("enter pen cost :");
        float b = sc.nextFloat();
        System.out.print("enter eraser cost :");
        float c = sc.nextFloat();

        solution obj = new solution();

        float f = obj.total(a, b, c);
        System.out.println("the total cost  after 18% gst :" + f);

    }

}
