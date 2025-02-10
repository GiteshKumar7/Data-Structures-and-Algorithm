//https://leetcode.com/problems/sum-root-to-leaf-numbers/description/
//https://www.geeksforgeeks.org/problems/root-to-leaf-paths-sum/1
//sum root to leaf numbers 


public class D2 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    public static int treePathsSum(Node root) {
        return helper(root, 0);
    }

    public static int helper(Node node, int currentSum) {
        if (node == null ){
         return 0;
       }
        // Update current sum by adding the node's data
        currentSum = currentSum * 10 + node.data;

        // If it's a leaf node, return the sum formed
        if (node.left == null && node.right == null) {
            return currentSum;
        }

        // Recursively call for left and right subtrees
        return helper(node.left, currentSum) + helper(node.right, currentSum);
    }


    public static void main(String[] args) {

        // Binary tree
        // 10
        // / \
        // 20 30
        // / \
        // 40 60

        // Output: 2630
        // Explanation: There are 3 leaves,
        // resulting in leaf path of 1240, 1260, 130 sums to 2630.
        // Here, every node is sum of its left and right child.

        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

      int s=  treePathsSum(root);
      System.out.println(s);
    }
}