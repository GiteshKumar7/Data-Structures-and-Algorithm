
// recursive  search in  ll


// Linked list  
// Head and Tail in LL
// Add first in LL
// print the ll

public class C19 {

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
  
    public int helper(Node head, int key){
         if(head== null){
            return -1;
         }
         if(head.data== key){
            return 0;
         }

      int idx= helper(head.next, key);
      if(idx == -1){
        return -1;
      }

      return idx+1;

    }

  public int resSearch(int key){
       return helper(head, key);
  }

    public static void main(String args[]) {

        C19 ll = new C19();// class of the linked list

        ll.printList();
        ll.addfirst(2);
        ll.printList();
        ll.addfirst(1);
        ll.printList();
        ll.addLast(3);
        ll.printList();
        ll.addLast(4);
        ll.printList(); //1->2->3->4


      System.out.println( ll.resSearch(3));
       System.out.println(ll.resSearch(10));

    }

   
}
