// https://www.geeksforgeeks.org/problems/count-non-leaf-nodes-in-tree/1
// Non leaf node in a tree

import java.util.*;
public class D15 {
    public static class Node{
        int data;
        Node left, right;
        Node(int data){
        this.data=data;
    }
}
    
  public static List<Integer> countNonLeafBTNOdes(Node root, List<Integer> Nonleaf){
    // base case 
    if(root==null|| (root.left==null && root.right==null)){
      return Nonleaf;
    }

    Nonleaf.add(root.data);

   countNonLeafBTNOdes(root.left,Nonleaf);
   countNonLeafBTNOdes(root.right,Nonleaf);

   return Nonleaf;
  }

    public static void main(String[] args) {
         Node root = new  Node(1);
        root.left =new Node(10);
        root.right = new Node(39);
        root.left.left= new Node(5);
        root.left.right = new Node(20);
        

        List<Integer> NonLeaf=new ArrayList<>();
        List<Integer> s = countNonLeafBTNOdes(root, NonLeaf);
        System.out.println(s); 


    }
}
