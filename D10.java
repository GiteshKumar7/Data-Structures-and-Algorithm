//Binary search trees 
// build search search treess
public class D10 {
    public static class Node{
        int data;
        Node left;
        Node  right;
        Node(int data){
            this.data=data;
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
       // int values[]= {5,1,3,4,2,7};
        int values[]= {1,2, 3, 4, 5,6, 7, 8, 9};
        Node root=null;

        for(int i=0; i<values.length; i++){
            root=insert(root,values[i]);
        }

        Inorder(root);
        System.out.println();

    }
    
}
