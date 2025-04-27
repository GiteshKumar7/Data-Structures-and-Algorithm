//https://leetcode.com/problems/balance-a-binary-search-tree/description/
//https://www.geeksforgeeks.org/problems/normal-bst-to-balanced-bst/1
// lc -1382. Balance a Binary Search Tree
// gfg -Normal BST to Balanced BST

import java.util.*;
public class D27 {
     public static class Node{
        int data;
        Node left, right;
        Node(int data){
            this.data= data;
        }
     }

     // Preorder traversal 
     public static void Preorder(Node root){
        if(root==null) return ;

        System.out.print(root.data+ "  ");
        Preorder(root.left);
        Preorder(root.right);
     }


     // inorder traversal for getting sorted array
     public static void inOrderList(ArrayList<Integer> getInorder,Node root){
       if(root==null){
        return ;
       }

       inOrderList(getInorder, root.left);
       getInorder.add(root.data);
       inOrderList(getInorder, root.right);
     }

     // balanced BST returning
     public static Node BalancedBST(ArrayList<Integer> getInorder,int st, int end){
        if(st> end) return null;

        int mid =(st+end)/2;
        Node root= new Node(getInorder.get(mid));
       root.left=BalancedBST(getInorder,st, mid-1);
       root.right=BalancedBST(getInorder, mid+1, end);
       return root;
     }

     public static Node NormalBSTtoBalancedBST(Node root){
    
        // storing into the arrayList in sorted array
        ArrayList<Integer> getInorder= new ArrayList<>();
         // function to calculate it
        inOrderList(getInorder,root);

        // to get Baalanced Bst from sorted array
          return BalancedBST(getInorder,0,getInorder.size()-1);

     }    
       public static void main(String[] args) {
        //         8    
        //        / \
        //      6    10
        //     /      \
        //    5        11
        //   /         \
        //  3           12
        // Given Normal balanced binary tree

        Node root = new Node(8);
        root.left = new Node(6);
        root.right = new Node(10);
        root.left.left = new Node(5);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        root.left.left.left = new Node(3);

        // convert into balanced BST
       //         8    
        //        / \
        //      5    10
        //     / \    / \
        //    3   6  11  12
          // balanced BST          

     
        Node balanceRoot= NormalBSTtoBalancedBST(root);
        System.out.println("The inorder traaversal of tree : ");
        Preorder(balanceRoot);

       }
}
