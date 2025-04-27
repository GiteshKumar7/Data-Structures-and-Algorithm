//https://www.geeksforgeeks.org/problems/mirror-of-a-given-node/1
// finding the mirror of a given node in a tree;

public class D25 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // main function to get the mirror of the node
    public static int MirrorOFGivenNode(Node root, int tar) {
        if (root == null)
            return -1;
        if (root.data == tar)
            return tar;

        return MirrorNode(root.left, root.right, tar);
    }

    // helper function to get mirror of a noode
    public static int MirrorNode(Node t1, Node t2, int tar) {
        if (t1 == null || t2 == null)
            return -1;

        // extreme left into extreme right and vice-versa
        if (t1.data == tar)
            return t2.data;
        if (t2.data == tar)
            return t1.data;

        int mirror = MirrorNode(t1.left, t2.right, tar);
        if (mirror != -1)
            return mirror;

        return MirrorNode(t1.right, t2.left, tar);

    }

    public static void main(String[] args) {

        // Input:
        // a: 1
        // / \
        // 2 8
        // / \ /\
        // 3 2 4 9
        // Output: 9
        // Explanation: mirror of 3 is 9

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(8);
        root.left.left = new Node(3);
        root.left.right = new Node(2);
        root.right.left = new Node(4);
        root.right.right = new Node(9);

        int target = 3;
        int mirrorOfNode = MirrorOFGivenNode(root, target);
        System.out.println("The mirror  of node " + 3 + " is " + mirrorOfNode);

    }
}
