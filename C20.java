// reverse a linkedlist ->O(n)

// recursive  search in  ll


// Linked list  
// Head and Tail in LL
// Add first in LL
// print the ll

public class C20 {

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
  
    public void reverse(){
    Node prev= null;
    Node curr= head;
    Node next;

    while(curr!=null){
        next=curr.next;
        curr.next=prev;
        prev= curr;
        curr= next;
    }
    head= prev;

    }


   


    public static void main(String args[]) {

        C20 ll = new C20();// class of the linked list

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


        ll.reverse();
        System.out.println("after the reversing the linnked list :");
        ll.printList();


        
    }

   
}
