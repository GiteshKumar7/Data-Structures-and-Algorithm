//palindromic pattern with number pattern
import java.util.*;
public class A48 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter N:");
    int n = sc.nextInt();

    for(int i=1 ; i<=n ; i++){// row 
        for(int j =1 ; j <=(n-i); j++){// for spaces 
            System.out.print(" ");
        }

        for(int j=i; j>=1 ; j--){//decresaing order 
            System.out.print(j);
        }

        for(int j=2 ;j<=i ; j++){// starrting from 2 next right half pyramid
            System.out.print(j);
        }

        System.out.println();
    }



    }
    
}
