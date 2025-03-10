//https://www.geeksforgeeks.org/problems/two-mirror-trees/1
// Are two mirror tree are same or not;

public class D22 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // function to check the given two tree ar mirror of each other or not
    public static boolean AreMirrorTreeSame(Node root, Node root1) {

        if (root == null && root == null)
            return true;
        if (root == null || root == null)
            return false;

        // root data not same case
        if (root.data != root1.data)
            return false;

        return AreMirrorTreeSame(root.left, root1.right) && AreMirrorTreeSame(root.right, root1.left);

    }

    public static void main(String[] args) {

        // Input:
        // a:      1      b:      1
        //       /   \         /   \
        //      2     3       3     2
        // Output: true
      //  Explanation: Given pairs of binary tree are mirror of each other.

        Node root = new Node(4);
        root.left = new Node(1);
        root.right = new Node(5);
        root.right.right = new Node(6);

        Node root1 = new Node(4);
        root1.left = new Node(5);
        root1.right = new Node(1);
        root1.left.left = new Node(6);

        if (AreMirrorTreeSame(root, root1)) {
            System.out.println("Both trees are mirror of each other");
        } else {
            System.out.println("Not mirrror of each other");
        }
        
    }

}
