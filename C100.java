//https://www.geeksforgeeks.org/problems/transform-to-sum-tree--170645/1
//transform to Sum tree


public class C100 {
    public static class Node{
        int data;
        Node left ;
        Node right;
        Node(int data){
            this.left=null;
            this.right=null;
            this.data=data;
        }
    }

   public static int transformTree(Node root){

   if(root==null){
    return 0;
   }

   
   int leftchild=transformTree(root.left);
   int rightchild=transformTree(root.right);
   int sum =root.data;

   int newleft=(root.left==null)?0: root.left.data;
   int newright=(root.right==null)?0:root.right.data;


    root.data= newleft + leftchild +newright +rightchild;
    return sum;

   }


   public static void preorder(Node root){
    if(root==null){
        return;
    }

    int sum=root.data;// storing the sum of the current node
    System.out.print(root.data+ " ");
    preorder(root.left);
    preorder(root.right);
   

   }

    public static void main(String[] args) {
         /*
         * 
         * 1
         * / \
         * 2 3
         * / \ / \
         * 4 5 6 7
         * 
         * 
         */
         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         root.left.left = new Node(4);
         root.left.right = new Node(5);
         root.right.left = new Node(6);
         root.right.right = new Node(7);

      // preorder(root);
      transformTree(root);
      preorder(root);
      
    
    }
    
}
