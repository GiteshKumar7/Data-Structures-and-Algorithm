// Disjoint set Union(DS)
// using
//Path Compression in find(x)
//Union by Rank in unionFind(a, b)

import java.util.Arrays;

public class E11 {

    static int n = 7;
    static int par[] = new int[n];// initially null value (0)
    static int rank[] = new int[n];

    // initilaizing the value of parent
    public static void initializationFunction() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int find(int x) {
        if (x == par[x]) {
            return x;
        }
        return par[x] = find(par[x]);// compression path

    }

    public static void unionFind(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (parA == parB)
            return; // Already in same set

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;// A join to B
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void main(String[] args) {

        /*
         * 🌳 Final DSU Tree Structure
         * Set rooted at 1:
         * 1
         * ├── 2
         * │ └── 4
         * ├── 3
         * ├── 5
         * └── 6
         */
        initializationFunction(); // par = [0,1,2,3,4,5,6]

        find(3); // 3 is its own parent → prints 3
        unionFind(1, 3); // 1 becomes parent of 3 (rank[1]++)
        find(3); // path compression: parent of 3 is 1 → prints 1

        unionFind(2, 4); // 2 becomes parent of 4 (rank[2]++)
        unionFind(3, 6); // find(3) → 1, so unionFind(1,6) → 1 becomes parent of 6
        unionFind(1, 4); // 1 and 2 are parents → 1 becomes parent of 2

        find(3); // prints 1
        find(4); // find(4) → 2 → 1 → prints 1

        unionFind(1, 5); // 1 becomes parent of 5

        System.out.println("Parent Array: " + Arrays.toString(par));
        System.out.println("Rank Array: " + Arrays.toString(rank));

    }
}
