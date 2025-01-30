// leetcode ->1721 Swapping Node in a Linked list 

public class C37 {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
  public static  Node head;
  public static Node tail;
  public static int  size;

  // method for swapping th linked list
        public static Node swapNodes(Node head, int k) {
            
          Node curr= head;
          while(curr!=null){
            for(int i=1; i<k; i++){
                curr=curr.next;
            }
    
            Node a=curr;
            Node b=head;
    
            while(curr!=null &&curr.next!=null){
                curr=curr.next;
                b=b.next;
            }
    
            int temp= a.data;
            a.data=b.data;
            b.data=temp;
        }
            return head;
        
        }
  // method to print the linked list
    public static void print(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"-> ");
            temp= temp.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next=new Node(3);
        head.next.next.next= new Node(4);
        head.next.next.next.next= new Node(5);

        System.out.println("before swaping in Linked list:");
        print(head);

       Node h=  swapNodes(head,2);
       System.out.println("after swpping in linned list :");
        print(head);

        }
    
}
