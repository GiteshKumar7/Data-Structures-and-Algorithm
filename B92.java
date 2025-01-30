// N-queens in all possible ways whitout  checking ffor attacking possible or not

public class B92 {
     
    public static void nQueens(char board[][], int row){
       // base case : if all queens are placed, print the board
        if( row== board.length){
           printBoard(board);
           return ;
        }

     for( int  j=0; j<board.length; j++){//row wise placing
        board[row][j]='Q';
        nQueens(board, row+1); // function call or recursive call
        board[row][j]='.'; // backtrack step
     }
    }

    public static void printBoard(char board[][]){
        System.out.println("____chess Board_____");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
             System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
    int n =2; // for 2 x 2 grid

    char board[][]=new char[n][n];

    // initialization of n x n
    for( int i =0 ; i<n; i++){
        for( int j=0 ;j<n; j++){
            board[i][j]= 'x';
        }
    }

    nQueens(board, 0);
    }
    
}
