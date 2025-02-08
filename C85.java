//https://www.geeksforgeeks.org/problems/count-number-of-nodes-in-a-binary-tree/1
// count of the nodes

public class C85 {
    public static class Node{
        int data;
        Node left, right;
        Node(int data){
           this.data= data;
           this.left=null;
           this.right= null;
        }
    }

    // counting the number of the node
    public static int CountNode(Node root){
     if(root==null){
        return 0;
     }

     int lc=CountNode(root.left);
     int rc= CountNode(root.right);
     return lc+rc+1;

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
        root.right.right= new Node(7);
        root.right.left=new Node(6);

     int n =  CountNode(root);
   System.out.println("Number of Node : " + n);
    }
}
