// leetcode 1474 delete N nodes after M node of the linked list
// GfG

public class C36{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;

  public static void linkdelete(Node head, int n, int m) {
        
        Node current = head;

        while (current != null) {
            // Skip M nodes
            for (int i = 1; i < m && current != null; i++) {
                current = current.next;
            }

            // If we've reached the end of the list, break
            if (current == null) {
                break;
            }

            // Start deleting N nodes
            Node temp = current.next;
            for (int i = 0; i < n && temp != null; i++) {
                temp = temp.next;
            }

            // Link the current node to the node after the deleted nodes
            current.next = temp;
            current = temp;
        } 
    }

    public static void print(Node head){
     Node temp = head;
     while(temp!=null){
        System.out.print(temp.data +"->");
        temp=  temp.next;
     }
     System.out.println("null");
    }

public static void main(String args[]) {
    
    Node head= new Node(9);
    head.next= new Node(1);
    head.next.next=new Node(3);
    head.next.next.next= new Node(5);
    head.next.next.next.next= new Node(9);
    head.next.next.next.next.next= new Node(4);
    head.next.next.next.next.next.next= new Node(10);
    head.next.next.next.next.next.next.next= new Node(1);
  
    System.out.println("Before the deleting ");
    print(head);
    linkdelete(head,1,2);
   System.out.println("delete N nodes after M node of the linked list :");
     print(head);

    //  C36 a= new C36();
    //  a.linkdelete(head, 1, 2);
    //  a.print(head);

}


}
