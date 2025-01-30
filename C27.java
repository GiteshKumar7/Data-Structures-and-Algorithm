//142 Linked list cycle ||
// to get the first node of the cycle ,
// we can use Floyd's cycle-finding algorithm (also known as the "tortoise and


public class C27 {

          
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


    public static Node StartingNodeOfCycle(Node head){
        if(head==null || head.next==null){
            return null;
        }


        Node  slow= head;
        Node fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast){
                  slow= head;
                  while(slow!=fast){
                    slow= slow.next;
                    fast= fast.next;
                   
                  }
                  return slow;// node where cycle starts
            }
        }

     return null;

    }




    public static void main (String args[]){
      Node head= new Node(1);
      head.next= new Node(2);
      head.next.next= new Node(3);
      head.next.next.next=new Node(4);
     head.next.next.next.next= head;// head.next(cycle) and null(no cycle)
     

    Node cycleStart= StartingNodeOfCycle(head);
   
    if(cycleStart !=null){
    System.out.println("the starting Node :" +cycleStart.data);
    }else{
    System.out.println("No cycle detected in linked list");
    }
    
 }
}
