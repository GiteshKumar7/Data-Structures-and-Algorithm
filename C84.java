// height of the tree

public class C84 {
  public static class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
  }

  public static int height(Node root){
    // base case needde for recursin to end 
    if(root==null){
        return 0;
    }

    int left_height=height(root.left);
    int rigth_heigth= height(root.right);
     int maxHeight  =Math.max(left_height,rigth_heigth)+1;

     return maxHeight;
  }
  

    public static void main(String[] args) {
        /*    // Ans ===3

           1
          /  \
          2    3
          / \  /  \
         4  5 6   7

         
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int treeHeight= height(root);
        System.out.println(treeHeight);

    }
}
