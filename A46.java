
import java.util.*;
public class A46 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of rows: ");
        int n = sc.nextInt();

        for(int i =1 ; i<=n; i++){

            for(int j= 1 ; j<=(n-i);j++){
            System.out.print(" ");
            }
            
            //for rhombus
           for(int j =1 ; j<=n; j++){
            System.out.print("*");
           }

         // //hollow rhombous
        //     for(int j=1 ; j<=n; j++){
        //         if(i==1 || i==n || j==1 || j==n){
        //         System.out.print("*");
        //    }else {
        //     System.out.print(" ");
        //    }
        // }



       
         System.out.println("");
        }
    }

}
