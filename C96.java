// Lowest Common Ancestor of  binary tree
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// tc= 0(n);
// sc= 0(n)
//
import java.util.*;

public class C96 {

    public static class Node {

        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node  findlca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftlca = findlca(root.left, n1, n2);// you get the leftlca
        Node rightlca = findlca(root.right, n1, n2);// you get the leftlca

        // leftlca=val ,righlca =null
       
        if(leftlca !=null && rightlca !=null){ 
          return root;
        }

        return (leftlca!=null) ? leftlca: rightlca;

       
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

        int n1 = 6;
        int n2 = 5;

        Node s = findlca(root, n1, n2);
        System.out.println("The lowest common ancestor : " + s.data);

        // System.out.println(LowestCommonAncestor(root, n1, n2).data);
    }

}



// class Solution {
    
//     public static boolean getpath(TreeNode root, TreeNode   k, ArrayList<TreeNode> path){
//     if(root==null){
//      return false;
//     }
 
//  // add the root first into the arraylist
//     path.add(root);
//     if(root==k){
//      return true;
//     }
 
//     boolean  foundleft=getpath(root.left, k, path);
//     boolean foundright= getpath(root.right, k , path);
    
//     if(foundleft || foundright){
//      return true;
//     }
 
//     path.remove(path.size()-1);
//     return false;
 
//     }
 
 
//      public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
         
 
//     ArrayList<TreeNode> path1= new  ArrayList<>();
//     ArrayList<TreeNode> path2 = new ArrayList<>();
 
//     getpath(root,p,path1);
//     getpath(root,q,path2);// root se q tak jaatai and found it and store in path2 arraylists
 
//     int i=0; 
//     for(;i<path1.size() && i<path2.size(); i++){
//      if(path1.get(i) !=path2.get(i)){
//          break;
//      }
//     }
     
//      TreeNode lca =path1.get(i-1);
//      return lca;
//      }
//  }