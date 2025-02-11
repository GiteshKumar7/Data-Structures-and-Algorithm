//https://leetcode.com/problems/univalued-binary-tree/description/
// 965. Univalued Binary Tree

public class D3 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isunivalHelper(Node root, int prev) {
        if (root == null) {
            return true;
        }

        if (root.data != prev) {
            return false;
        }

        boolean leftSubtree = isunivalHelper(root.left, prev);
        boolean rigthSubtree = isunivalHelper(root.right, prev);

        return leftSubtree && rigthSubtree;
    }

    public static boolean checkUnivaluedTree(Node root) {
        return isunivalHelper(root, root.data);

    }

    public static void main(String[] args) {
        // 1
        // / \
        // 1 1
        // / \
        // 1 1
        // output is true;

        // 1
        // / \
        // 1 2
        // output is false;
        Node root = new Node(1);
        root.left = new Node(1);
        root.right = new Node(1);
        root.left.right = new Node(1);
        root.left.left = new Node(1);

        System.out.println(checkUnivaluedTree(root));
    }
}
