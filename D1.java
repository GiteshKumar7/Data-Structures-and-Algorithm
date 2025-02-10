//https://www.geeksforgeeks.org/problems/children-sum-parent/1
//Children sum in Binary Tree
// Child Sum property

public class D1 {
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

    public static int childSumProperty(Node root){

        if(root==null  || (root.left==null && root.right==null)){
            return 1;
        }

        int leftd= childSumProperty(root.left);
        int rightd= childSumProperty(root.right);

        // if left child sum is not equal to right child sum
        int newleft= (root.left==null)? 0 :root.left.data;
        int newright= (root.right==null)? 0: root.right.data;

        if( (root.data ==newleft +newright ) &&  leftd==1 && rightd==1) {
            return 1;
        }
    
        return 0;
    }

    public static void main(String[] args) {
        // Binary tree 
        // 35
        // / \
        // 20 15
        // / \ / \
        // 15 5 10 5

        // Output: 1
        // Explanation:
        // Here, every node is sum of its left and right child.

        Node root = new Node(35);
        root.left = new Node(20);
        root.right = new Node(15);
        root.left.left = new Node(15);
        root.left.right = new Node(5);
        root.right.left = new Node(10);
        root.right.right = new Node(5);

       int s= childSumProperty(root);
       System.out.println(s);
    }
}
