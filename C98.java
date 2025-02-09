//https://www.geeksforgeeks.org/problems/kth-ancestor-in-a-tree/1
// Kth Ancestor of Node

import java.util.*;

public class C98 {
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

    public static int KthAncestor(Node root, int n, int k) {
        if (root == null) {
            return -1;
        }

        if (root.data == n) {
            return 0;
        }
        int leftKth = KthAncestor(root.left, n, k);
        int rightKth = KthAncestor(root.right, n, k);

        if (leftKth == -1 && rightKth == -1) {
            return -1;
        }

        int max = Math.max(leftKth, rightKth);

        if (max + 1 == k) {
            System.out.println(root.data);
        }
        return max + 1;
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

        int n = 6;
        int k = 2;// kth(2th) ancestor of node 5 is 1
         KthAncestor(root, n, k); // output is 1
         
    }

}
