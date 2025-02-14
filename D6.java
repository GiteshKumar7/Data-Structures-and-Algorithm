//https://leetcode.com/problems/find-duplicate-subtrees/description/
//https://www.geeksforgeeks.org/problems/duplicate-subtree-in-binary-tree/1
//652. Find Duplicate Subtrees

import java.util.*;

public class D6 {
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

    public static class duplicate {
        List<Node> result;
        Map<String, Integer> map;

        public List<Node> findDuplicateSubtrees(Node root) {
            result = new ArrayList<>();
            map = new HashMap<>();
            traverse(root);
            return result;
        }

        public String traverse(Node root) {
            if (root == null) {
                return null;
            }

            String subPath = root.data + "," + traverse(root.left) + "," + traverse(root.right);

            // into the map
            map.put(subPath, map.getOrDefault(subPath, 0) + 1);

            // taking out
            if (map.get(subPath) == 2) {
                result.add(root);
            }

            return subPath;

        }
    }

     public static void print(Node root){
        if(root==null){
            return ;
        }
        System.out.print(root.data+" ");
        print(root.left);
        print(root.right);

     }

    public static void main(String[] args) {

        // //Input: root = [1,2,3,4,null,2,4,null,null,4]
        // Output: [[2,4],[4]]
        // Example 2:

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.right.right = new Node(4);
        root.right.left=new Node(2);
        root.right.left.left=new Node(4);

        print(root);
        System.out.println();

        duplicate d= new duplicate();
       List<Node> duplicate1= d.findDuplicateSubtrees(root);        
       
       // printin the duplicate subtress
       for(Node node : duplicate1){
        print(node);
        System.out.println();
       }

    }

}
