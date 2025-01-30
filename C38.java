// leetcode 328 Odd Even linked list
// using fast pointer 

public class C38 {

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


    public static Node oddEvenLL(Node head){

        if(head==null || head.next==null){
            return head;
        }

           Node odd= head;
           Node even = head.next;
           Node evenHead = head.next;

           while(even!=null && even.next!=null ){
              odd.next= odd.next.next;
              even.next= even.next.next;


              odd= odd.next;
              even= even.next;

           }

           odd.next= evenHead;
           return head;

    }

    public static void print(Node head){

     Node temp= head;
     while(temp!=null){
        System.out.print(temp.data +"-> ");
        temp= temp.next;
     }
     System.out.println("Null");

    }

    public static void main(String args[]){

  Node head= new Node(2);
  head.next= new Node(3);
  head.next.next= new Node(1);
  head.next.next.next= new Node(4);
  head.next.next.next.next= new Node(5);
  head.next.next.next.next.next= new Node(6);


  System.out.println("before odd even ll :");
  print(head);
  
    oddEvenLL(head);

    System.out.println("After odd even ll : ");
    print(head);


    // // practice ways 
    // C38 a= new C38();
    // a.oddEvenLL(head);
    // print(head);

    }
}
