//https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1
//Top View of a tree
// using preorder traversal and Horizontal distance


import java.util.*;
public class C90 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // class to get the height and node
    public static class info {
        Node node;
        int hd;

        info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        // level order raversal

        Queue<info> q = new LinkedList<>();// info is a class
        HashMap<Integer, Node> map = new HashMap<>();// to store key and value // integer -> key and node-> value

        int min = 0, max = 0;
        q.add(new info(root, 0));
        q.add(null);

        while (!q.isEmpty()) {
            info curr = q.remove();
            if (curr == null) {
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }

            } else {
                // unnique constraint // fist time my hd is occurance
                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                // add left
                if (curr.node.left != null) {
                    q.add(new info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                // add right child
                if (curr.node.right != null) {
                    q.add(new info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }

            }

         }

        for (int i = min; i <= max; i++) {
            System.out.println(map.get(i).data + " ");
        }
        System.out.println();

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

        topView(root);

    }
}
