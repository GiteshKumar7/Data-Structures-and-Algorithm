

//middle of the linked list 
// using slow and fast  pointer
// using  tortoise nad hare algorithm


// Linked list  
// Head and Tail in LL
// Add first in LL
// print the ll

public class C24 {

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

    
    public static Node getMiddle(Node head) {
       // base case 
       if(head==null){
        return null;
       }

    Node slow= head;// tortoise 1 step at a time
    Node fast =head;// hare 2 step at a time

    while(fast!=null && fast.next!=null){
        slow= slow.next;
        fast= fast.next;
    }
    return slow;

    }

    public static void main(String args[]) {

        C24 ll = new C24();// class of the linked list

        ll.printList();
        ll.addfirst(2);
        ll.printList();
        ll.addfirst(1);
        ll.printList();
        ll.addLast(3);
        ll.printList();
        ll.addLast(4);
        ll.printList(); // 1->2->3->4
        ll.addLast(5);
        ll.printList(); // 1->2->3->4->5

       Node Midd =getMiddle(ll.head);
        if(Midd !=null){
            System.out.println("Middle Node is :" + Midd.data);
        }else{
            System.out.println("The list is empty");
        }

    }

}
