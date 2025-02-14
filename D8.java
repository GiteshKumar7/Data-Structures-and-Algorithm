//https://leetcode.com/problems/binary-tree-pruning/
//814. Binary Tree Pruning


public class D8 {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    
    // function for the pruning
   public  static  Node pruning(Node root){
    if(root==null){
        return null;
    }
    root.left= pruning(root.left);
    root.right= pruning(root.right);

    if(root.data == 0 && root.left==null && root.right==null){
      return null;
    }
    return root;

   }

    // printing in the preorder fahion traversal
  public static void print(Node root){
    if(root==null){
        return;
    }

    System.out.print(root.data+ " ");
    print(root.left);
    print(root.right);

  }

    public static void main(String[] args) {
    //     1
    //     / \
    //    0   1
    //   / \    \
    //  0   0    1

    // output 
    // 1
    // \
    //  1
    //   \
    //    1

     Node root = new Node(1);
        root.left = new Node(0);
        root.right = new Node(1);
        root.left.right = new Node(0);
        root.left.left = new Node(0);
        root.right.right= new Node(1);

        System.out.println("The originl tree :");
        print(root);
        System.out.println();

       root = pruning(root);

       System.out.println("the pruning trees : ");
       print(root);
 



    }
    
}
