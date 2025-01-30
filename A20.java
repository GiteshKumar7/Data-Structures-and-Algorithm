import java.util.*;

public class A20 {

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  day number ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Its a sunday ");
                break;

            case 2:
                System.out.println("Its a monday ");
                break;

            case 3:
                System.out.println("Its a tuesday ");
                break;

            case 4:
                System.out.println("Its a wednesday ");
                break;

            case 5:
                System.out.println("Its a thursday ");
                break;

            case 6:
                System.out.println("Its a friday ");
                break;

            case 7:
                System.out.println("Its a saturday ");
                break;

            default:
                System.out.println("out of weekeneds ");
                break;

        }
    }

}
