//https://leetcode.com/problems/invert-binary-tree/description/
//226. Invert Binary Tree

import java.util.*;

public class D4 {
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
      // // Using the normal recursion function 
    // public static Node invertBinaryTree(Node root){
    //     if(root==null){
    //         return null;
    //     }


    //     Node left1=invertBinaryTree(root.left);
    //     Node right1=invertBinaryTree(root.right);

      
    //     root.left=right1;
    //     root.right=left1;

    //     return root;
    // }


      // using the queue  and iterative approach
      public static Node invertBinaryTree(Node root){
         if(root==null){
            return null;
         }

         Queue<Node> q= new LinkedList<>();
         q.add(root);

         while(!q.isEmpty()){
            Node temp=q.poll();

            // swapping of the node 
            Node t= temp.left;
            temp.left=temp.right;
            temp.right=t;

            if(temp.left!=null){
                q.add(temp.left);
            }

            if(temp.right!=null){
                q.add(temp.right);
            }

         }
        return root;
      }


     // Simple  print function
    public static void printpInorder(Node root){
        if(root==null){
            return ;
        }

        printpInorder(root.left);
        System.out.print(root.data+ " ");
        printpInorder(root.right);
    }
    

  

    public static void main(String[] args) {
        

          // Sample tree:
        //       4
        //      / \
        //     2   7
        //    / \ / \
        //   1  3 6  9
        // 1 2 3 4 6 7 9 input 
        // 9 7 6 4 3 2 1 output

      
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        printpInorder(root);
        System.out.println();
        invertBinaryTree(root);
        printpInorder(root);


    }
}

