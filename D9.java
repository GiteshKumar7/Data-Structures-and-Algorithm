// https://leetcode.com/problems/distribute-coins-in-binary-tree/description/
// 979. Distribute Coins in Binary Tree
// Medium


public class D9 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static class Coins {
        int moves;

        // Main function to distribute coins
        public int DistributeCoinsInBT(Node root) {
            moves = 0;
            dfs(root);
            return moves;
        }

        // DFS helper function
        private int dfs(Node root) {
            if (root == null) return 0;

            // Postorder traversal
            int leftmoves=dfs(root.left);
            int rightmoves=dfs(root.right);
                   // handle the parent 
                    root.data=leftmoves+rightmoves+(root.data-1);
                    moves+=Math.abs(root.data);
                    return root.data;   
            
        }
    }

    // Preorder tree printing
    public static void print(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        print(root.left);
        print(root.right);
    }

    public static void main(String[] args) {
        // Tree: 
        //   3
        //  /  \
        // 0    0
        // Expected output: 2 moves needed

        Node root = new Node(3);
        root.left = new Node(0);
        root.right = new Node(0);

        print(root);
        System.out.println();

        // Class instance and function call
        Coins q = new Coins();
        int exactMoves = q.DistributeCoinsInBT(root);
        System.out.println("Moves Required: " + exactMoves);
    }
}
