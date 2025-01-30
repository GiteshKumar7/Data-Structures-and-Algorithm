//merged sort in Linnked list;

import  java.util.*;
import java.util.LinkedList;
public class C30 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {// constructor
            this.data = data;
            this.next = null;
        }
    }

    // head in linked list
    public static Node head;
    // tail in linked list
    public static Node tail;

       // Add a new node at the beginning of the list
       public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // prinnt he linked list
    public static void print(){
      Node temp = head;
      while( temp != null){
        System.out.print(temp.data +"->");
        temp= temp.next;
      }
      System.out.println("null");

    }

    // finding the mid point of the linked list
     private static Node getMiddle(Node head){
       Node slow = head;
       Node fast= head.next;
       while(fast!=null && fast.next!=null){
        slow= slow.next;
        fast= fast.next.next;
       }
       return slow;

     }

     private static Node merge(Node right, Node left){
      
        Node mergedll= new Node(-1);
        Node temp = mergedll;

        while(right!=null && left!=null){
               if(right.data <=left.data){
                temp.next= right;
                right= right.next;
                temp = temp.next;
               }else{
                temp.next= left;
                left= left.next;
                temp = temp.next;
               }
        }

        while(right!=null){
            temp.next= right;
            right= right.next;
            temp = temp.next;
        }

        while(left!=null){
            temp.next= left;
            left= left.next;
            temp = temp.next;
        }

        return mergedll.next;

     } 


     public static Node mergedSort(Node head){
         //base case 
         if(head==null || head.next==null){
            return head;
         }


        // getting the middle
        Node mid= getMiddle(head);

        
        Node righthead= mid.next;
        mid.next=  null;
       
        // merge sort of the right and left half
        Node left= mergedSort(head);
        Node right= mergedSort(righthead);


        return merge(left, right);
     }


    public static void main(String args[]){
   
        C30 ll = new C30();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        


        ll.print();
        ll.head= ll.mergedSort(ll.head);
        ll.print();
    
    }
    
}

