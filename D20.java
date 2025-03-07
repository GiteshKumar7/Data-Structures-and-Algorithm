//https://www.geeksforgeeks.org/problems/root-to-leaf-paths/1
// Root to leaf Paths

import java.util.*;
public class D20{
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

   

    // function to find the path fromm root to leaf
    public static ArrayList<ArrayList<Integer>> root2Leaf(Node root){
    
        ArrayList<ArrayList<Integer>> res= new ArrayList<>();
       ArrayList<Integer> path=  new ArrayList<>();
       findPaths(root,path,res);

       return res;

    }

    private static void findPaths(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> res){
        if(root==null){
            return ;
        }
 
        // arraylist to store
        path.add(root.data);
        // both equal to null then add to that arrayList(path) into the new Arraylist(res)
        if(root.left==null && root.right==null){
        res.add(new ArrayList<>(path));
        }

        findPaths(root.left,path,res);
        findPaths(root.right,path,res);
        
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


     ArrayList<ArrayList<Integer>> q= root2Leaf(root);
     System.out.println(q);
  
     }
 }
 