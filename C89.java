//https://www.geeksforgeeks.org/problems/check-if-subtree/1
//subtree of another tree

public class C89 {
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

    public static boolean isIdentical(Node node, Node subroot) {
        // If both nodes are null, they are identical
        if (node == null && subroot == null) {
            return true;
        }
        // If one of the nodes is null or the values don't match, they are not identical
        else if (node == null || subroot == null || node.data != subroot.data) {
            return false;
        }

        return isIdentical(node.left, subroot.left) && isIdentical(node.right, subroot.right);
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        // Base case: If root is null, then subRoot can't be a subtree
        if (root == null) {
            return false;
        }

        // If the node matches, check if the trees rooted at these nodes are identical
        if (root.data == subRoot.data) {
            if (isIdentical(root, subRoot)) {
                return true;
            }
        }

        // Otherwise, recursively check the left and right subtrees of root
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        // Create the main tree (root)
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.right = new Node(6);

        // Create the subtree (subRoot) without the node 5
        Node subRoot = new Node(2);
        subRoot.left = new Node(4);
        subRoot.right = new Node(5); // Now include the right child as well


        

        // Check if subRoot is a subtree of root
        System.out.println(isSubtree(root, subRoot));  // Expected output: false
    }
}

