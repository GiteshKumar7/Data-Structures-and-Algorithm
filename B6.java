// Search in sorted matrix
//TC =O(N+M)
//from left and
import java.util.*;

public class B6 {

    public static boolean SearchInSortedMatrix(int matrix[][], int key) {
        int row = 0;
        int col = matrix[0].length - 1;

        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Index found at (" + row + "," + col + ")");
                return true;
            } else if (matrix[row][col] > key) {
                col--;// move left
            } else {
                row++;// move buttom or down
            }

        }
        System.out.println("elements not found ");
        return false;
    }

    public static void main(String args[]) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        int key = 33;

        boolean bool = SearchInSortedMatrix(matrix, key);
        System.out.println(bool);
    }

}
