// leetcode 141  Detecting the cycle in the linked list
// using floyd's cycle finding algorithm


public class C26 {

    // creation of the node
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





    public static Boolean hasCycle(Node head){
     
        Node slow= head;
        Node fast=head;

        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
            if(fast==slow){
                return true;
            }
        }
    return false;

    }

     public static void main(String args[]){

     Node head=new Node(1);
      head.next= new Node(2);
      head.next.next= new Node(3);
      head.next.next.next= new Node(4);
      head.next.next.next.next= head.next;// head cycle and null no cycle
  
      //1->2->3->4->1 // cycle
      //1->2->3->4->2 // cycle


  System.out.println(hasCycle(head));


     }

}
