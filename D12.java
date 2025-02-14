//https://www.geeksforgeeks.org/problems/count-leaves-in-binary-tree/0
// finding the leaf node in Binary  trees

public class D12 {
    public static class Node{
        int data;
        Node left, right;
        Node(int data){
        this.data=data;
    }
}


   public static int countLeavesNodeInBinaryTrees(Node root){
    if(root==null){
        return 0;
    }

    if(root.left ==null && root.right==null){
        return 1;
    }

    return countLeavesNodeInBinaryTrees(root.left) +countLeavesNodeInBinaryTrees(root.right);
   }



    public static void main(String[] args) {
        Node root = new  Node(1);
        root.left =new Node(10);
        root.right = new Node(39);
        root.left.left= new Node(5);
        root.left.right = new Node(20);

       int s= countLeavesNodeInBinaryTrees(root);
       System.out.println("the number of leaves in binary trees : " +s);
    }
    
}
