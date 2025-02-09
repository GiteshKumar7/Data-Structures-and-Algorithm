//Ancestors in Binary Tree
//https://www.geeksforgeeks.org/problems/ancestors-in-binary-tree/1

import java.util.*;
public class C99 {
    public static class Node{
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }

    // function to  get the ancestors of a node
    public static   ArrayList<Integer> acestors(Node root,int k){
       // arraylist creation to store
        ArrayList<Integer> result= new ArrayList<Integer>();
        findAncestor(root,k,result);
        return result;
    }

    // helper function to get the ancestor of node
    public static boolean findAncestor(Node root,int k, ArrayList<Integer> result ){
        if(root==null){
            return false;
        }

        // target found , return true
        if(root.data==k){
            return true;
        }

         boolean leftd= findAncestor(root.left,k,result);
         boolean right=findAncestor(root.right, k, result);

      if(leftd || right){
         result.add(root.data);
         return true;
        }

        return false;
    }


    public static void main(String args[]){
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

         ArrayList<Integer> p= acestors(root, 7);
         System.out.println(p);
    }
    
}
