// display all number  entered  by user except multiple of 10 

import java.util.*;
public class A38 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
       
        do{
          System.out.println("enter values of n :");
          int  n = sc.nextInt();
          if(n%10 ==0){
            continue;
        }
         System.out.println("the value  :" + n);


        }while(true);
    }
}
