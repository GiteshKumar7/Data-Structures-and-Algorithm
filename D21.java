//https://leetcode.com/problems/validate-binary-search-tree/description/
//https://www.geeksforgeeks.org/problems/check-for-bst/1
//Validate BST(Meduim)(minMax)


public class D21 {
   public static class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
    }
   }
    
   public static boolean isValidBST(Node root){
    return helper(root,Integer.MIN_VALUE, Integer.MAX_VALUE);
   }


     public static boolean helper(Node root, int min, int max){
      if(root==null){
        return true;
      }

        // min greater and max smaller than root. data == false
      if(root.data<=min  ||  root.data>=max){
        return false;
      }
    
      // left and right subtrees should be valid BST
     return helper(root.left, min, root.data) && helper(root.right, root.data, max);

     }


    public static void main(String[] args) {
        Node root= new Node(4);
        root.left=new Node(1);
        root.right= new Node(5);
        root.right.right= new Node(6);

        if(isValidBST(root)){
            System.out.println("valid Bst");
        }else{
            System.out.println("Not Valid bst");
        }
    }
}
