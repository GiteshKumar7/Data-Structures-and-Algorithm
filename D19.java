//https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1
// Root to leaf Paths

import java.util.*;
public class D19{
    public static class Node{
     int data;
     Node left, right;
     Node(int data){
         this.data=data;
      }
    }
 
    // Innsertion of node in binnary seacrch tree
    public static Node insert(Node root,int key){
     if(root==null){
         return new Node(key);
     }
 
     if(root.data>key){
         root.left=insert(root.left,key);
     }else{
         root.right=insert(root.right,key);
     }
     return root;
    }
 
    // function to print the inorder traversal
    public static void inorder(Node root){
     if(root==null){
         return ;
     }
 
     inorder(root.left);
     System.out.print(root.data+ " ");
     inorder(root.right);
 
    }

    // helper function to find it and print it
    public static void print(ArrayList<Integer> path){
        for(int i=0 ; i<path.size(); i++){
            System.out.print(path.get(i)+ "->");
        } 
        System.out.println("null");
    }

    // function to find the path fromm root to leaf
    public static void root2Leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return ;
        }
 
        // arraylist to store
        path.add(root.data);
        if(root.left==null && root.right==null){
        print(path);
        }

        root2Leaf(root.left,path);
        root2Leaf(root.right,path);
        // VVVI
        path.remove(path.size()-1);
    }
 

     public static void main(String[] args) {
         int values[]= {8,5,3,1,4,6,10,11,14};
         int k=5;
         Node root=null;
 
 
         for(int i=0; i<values.length; i++){
          root= insert(root, values[i]);
         }
 
     System.out.println("Balanaced seached trees :");
     inorder(root);
     System.out.println();


     ArrayList<Integer> q= new ArrayList<>();
     root2Leaf(root,q);
  
     }
 }
 