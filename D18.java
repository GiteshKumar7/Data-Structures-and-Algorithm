// Print in Range

public class D18 {
    public static class Node{
     int data;
     Node left, right;
     Node(int data){
         this.data=data;
      }
    }
 
    // Innsertion of node in binnary seacrch tree
    public static Node insert(Node root,int key){
     if(root==null){
         return new Node(key);
     }
 
     if(root.data>key){
         root.left=insert(root.left,key);
     }else{
         root.right=insert(root.right,key);
     }
     return root;
    }
 
    public static void inorder(Node root){
     if(root==null){
         return ;
     }
 
     inorder(root.left);
     System.out.print(root.data+ " ");
     inorder(root.right);
 
    }
 
 public static void PrintInRange(Node root, int k1, int k2){
  if(root==null){
    return ;
  }

   if(root.data >=k1 && root.data<=k2){
    PrintInRange(root.left,k1,k2);
    System.out.print(root.data+ " ");
    PrintInRange(root.right,k1,k2);
   }

   else if(root.data>=k1){
    PrintInRange(root.left, k1, k2);
   }else{
    PrintInRange(root.right,k1,k2);
   }

 }

     public static void main(String[] args) {
         int values[]= {8,5,3,1,4,6,10,11,14};
         int k=5;
         Node root=null;
 
 
         for(int i=0; i<values.length; i++){
          root= insert(root, values[i]);
         }
 
     System.out.println("Balanaced seached trees :");
     inorder(root);
     System.out.println();
 
     System.out.println("Values between 5 and 12 : ");
     PrintInRange(root,5,12);

     }
 }
 