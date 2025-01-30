
//  Transpose of 2D array or matrix;
import java.util.*;

public class B5 {

    // transpose funnction
    public static int[][] TransposeMatrix(int matrix[][]) {

        int Tmatrix[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                Tmatrix[j][i] = matrix[i][j];// transpose logic

            }
        }
        return Tmatrix;

    }



    // show function to show the input an doutput
    public static void show(int matrix[][]) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Row");
        int row = sc.nextInt();
        System.out.println("Enter the number of Column");
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];// creatio of 2D array

         // taking input from user
         System.out.println("Enter the elements of 2D matrix :");
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[0].length; j++) {
                 matrix[i][j] = sc.nextInt();
             }
         }
 
        System.out.println("show the originnal 2D array");
        show(matrix);

        int transpose[][] = TransposeMatrix(matrix);
        System.out.println("The traspose matrix :");
        show(transpose);

    }

}
