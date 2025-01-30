// Grid ways(2D matrix) 
// find thwe number of the ways to moves from (0,0) to (
//(n-1, m-1) in nxm grid // allowed right and down moves

public class B95 {

    public static int gridWay(int i, int j, int n, int m) {
   // base case
  
        if (i == n - 1 && j == m - 1) { // reach destinations
            return 1;
        } else if (i >= n && j >= m) {// out of bounds
            return 0;
        }
    // recursive  calls from right and down
        int rightMoves = gridWay(i, j+1,n,m);// right moves
        int downMOvves = gridWay(i+1,j,n,m);// down moves
        
        return rightMoves + downMOvves; // total ways 

    }

    public static void main(String args[]) {
        int n = 3, m = 3; // Grid size

        System.out.println("Number of Ways :" + gridWay(0, 0, n, m));

    }

}
