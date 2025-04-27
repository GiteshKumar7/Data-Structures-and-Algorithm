//https://www.geeksforgeeks.org/problems/array-to-bst4443/1
//https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/description/
//Sorted array to Balanced BST

public class D26 {
    public static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }

    // function find the balanced array to sorted array
    public static Node SortedArrayToBalancedArray(int arr[], int st, int end) {
        // base case
        if (st > end) {
            return null;
        }

        int mid = (st + end)/2;
        Node root = new Node(arr[mid]);
        root.left = SortedArrayToBalancedArray(arr, st, mid - 1);
        root.right = SortedArrayToBalancedArray(arr, mid + 1, end);
        return root;
    }

    // preorder traversal
    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        preOrder(root.left);
        System.out.print(root.data+ " ");
        preOrder(root.right);
    }

    public static void main(String[] args) {
        int arr[] = { 3, 5, 6, 8, 10, 11, 12 };

       Node root= SortedArrayToBalancedArray(arr, 0, arr.length - 1);
       System.out.println("The inorder sequence of Balanced Bst :");
        preOrder(root);

    }
}
