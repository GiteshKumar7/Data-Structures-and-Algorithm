//check if queens can be arranged in the given board(YES /NO) 
//then print th fist set only and check for other only


//prinnt one solution if possibility of placing the queen is there
public class B94 {

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

    static int count = 0;

    public static boolean nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            count++;
            return true;
        }

        // kaam or recursive calls along with backteracking
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (nQueens(board, row + 1)) {// function call or recursive call
                    return true;
                }
                board[row][j] = 'x'; // backtrack step
            }

        }
        return false;
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

        if( nQueens(board, 0)){
            System.out.println("posisble");
            printBoard(board);
        }else{
            System.out.println("not possible");
        }

       
        System.out.println("the total number of the solution possible :" + count);

    }

}
