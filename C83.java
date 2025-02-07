//https://www.geeksforgeeks.org/problems/level-order-traversal/0
// level order traversal of a binary tree

import java.util.*;

public class C83 {
    // node class to create the binnary tree
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

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    
                    if(curr.right!=null){
                        q.add(curr.right);
                    }
                }
            }

        }
    }

    public static void main(String[] args) {

        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
  
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
       
        tree.levelOrder(root);

    }

}
