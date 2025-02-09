//https://www.geeksforgeeks.org/problems/left-view-of-binary-tree/1
//left view of binary tree;

import java.util.*;

public class C92 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static ArrayList<Integer> leftView(Node root) {
        
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                Node node = queue.poll();

                // The first node in the level is part of the left view
                if (i == 0) result.add(node.data);

                // Add left child first, then right child
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
        }
        return result;
    }


    public static void main(String[] args) {
         Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);



        ArrayList<Integer> s= leftView(root);
        System.out.println(s);
    }
    

}
