// k closest point from the origin
import java.util.*;

public class D49 {
    public static ArrayList<ArrayList<Integer>> kClosest(ArrayList<ArrayList<Integer>> points, int K) {
        PriorityQueue<ArrayList<Integer>> pq = new PriorityQueue<>((p1, p2) -> {
            int dist1 = p1.get(0) * p1.get(0) + p1.get(1) * p1.get(1); // Squared distance of p1
            int dist2 = p2.get(0) * p2.get(0) + p2.get(1) * p2.get(1); // Squared distance of p2

            // If distances are equal, compare x-coordinates, then y-coordinates
            if (dist1 == dist2) {
                if (p1.get(0).equals(p2.get(0))) {
                    return p1.get(1) - p2.get(1); // Sort by y-coordinate
                }
                return p1.get(0) - p2.get(0); // Sort by x-coordinate
            }

            return dist2 - dist1; // Max-Heap (keep farthest at top)
        });

        // Insert points into the heap
        for (ArrayList<Integer> point : points) {
            pq.add(point);
            if (pq.size() > K) {
                pq.poll(); // Remove the farthest point
            }
        }

        // Extract K closest points and store in a list
        ArrayList<ArrayList<Integer>> closestPoints = new ArrayList<>();
        while (!pq.isEmpty()) {
            closestPoints.add(pq.poll());
        }

        // Sorting the final result (as required by the problem)
        closestPoints.sort((p1, p2) -> {
            int d1 = p1.get(0) * p1.get(0) + p1.get(1) * p1.get(1);
            int d2 = p2.get(0) * p2.get(0) + p2.get(1) * p2.get(1);

            if (d1 == d2) {
                if (p1.get(0).equals(p2.get(0))) {
                    return p1.get(1) - p2.get(1); // Sort by y-coordinate
                }
                return p1.get(0) - p2.get(0); // Sort by x-coordinate
            }
            return d1 - d2; // Sort by increasing distance
        });

        return closestPoints;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Number of points (N) and number of closest points (K)
        System.out.print("Enter the number of points (N): ");
        int N = sc.nextInt();
        System.out.print("Enter the number of closest points to find (K): ");
        int K = sc.nextInt();

        // Input: List of points
        ArrayList<ArrayList<Integer>> points = new ArrayList<>();
        System.out.println("Enter " + N + " points (x y): ");
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            points.add(new ArrayList<>(Arrays.asList(x, y)));
        }

        // Get the K closest points to the origin
        ArrayList<ArrayList<Integer>> closestPoints = kClosest(points, K);

        // Output the K closest points
        System.out.println("The " + K + " closest points to the origin are:");
        for (ArrayList<Integer> point : closestPoints) {
            System.out.println(point.get(0) + " " + point.get(1));
        }

        sc.close();
    }
}
