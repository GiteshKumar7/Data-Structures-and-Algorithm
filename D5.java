//https://leetcode.com/problems/delete-leaves-with-a-given-value/description/
//1325. Delete Leaves With a Given Value
public class D5 {
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

    // function to delte the target nodes at leaf node and root position
    public static Node deleteleafNodes(Node root, int target) {
        if (root == null) {
            return null;
        }

        root.left = deleteleafNodes(root.left, target);
        root.right = deleteleafNodes(root.right, target);

        if (root.left == null && root.right == null && root.data == target) {
            return null;
        }

        return root;

    }

    // Simple print function
    public static void printpInorder(Node root) {
        if (root == null) {
            return;
        }

        printpInorder(root.left);
        System.out.print(root.data + " ");
        printpInorder(root.right);
    }

    public static void main(String[] args) {
        // Sample tree:
        // 4
        // / \
        // 2 2
        // / \ \
        // 2 3 2

        Node root = new Node(4);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(2);
        root.left.right = new Node(3);
        root.right.right = new Node(2);

        printpInorder(root);
        System.out.println();
        deleteleafNodes(root, 2);
        printpInorder(root);
    }
}
