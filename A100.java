// find min and max in 2D array
//TC =O(n*m )
import java.util.*;
public class A100 {

    // function to find maximumm in 2d array 
    public static int  MaxElement(int matrix[][]) {
        int max= Integer.MIN_VALUE;
    
           
        for (int i = 0; i < matrix.length; i++) {
           for (int j = 0; j < matrix[0].length; j++) {
             if(matrix[i][j]>max){
                max=matrix[i][j];
             }
                }
            }
            System.out.println("the max value in 2D array  :" + max);
             return max;
            
    }

    // function to find miimum in 2D array 
    public static int MinElement(int matrix[][]){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
          if(matrix[i][j]<min){
             min=matrix[i][j];
          }
             }
         }
         System.out.println("the max value in 2D array : " + min);
          return min;
         
 }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        // taking input from user
        System.out.println("Enter the elements of  2D Array :");
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // showing output
        System.out.println("All the elements of  2D Array :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        MinElement(matrix);
        MaxElement(matrix);

        // taking output
        System.out.println("All the elements of  2D1 Array :");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }



    }
    
}
