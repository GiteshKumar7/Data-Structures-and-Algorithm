// check whether a studentt or fail orr passs aftter agetting 33 makrks using user input marks 

import java.util.*;

public class A28 {
    public static void main(String a[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter  marks :");
        float marks = sc.nextFloat();

        boolean bool = (marks >= 33) ? true : false;
        System.out.println("the stustus off student is :" + bool);

        String status = (marks >= 33) ? "pass" : "fail";
        System.out.println("The Status of the student :" + status);
        ;
    }

}
