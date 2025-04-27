//https://www.geeksforgeeks.org/problems/symmetric-tree/1
//Sysmetric tree is a tree which is same when viewed from left to right and right to left.

public class D24 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
   public static boolean isSymmetric(Node root){
    return isMirror(root.left, root.right);
   }

    // function to check the given two tree ar mirror of each other or not
    public static boolean isMirror(Node root, Node root1) {

        if (root == null && root == null)
            return true;
        if (root == null || root == null)
            return false;

        // root data not same case
        if (root.data != root1.data)
            return false;

        return isMirror(root.left, root1.right) && isMirror(root.right, root1.left);

    }

    public static void main(String[] args) {

        // Input:
        // a:      1     
        //       /   \         
        //      2     3 
        //     / \    /\
        //    3    4 4   3
        // Output: true
      //  Explanation: symetric tree
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(3);
        root.left.right = new Node(4);
        root.right.left = new Node(4);
        root.right.right = new Node(3);
       

        if (isSymmetric(root)) {
            System.out.println("This is a Symmetric trees");
        } else {
            System.out.println("Not Symetric trees ");
        }
        
    }

}
