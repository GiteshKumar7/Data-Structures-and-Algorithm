//  given a route conatininng a direction(E,W,N,S) 
// finding the  shortest patht reach destination
// TC=O(n)

public class B11 {
    public static int getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            // int dir = path.length();

            if (path.charAt(i) == 'N') {
                y++;
            } else if (path.charAt(i) == 'E') {
                x++;
            } else if (path.charAt(i) == 'W') {
                x--;
            } else {
                y--;
            }

        }

        int X = x * x;
        int Y = y * y;
        return  (int )Math.sqrt(X+Y);

      //  int m = X + Y;
      //return (int) Math.sqrt(m);

    }

    public static void main(String args[]) {
        String path = "WNEENESENNN";
        int q = getShortestPath(path);
         System.out.println(q);
    }

}
