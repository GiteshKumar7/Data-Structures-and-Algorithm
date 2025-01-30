//  Number pyramid shape with three diferent variety 
import java.util.*;
public class A47 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number N :");
        int n = sc.nextInt();
   int num =1;
        for(int i =1 ; i<=n ; i++){
            for(int j =1 ; j<=(n-i); j++){
                System.out.print(" ");
            }

            for(int j=1 ; j<=i ; j++){
                System.out.print(i+" ");
              

            }
            System.out.println();
        }



        }
    
}
