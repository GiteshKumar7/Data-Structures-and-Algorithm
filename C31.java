//Zig Zag linked list

public class C31 {

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

       // Add a new node at the beginning of the list
       public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }


    // prinnt he linked list
    public static void print(){
      Node temp = head;
      while( temp != null){
        System.out.print(temp.data +"->");
        temp= temp.next;
      }
      System.out.println("null");

    }

    // finding the mid point of the linked list
     private static Node getMiddle(Node head){
       Node slow = head;
       Node fast= head.next;
       while(fast!=null && fast.next!=null){
        slow= slow.next;
        fast= fast.next.next;
       }
       return slow;

     }

     public static Node reverse(Node head){
         
             
            Node curr = head;
            Node prev= null;
            while(curr!=null){
               Node next = curr.next;
               curr.next= prev;
               prev= curr;
               curr = next ;
     
            }
            return prev;
          }
     
          // Zig -Zag rearrangement 
          public static  void ZigZag(Node head){
     
           if( head== null || head.next==null){
             return ; // nothing to arrange 
           }
             // get the middle first
            Node mid= getMiddle(head);
           
           
     
           Node left= head;
           Node right=  reverse( mid.next);
            mid.next= null;
            

       Node nextL, nextR ;
        while (left!= null && right != null ) {
           // intializaation
          nextL=left.next;
          nextR = right.next;
       

          // swap the nodes
          left.next= right;
          right.next= nextL;

          
    

            left = nextL;
            right = nextR;
       }
     }

     public static void main(String args[]){
   C31 ll= new C31();
  
   ll.addFirst(5);
   ll.addFirst(4);
   ll.addFirst(3);
   ll.addFirst(2);
   ll.addFirst(1);

   System.out.println("Original linked list :");
   ll.print();

   ll.ZigZag(head);

   
   System.out.println("Original linked list :");
   ll.print();

     }
}
