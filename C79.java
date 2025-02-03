// Binary trees = 0(N)
//create a binary tree node

import java.util.*;

public class C79 {
    // node creation of left and right along with the root value
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
    }



    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);


      System.out.println(root.data);
    }
}
