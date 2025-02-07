//https://www.geeksforgeeks.org/problems/preorder-traversal/1
// implement the  preOrder tree traversal 
// TC = 0(n) 

import java.util.ArrayList;

public class C80 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.left = null;
            this.data = data;
            this.right = null;
        }
    }

    public static class BinaryTree {
        static int idx = -1;

        // tree creation
        public static Node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }

            Node newNode = new Node(node[idx]);// new node with value
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;

        }

        public static void preOrder(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);

        }
    }

    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
       
        tree.preOrder(root);
    }
}
