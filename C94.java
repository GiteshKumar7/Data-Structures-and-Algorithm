// Kth level of a tree
// using the preOrder traversal


import java.util.*;
public class C94 {
    public static class Node{
        int data;
        Node left, right;

          Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
          }
    }

    public static void KthLevel(Node root, int  level ,int k){
     if(root==null){
        return;
     }

     // especially for the root level or 1st level
     if(level == k){
      System.out.print(root.data + " ");
      return ;
     }

    KthLevel(root.left, level+1, k);
    KthLevel(root.right, level+1, k); 


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
  
        int k=3;

        KthLevel(root, 1,k);
        
    }

}
