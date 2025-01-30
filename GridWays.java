
public class GridWays {

    public static int gridWaysRecursive(int i, int j, int n, int m) {
        // Base case: Reached destination
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // Base case: Out of bounds
        if (i >= n || j >= m){
            return 0;
        }

        // Recursive case: Move right and down
        int rightWays = gridWaysRecursive(i, j + 1, n, m);
        int downWays = gridWaysRecursive(i + 1, j, n, m);

        return rightWays + downWays;
    }

    public static void main(String[] args) {
        int n = 2, m = 3; // Grid size
        System.out.println("Number of ways (Recursive): " + gridWaysRecursive(0, 0, n, m));
    }
}
