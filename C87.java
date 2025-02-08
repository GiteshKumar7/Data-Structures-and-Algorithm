//https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1
// Diameter of a tree 
// o(N2)

public class C87 {
  public static class Node{
    int data;
    Node left, right;
        Node(int data){
            this.data=data;
            this.left= null;
            this.right=null;
        }
  } 

  // heigth of the tree
  public static int height(Node root){
    if(root==null){
        return 0;
    }

    int left= height(root.left);
    int right= height(root.right);
    return Math.max(left,right)+1;
  }
    
   
  public static int Diameter(Node root){
    if(root==null){
        return 0;
    }

    int leftDiam= Diameter(root.left);
    int left_height=height(root.left);
    int RightDiam=Diameter(root.right);
    int right_height= height(root.right);

    int self_diam= left_height+right_height+1;

    return Math.max(self_diam, Math.max(leftDiam, RightDiam));

  }


    public static void main(String[] args) {
          /*    

           1
          /  \
          2    3
          / \  /  \
         4  5 6   7

         
         */

        Node root= new Node(1);
        root.left= new Node(2);
        root.right= new Node(3);
        root.left.left= new Node(4);
        root.left.right= new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);

        int diameter= Diameter(root);
        System.out.println("The Diameter of tree : " +diameter);



    }
}
