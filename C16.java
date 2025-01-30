// Linked list  
// Head and Tail in LL
// Add first in LL
// add elemnt at middle
// size of ll

public class C16 {

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
    // to get the size of the ll
    public static int size;

    // add first in the linkedlist
    public void addfirst(int data) {

        // creation of the new node
        Node newNode = new Node(data);
        size++;
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
        size++;
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

    // add elemt in the middle(index, data)
    public void addAtMiddle(int idx, int data) {

        // invalid index
        if (idx < 0) {
            System.out.println("Invalid index");
            return;
        }

        // if index is 0, then add at the begining
        // base case
        if (idx == 0) {
            addfirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i= idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;

        if (newNode.next == null) {
            tail = newNode;
        }

    }

    public static void main(String args[]) {

        C16 ll = new C16();// class of the linked list

        ll.addfirst(2);
        ll.addfirst(1);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println("Original list");
        ll.printList();
        System.out.println(ll.size);// 1->2->4->5


        ll.addAtMiddle(2, 9);
        System.out.println("after adding at the middle at index 2 or any :");
        ll.printList();

        System.out.println(ll.size); // 1->2->3->4->5

    }
}
