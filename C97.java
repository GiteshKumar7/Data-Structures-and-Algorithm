//https://www.geeksforgeeks.org/problems/min-distance-between-two-given-nodes-of-a-binary-tree/1
//Minimum Distance between Nodes in binary  trees

import java.util.*;

public class C97 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node findlca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftlca = findlca(root.left, n1, n2);// you get the leftlca
        Node rightlca = findlca(root.right, n1, n2);// you get the leftlca

        // leftlca=val ,righlca =null

        if (leftlca != null && rightlca != null) {
            return root;
        }

        return (leftlca != null) ? leftlca : rightlca;
    }

    public static int dist(Node root, int n) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }

        int leftdist = dist(root.left, n);
        int rightdist = dist(root.right, n);

        if (leftdist == -1 && rightdist == -1) {
            return -1;
        } else if (leftdist == -1) {
            return rightdist + 1;
        } else {
            return leftdist + 1;
        }
    }

    public static int minDistanceBetweenTwoNodeInBinaryTree(Node root, int a, int b) {

        Node lca = findlca(root, a, b);
        int dist1 = dist(lca, a);
        int dist2 = dist(lca, b);
        return dist1 + dist2;

    }

    public static void main(String[] args) {
        /*
         * 
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         * 
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int a = 4;
        int b = 7;
        int s = minDistanceBetweenTwoNodeInBinaryTree(root, a, b);
        System.out.println("min Distance Between TwoNodeInBinaryTree :" + s);

    }

}
