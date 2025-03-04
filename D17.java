//https://www.geeksforgeeks.org/problems/delete-nodes-greater-than-k/1
// delete nodes greater than k

public class D17 {
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

   public static void inorder(Node root){
    if(root==null){
        return ;
    }

    inorder(root.left);
    System.out.print(root.data+ " ");
    inorder(root.right);

   }


   public static Node deleteNodesGreaterThanK(Node root, int k){
    if(root==null){
        return root;
    }


       root.left=deleteNodesGreaterThanK(root.left,k);
       root.right=deleteNodesGreaterThanK(root.right,k);

    if( root.data >=k ){
        return root.left;
    }

    return root;
   }
    public static void main(String[] args) {
        int values[]= {4,1,9};
        int k=5;
        Node root=null;


        for(int i=0; i<values.length; i++){
         root= insert(root, values[i]);
        }

    System.out.println("BST before deletion:");
    inorder(root);
    System.out.println();

    System.out.println("BST after deleteing the nodes >= "+ k+ ":");
    root= deleteNodesGreaterThanK(root,k);
    inorder(root);
   
    }
}
