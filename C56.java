// check the given linked lsit is palindrome or not
//https://www.geeksforgeeks.org/problems/check-if-linked-list-is-pallindrome/

// for string linnked list
import java.util.*;
public class C56 {
   public static class Node{
    String data;
    Node next;

    public Node(String data){
        this.data=data;
        this.next= null;
    }
   }
    
   public static boolean isPalindromeLL(Node head){
   // check the base case
   if(head==null || head.next==null){
    return true;
   }

   Stack<String> s= new Stack<>();
   Node curr= head;

   // pushing the stack
   while(curr!=null){
    s.push(curr.data);
  curr=curr.next;
   }

   // poping forom the stack
 curr= head;
   while(curr!=null){
       if(!curr.data.equals(s.pop())){
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
        // A->B->C->B->A
        Node head= new Node("A");
        head.next= new Node("B");
        head.next.next= new Node("C");
        head.next.next.next= new Node("B");
        head.next.next.next.next= new Node("A");

        print(head);
          System.out.println( isPalindromeLL(head));
        
    }
}
