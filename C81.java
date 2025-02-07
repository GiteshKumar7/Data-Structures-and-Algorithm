//https://www.geeksforgeeks.org/problems/inorder-traversal/1
// Inoder tree Traversal  

public class C81 {
  public static class Node{
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.left = null;
        this.data = data;
        this.right = null;
    }
  }

  public static class BinaryTree{
    static int idx=-1;

        // tree creation
        public static Node buildTree(int node[]){
            idx++;
            if (node[idx] == -1) {
                return null;
            }

            Node newNode = new Node(node[idx]);// new node with value
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);

            return newNode;

        }

// code for the inorder traversal of the binary tree
  public static void inorder(Node root){
    if(root==null){
        return;
    }

    inorder(root.left);
    System.out.print(root.data+ " "); 
    inorder(root.right);
   
}
}
    
    public static void main(String[] args) {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(node);
       
        tree.inorder(root);

    }

}
