//https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
//Bottom view of the binary tree

import java.util.*;

public class C91 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

// Helper class for BFS traversal
public static class Info {
    Node node;
    int hd;
    Info(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}

    // Function to return a list of nodes visible from the bottom view of a Binary Tree.
  public  static ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        // TreeMap to store the last node at each horizontal distance
        TreeMap<Integer, Integer> bottomViewMap = new TreeMap<>();
        Queue<Info> queue = new LinkedList<>();
        
        // Start with root at horizontal distance 0
        queue.add(new Info(root, 0));

        while (!queue.isEmpty()) {
            Info curr = queue.poll();
            Node node = curr.node;
            int hd = curr.hd;

            // Always update the node at this horizontal distance (keeps the last-seen node)
            bottomViewMap.put(hd, node.data);

            // Add left and right children with updated HD
            if (node.left != null) {
                queue.add(new Info(node.left, hd - 1));
            }
            if (node.right != null) {
                queue.add(new Info(node.right, hd + 1));
            }
        }

        // Collect results in sorted order of horizontal distance
        result.addAll(bottomViewMap.values());
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



        ArrayList<Integer> s= bottomView(root);
        System.out.println(s);
    }
    
}
