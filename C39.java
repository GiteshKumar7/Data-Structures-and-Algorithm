//  21. Leetcode  Merge two Sorted Lists
//https://leetcode.com/problems/merge-two-sorted-lists/description/

import java.util.Collection;
import java.util.ArrayList;

public class C39 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    public static Node head;
    public  static Node tail;
    public static int size;

    public static Node MergeTwoSortedLists(Node head1, Node head2){
       
       
        Node dummy = new Node(-1);
        Node t1= head1;
        Node t2= head2;
        Node temp= dummy;

        while(t1!=null && t2!=null){
            if(t1.data< t2.data){
                temp.next =t1;
                temp= t1;
                t1=t1.next;
            }else{
                temp.next= t2;
                temp =t2;
                t2= t2.next;
            }
        }
        

        if(t1!=null){
            temp.next =t1;
            temp= t1;
            t1=t1.next;
        }
        if(t2!=null){
            temp.next= t2;
                temp =t2;
                t2= t2.next;
        }

        return dummy.next;

    }



    public static void print(Node head){

        Node temp= head;
        while(temp!=null){
           System.out.print(temp.data +"-> ");
           temp= temp.next;
        }
        System.out.println("Null");
   
       }
   
    public static void main(String[] args) {
         Node head1= new Node(2);
  head1.next= new Node(4);
  head1.next.next= new Node(8);
  head1.next.next.next= new Node(10);

  Node head2= new Node(1);
  head2.next= new Node(3);
  head2.next.next= new Node(3);
  head2.next.next.next= new Node(6);
  head2.next.next.next.next= new Node(11);
  head2.next.next.next.next.next= new Node(14);


  System.out.println("before  merge two sorted  ll :");
  print(head1);
  print(head2);

   Node ll= MergeTwoSortedLists(head1, head2);
   System.out.println("After merge two sorted  ll : ");
    print(ll);


    }
    
}
