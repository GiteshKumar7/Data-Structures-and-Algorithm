// recursive reversse function of the liked list

public class C21 {

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

    // add first in the linkedlist
    public void addfirst(int data) {

    


    

        // creation of the new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // new node next == head
        newNode.next = head;

        // head = newNode
        head = newNode;
    }

    // new node creation in the last of last
    public void addLast(int data) {

        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public void printList() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }
  


    public static Node  reverseLinkedList(Node head){
        if( head==null || head.next==null){
            return head;
        }

        Node newHead= reverseLinkedList(head.next);
        Node front = head.next;
        front.next= head;
        head.next=null;
        return newHead;


    }


    public static void main(String args[]) {

        C21 ll = new C21();// class of the linked list

        ll.printList();
        ll.addfirst(2);
        ll.printList();
        ll.addfirst(1);
        ll.printList();
        ll.addLast(3);
        ll.printList();
        ll.addLast(4);
        ll.printList(); //1->2->3->4
        ll.addLast(5);

        System.out.println("Before reversing the linked list ");
        ll.printList(); //1->2->3->4->5


         ll.head= reverseLinkedList(ll.head);
        System.out.println("after the reversing the linnked list :");
        ll.printList();

    }

   
}


