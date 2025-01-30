// creation of  2D  arrays
import java.util.*;
public class A98 {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    int matrix[][]= new int[3][3];
    int n =  matrix.length, m =matrix[0].length;

   // taking input from user
    System.out.println("Entter the elements of the 2D array :");
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            matrix[i][j]=sc.nextInt();
        }
    }

    // output 
    System.out.println("The 2DD array :");
    for(int i=0; i<n; i++){
        for(int j=0 ; j<m; j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }



    }
    
}
