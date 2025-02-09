// Lowest Common Ancestor of  binary tree
// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/
// tc= 0(n);
// sc= 0(n)
//
import java.util.*;
public class C95 {

    public static class Node{

        int data;
        Node left, right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

  // helper function
  public static boolean getPath(Node root, int n , ArrayList<Node> path ){
     if(root==null){
        return false;
     }

     path.add(root);
     // numbber found at root node
     if(root.data==n){
        return true;
     }

     // if number found at left or right subtree
     boolean foundleft= getPath(root.left,n, path);
     boolean foundRight = getPath(root.right, n,path);

     if(foundleft || foundRight){
        return true;
     }

     path.remove(path.size()-1);
     return false;
  }


    public static Node LowestCommonAncestor(Node root,int  n1, int n2){
     ArrayList<Node> path1 = new ArrayList<>();
     ArrayList<Node> path2= new ArrayList<>();

      getPath(root, n1, path1);
      getPath(root, n2, path2);

      // last common ancestor
      int i=0;
      for(; i<path1.size() && i<path2.size() ; i++){
         if(path1.get(i) !=path2.get(i)){
            break;
         }
      }

      Node lca = path1.get(i-1);
      return lca;
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
      
        int n1= 4;
        int n2= 5;

        Node s=LowestCommonAncestor(root, n1, n2);
        System.out.println("The lowest common ancestor : "+ s.data);

      //  System.out.println(LowestCommonAncestor(root, n1, n2).data);
    }

    
}
