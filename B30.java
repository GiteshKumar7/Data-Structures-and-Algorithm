// clear the ith bit  
// keeping all the element remains unchanged

import java.util.*;
public class B30 {

    public static int clearIthbits(int n , int i){
   
        int maskbit= ~(1<<i);
     return n & maskbit;

    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N :");
        int n = sc.nextInt();

        System.out.println("Enter a ith  I :");
        int i = sc.nextInt();

        System.out.println("");
        int s= clearIthbits(n, i);
        System.out.println("the updated value is " + s);

  


    }
    
}
