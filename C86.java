//https://www.geeksforgeeks.org/problems/sum-of-binary-tree/1
//https://www.geeksforgeeks.org/problems/largest-subtree-sum-in-a-tree/1
// Sum of the Node


public class C86 {
    public static class Node{
        int data;
        Node left, right;
        Node(int data){
           this.data= data;
           this.left=null;
           this.right= null;
        }
    }

    public static int SumOfNode(Node root){
       if(root==null){
        return 0;
       }

       int leftsum=SumOfNode(root.left);
       int rightsum=SumOfNode(root.right);
       return leftsum+ rightsum+root.data;// work same 
       //return root.data+leftsum+rightsum;

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

     int n =  SumOfNode(root);
    System.out.println("sum of Node : " + n);

    }
    

}
