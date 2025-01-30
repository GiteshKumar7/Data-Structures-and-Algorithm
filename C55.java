// check the given linked lsit is palindrome or not
//https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/0
// for integer linnked list
import java.util.*;
public class C55 {
   public static class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next= null;
    }
   }
    
   public static boolean isPalindromeLL(Node head){
   // check the base case
   if(head==null || head.next==null){
    return true;
   }

   Stack<Integer> s= new Stack<>();
   Node curr= head;

   // pushing the stack
   while(curr!=null){
    s.push(curr.data);
    curr=curr.next;
   }

   // poping forom the stack
 curr= head;
   while(curr!=null){
       if(curr.data!=s.pop()){
       // s.pop();
        return false;
       }
       curr= curr.next;
   }
   return true;
   }

   public static void print(Node head){
    Node temp= head;
    while(temp!=null){
      System.out.print(temp.data + "->");
      temp= temp.next;
    }
    System.out.println("Null");
    }
  



    public static void main(String[] args) {
        
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next= new Node(2);
        head.next.next.next.next= new Node(1);

         print(head);
          System.out.println( isPalindromeLL(head));
        
    }
}
