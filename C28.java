//removing cycle or loop from the Linke list 

public class C28 {
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

    public static Boolean hasCycle(Node head) {
        if (head == null || head.next == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;// cycle found
            }
        }
        return false;// no cycle
    }


    public static void removeCycle(Node head){
        // edge case
        if (head == null || head.next == null) {
            return  ;
        }


        Node slow = head;
        Node fast = head;
        Node prev=null;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                   slow =head;
                   while(slow!=fast){
                     prev= fast;
                     slow= slow.next;
                     fast= fast.next;
                   }
                   prev.next=null;
                   return ;

            }
        }

    }
    public static void main(String args[]) {
        Node head= new Node(1);
        head.next= new Node(2);
        head.next.next= new Node(3);
        head.next.next.next=new Node(4);
       head.next.next.next.next= head.next;// head.(null) and null(no cycle)
     
       System.out.println(hasCycle(head));
       removeCycle(head);
       System.out.println(hasCycle(head));

    }

}
