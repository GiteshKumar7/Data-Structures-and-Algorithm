// using ternary operator and if case 

import java.util.*;
public class A25 {
    public static void main(String a[]){
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A :");
        int  A = sc.nextInt();
        System.out.println("Enter B :");
        int  B= sc.nextInt();
        System.out.println("Enter C :");
        int  C = sc.nextInt();

        int largest =0;

        // largest = ((((A > B) ? A :B) > C) ? (A>B?A:B)  :C);
        //  System.out.println("the largest element :"+ largest);

       
        if(A>=B && A>=C){
            A= A+1;
            System.out.println("the A is largest  " + A );
        }else if(B>=A && B>=C){
              B = B+ 2;
             System.out.println("the B is largest :"+ B);
        }else {
            System.out.println("The C is largest " + C);
    }
    
}
}