//https://www.geeksforgeeks.org/problems/determine-if-two-trees-are-identical/1
//  identical trees; same smae

public class D23 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    public static boolean AreIdenticalTrees(Node root, Node root1) {

        if (root == null && root == null)
            return true;
        if (root == null || root == null)
            return false;

        // root data not same case
        if (root.data != root1.data)
            return false;

        return AreIdenticalTrees(root.left, root1.left) && AreIdenticalTrees(root.right, root1.right);

    }

    public static void main(String[] args) {
        // Input:
        // 1      1
        // / \   / \
        // 2 3  2 3
        // Output: true
        // Explanation:
        // There are two trees both having 3 nodes and 2 edges, both trees are identical
        // having the root as 1, left child of 1 is 2 and right child of 1 is 3.

        Node root = new Node(4);
        root.left = new Node(1);
        root.right = new Node(5);
        root.right.right = new Node(6);

        Node root1 = new Node(4);
        root1.left = new Node(1);
        root1.right = new Node(5);
        root1.right.right = new Node(6);

        if (AreIdenticalTrees(root, root1)) {
            System.out.println("Both trees are identical of each other");
        } else {
            System.out.println("Not Identical of each other");
        }

    }

}
