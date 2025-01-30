// using Math.max(A,B);
import java.util.Scanner;

public class A26 {
    public static void main(String a[]){


           Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int  A = sc.nextInt();
        System.out.println("Enter B :");
        int  B= sc.nextInt();
        System.out.println("Enter C :");
        int  C = sc.nextInt();

        // between two 
        int maxx =Math.max(A,B);
        System.out.println("the max betweeen two A and B "+ maxx);


      // between threee elements 
        int max = Math.max(Math.max(A, B), C);
        System.out.println(max);

    }

}
