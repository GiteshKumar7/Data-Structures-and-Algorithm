//https://www.geeksforgeeks.org/problems/count-leaves-in-binary-tree/0
// finding the leaf node in Binary  trees

import java.util.*;
public class D13 {
    public static class Node{
        int data;
        Node left, right;
        Node(int data){
        this.data=data;
    }
}

// using the  list to store the nodes 
public static List<Integer> getleafNode(Node root,List<Integer> leaves){

    if(root==null){
        return leaves;
    }

    if(root.left ==null && root.right==null){
        leaves.add(root.data);
    }

    getleafNode(root.left, leaves);
    getleafNode(root.right, leaves);

    return  leaves;
}
    
    public static void main(String[] args) {
          Node root = new  Node(1);
        root.left =new Node(10);
        root.right = new Node(39);
        root.left.left= new Node(5);
        root.left.right = new Node(20);

        List<Integer> leaves= new ArrayList<>();
     List<Integer> s= getleafNode(root,  leaves);
     System.out.println(s);

    }
}
