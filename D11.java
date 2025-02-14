//https://www.geeksforgeeks.org/problems/search-a-node-in-bst/1
// search  a BST

public class D11 {
    public static class Node{
        int data;
        Node left;
        Node  right;
        Node(int data){
            this.data=data;
        }
    }


    public static boolean BinarySearchTrees(Node root, int key){
        if(root==null){
            return false;
        }

        if(root.data==key){
            return true;
        }else if(root.data>key){
            return BinarySearchTrees(root.left,key);
        }else{
            return BinarySearchTrees(root.right,key);
        }

    }
    
    // inertinng into the biary search tree
    public static Node insert(Node root, int val){
        if(root==null){
            root =new Node(val);
            return  root; 
        }

        if(root.data>val){
            root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return  root;
    }

    // innorde traversal -> sorted order
    public static void Inorder(Node root){
        if(root==null){
            return ;
        }

        Inorder(root.left);
        System.out.print(root.data+ " ");
        Inorder(root.right);

    }


    
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root= null;


        for(int i=0; i<values.length; i++){
            root= insert(root, values[i]);
        }


        Inorder(root);
        System.out.println();

        if( BinarySearchTrees(root,2)){
            System.out.println("found here ");
        }else{
            System.out.println(" Not Found");
        }


    }
}
