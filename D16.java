//https://www.geeksforgeeks.org/problems/delete-a-node-from-bst/1
// Delete a Node in BST

public class D16 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    
    // Insertion Operation into the biary search tree
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


// function to delete a node in BST
    public static Node deleteNode(Node root, int val) {
        if (root == null) {
            return root;
        }
        // search first
        if (root.data > val) {
            root.left = deleteNode(root.left, val);
        } else if (root.data < val) {
            root.right = deleteNode(root.right, val);
        } else {
            // after searching, deletion
            // case 1: No child delte
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 3: one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 3 : of two child
            Node minNode = findIorderSucessor(root.right);
            root.data = minNode.data;
            root.right = deleteNode(root.right, minNode.data);
        }
        return root;

    }

    // function to find the Inorder Sucsessor in BST 
    public static Node findIorderSucessor(Node root) {
       while(root.left!=null){
        root=root.left;
       }
       return root;
    }

    public static void main(String[] args) {
         int values[]= {8,5,3,1,4,6,10,11,14};
         Node root= null;


         for(int i =0; i<values.length; i++){
            root=insert(root,values[i]);
         }

         Inorder(root);
         System.out.println();

         root=deleteNode(root, 5);
         System.out.println();
         Inorder(root);

    }
}
