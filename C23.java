
//middle of the linked list brute force Approach


// Linked list  
// Head and Tail in LL
// Add first in LL
// print the ll

public class C23 {

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

        Node temp = head;

        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }

        int middleNode = (count / 2) + 1;
        temp = head;

        while (temp != null) {
            middleNode--;
            if (middleNode == 0) {
                break;
            }
            temp = temp.next;
        }
       
       return temp;
    }

    public static void main(String args[]) {

        C23 ll = new C23();// class of the linked list

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
