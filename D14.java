// https://www.geeksforgeeks.org/problems/count-non-leaf-nodes-in-tree/1
// Non leaf node in a tree

import java.util.*;
public class D14 {
    public static class Node{
        int data;
        Node left, right;
        Node(int data){
        this.data=data;
    }
}
    
  public static int countNonLeafBTNOdes(Node root){
    // base case 
    if(root==null|| (root.left==null && root.right==null)){
      return 0;
    }

    return 1+ countNonLeafBTNOdes(root.left)+ countNonLeafBTNOdes(root.right);

  }

    public static void main(String[] args) {
         Node root = new  Node(1);
        root.left =new Node(10);
        root.right = new Node(39);
        root.left.left= new Node(5);
        root.left.right = new Node(20);
        

        int s=countNonLeafBTNOdes(root);
        System.out.println(" Number of Non leaf Node :"+ s) ;
    }
}
