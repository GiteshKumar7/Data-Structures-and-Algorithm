// iterative search in  ll


// Linked list  
// Head and Tail in LL
// Add first in LL
// print the ll

public class C18 {

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

    // iteratively searching on the node
   public int iterativeSearch(int key){
    Node temp = head;
    int i=0;
    while(temp!=null){
         if(temp.data==key){
            return i;
         }
         temp = temp.next;
         i++;
    }
    return -1;
   }

    public static void main(String args[]) {

        C18 ll = new C18();// class of the linked list

        ll.printList();
        ll.addfirst(2);
        ll.printList();
        ll.addfirst(1);
        ll.printList();
        ll.addLast(3);
        ll.printList();
        ll.addLast(4);
        ll.printList(); //1->2->3->4


      System.out.println( ll.iterativeSearch(3));
       System.out.println(ll.iterativeSearch(10));

    }

   
}
