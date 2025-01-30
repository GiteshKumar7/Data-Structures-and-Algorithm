// 51 N_QUEENS 
// all possible solution of placing the queens with decisions
// count the possible ways to place the queens having same comlexity
public class B93 {

    public static boolean isSafe(char board[][], int row, int col) {
        // vertically up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Horizotally right
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        // Horizontally left
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    static int count=0;
    public static void nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            count++;
           printBoard(board);
            return;
        }

        // kaam or recursive calls along with backteracking
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // function call or recursive call
                board[row][j] = 'x'; // backtrack step
            }
        }

    }

    public static void printBoard(char board[][]) {
        System.out.println("___chess Board___");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        int n = 4;

        char board[][] = new char[n][n];

        // initializations
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
        System.out.println("the total number of the solution possible :"+ count);


    }

}
