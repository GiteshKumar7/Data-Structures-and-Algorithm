import java.util.*;

public class A6 {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        // addition of  a and b 
        // System.out.println("enter a:");
        // double  a = sc.nextDouble();
        // System.out.println("enter b:");
        // double  b = sc.nextDouble();
       // System.out.println("get the sum :" + (a + b));


         System.out.println("enter a:");
        double  a = sc.nextDouble();
        System.out.println("enter b:");
        double  b = sc.nextDouble();
        double product = a * b;
        System.out.println("the multi of a and b : " +  product);

         System.out.println("enter a floating point value :");
        float rad= sc.nextFloat();
        float areaofcircle =    3.14f* rad *rad;
        System.out.println("the area of circle : "+areaofcircle);


    }

}
