//size of largest BST in BT

import java.util.*;

public class D28 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
     
    // Information class
    public static class info {
        boolean isBST;
        int min,max,size;
         info(boolean isBST, int min, int max, int size){
            this.isBST= isBST;
            this.max= max;
            this.min= min;
            this.size= size;
         }
    }

    

    public static void main(String[] args) {
        // 50
        // / \
        // 30 60
        // / \ / \
        // 5 20 45 70
        // / \
        // 65 80
        //

        Node root = new Node(50);
        root.left = new Node(30);
        root.right = new Node(60);
        root.left.left = new Node(5);
        root.left.right = new Node(20);
        root.right.left = new Node(45);
        root.right.right = new Node(70);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(80);

        // 60
        // / \
        // 45 70
        // / \
        // 65 80
        // expected BST value = 5

    }

}
