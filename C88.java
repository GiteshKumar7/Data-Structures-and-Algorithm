//https://www.geeksforgeeks.org/problems/diameter-of-binary-tree/1
// Diameter of a tree 
// o(N ) time complexity and o(N) space complexity
 

// very very inportant questions till date

public class C88 {
    // Node creation
     public static class Node{
        int data;
        Node left ,right;
         Node(int data){
            this.data= data;
            this.left= null;
            this.right= null;
         }
     }
  
 // class to get the cht and diam
     public static class info{
         int ht;
         int diam;
          info(int ht, int diam){
            this.ht= ht;
            this.diam=diam;
          }
     }

     public static info heigthAndDiameter(Node root){

        if(root==null){
            return new info (0,0);
        }


        info leftinfo= heigthAndDiameter(root.left);
        info rightinfo= heigthAndDiameter(root.right);

        int diam =Math.max(Math.max(leftinfo.diam, rightinfo.diam), leftinfo.ht+rightinfo.ht+1);
       int ht= Math.max(leftinfo.ht, rightinfo.ht)+1;


       return new info(ht, diam);
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
 
         System.out.println("The Diameter of tree : " +heigthAndDiameter(root).diam);
         System.out.println("The Diameter of tree : " +heigthAndDiameter(root).ht);
 
 
 
 

    }
}
